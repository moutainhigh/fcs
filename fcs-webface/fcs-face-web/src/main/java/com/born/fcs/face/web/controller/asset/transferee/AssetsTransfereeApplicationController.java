package com.born.fcs.face.web.controller.asset.transferee;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.born.fcs.am.ws.enums.AssetStatusEnum;
import com.born.fcs.am.ws.info.transferee.FAssetsTransfereeApplicationInfo;
import com.born.fcs.am.ws.order.transferee.FAssetsTransfereeApplicationOrder;
import com.born.fcs.am.ws.order.transferee.FAssetsTransfereeApplicationQueryOrder;
import com.born.fcs.face.integration.exception.ExceptionFactory;
import com.born.fcs.face.integration.session.SessionLocal;
import com.born.fcs.face.integration.util.ShiroSessionUtils;
import com.born.fcs.face.web.controller.base.WorkflowBaseController;
import com.born.fcs.face.web.util.PageUtil;
import com.born.fcs.pm.util.StringUtil;
import com.born.fcs.pm.ws.enums.BooleanEnum;
import com.born.fcs.pm.ws.enums.FeeTypeEnum;
import com.born.fcs.pm.ws.enums.FormCodeEnum;
import com.born.fcs.pm.ws.enums.base.FcsResultEnum;
import com.born.fcs.pm.ws.info.common.FormInfo;
import com.born.fcs.pm.ws.info.common.ProjectSimpleDetailInfo;
import com.born.fcs.pm.ws.info.fund.FRefundApplicationFeeInfo;
import com.born.fcs.pm.ws.info.fund.FRefundApplicationInfo;
import com.born.fcs.pm.ws.result.base.FormBaseResult;
import com.born.fcs.pm.ws.result.base.QueryBaseBatchResult;

@Controller
@RequestMapping("assetMg/transferee")
public class AssetsTransfereeApplicationController extends WorkflowBaseController {
	
	final static String vm_path = "/assetMg/receiveAssignment/";
	
	@Override
	protected String[] getDateInputDayNameArray() {
		return new String[] { "transfereeTime", "liquidateTime" };
	}
	
	/**
	 * 资产受让申请单列表
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping("list.htm")
	public String list(FAssetsTransfereeApplicationQueryOrder queryOrder, Model model) {
		try {
			if (queryOrder == null)
				queryOrder = new FAssetsTransfereeApplicationQueryOrder();
			setSessionLocalInfo2Order(queryOrder);
			
			model.addAttribute("isBusiManager", isBusiManager() || isLegalManager());
			if (StringUtil.isEmpty(queryOrder.getSortCol())) {
				queryOrder.setSortCol("form_add_time");
				queryOrder.setSortOrder("DESC");
			}
			QueryBaseBatchResult<FAssetsTransfereeApplicationInfo> batchResult = assetsTransfereeApplicationServiceClient
				.query(queryOrder);
			//			List<FAssetsTransfereeApplicationInfo> listInfo = batchResult.getPageList();
			//			for (FAssetsTransfereeApplicationInfo fAssetsTransfereeApplicationInfo : listInfo) {
			//				if (fAssetsTransfereeApplicationInfo.getProjectCode() != null) {
			//					fAssetsTransfereeApplicationInfo
			//						.setProjectName("内部项目：" + fAssetsTransfereeApplicationInfo.getProjectName());
			//				} else {
			//					fAssetsTransfereeApplicationInfo
			//						.setProjectName("外部项目：" + fAssetsTransfereeApplicationInfo.getProjectName());
			//				}
			//			}
			model.addAttribute("conditions", queryOrder);
			model.addAttribute("page", PageUtil.getCovertPage(batchResult));
			model.addAttribute("assetStatus", AssetStatusEnum.getAllEnum());
		} catch (Exception e) {
			logger.error("查询资产受让申请单列表出错");
		}
		
		return vm_path + "receiveList.vm";
	}
	
	/**
	 * 查看资产受让详情
	 * 
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("view.htm")
	public String view(long formId, Model model) {
		FormInfo form = formServiceAmClient.findByFormId(formId);
		
		if (form == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "表单不存在");
		}
		FAssetsTransfereeApplicationInfo info = assetsTransfereeApplicationServiceClient
			.findByFormId(formId);
		
		model.addAttribute("info", info);
		model.addAttribute("form", form);
		model.addAttribute("isView", "true");//是否详情
		return vm_path + "receiveView.vm";
	}
	
	/**
	 * 编辑资产受让
	 * 
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("edit.htm")
	public String edit(long formId, Model model) {
		FormInfo form = formServiceAmClient.findByFormId(formId);
		
		if (form == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "表单不存在");
		}
		FAssetsTransfereeApplicationInfo info = assetsTransfereeApplicationServiceClient
			.findByFormId(formId);
		
		model.addAttribute("info", info);
		model.addAttribute("form", form);
		
		model.addAttribute("isEdit", "true");//是否编辑
		
		return vm_path + "receiveAdd.vm";
	}
	
	/**
	 * 新增资产转让
	 * 
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("add.htm")
	public String add(String projectCode, Model model) {
		ProjectSimpleDetailInfo projectInfo = projectServiceClient
			.querySimpleDetailInfo(projectCode);
		
		model.addAttribute("projectInfo", projectInfo);
		
		return vm_path + "receiveAdd.vm";
	}
	
	/**
	 * 去新增资产受让
	 * 
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("toAdd.htm")
	public String toAdd(Model model) {
		
		return vm_path + "receiveAdd.vm";
	}
	
	/**
	 * 保存
	 * 
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("save.htm")
	@ResponseBody
	public JSONObject save(HttpServletRequest request, HttpServletResponse response,
							FAssetsTransfereeApplicationOrder order, Model model) {
		String tipPrefix = "保存资产受让申请单";
		JSONObject jsonObject = new JSONObject();
		try {
			SessionLocal sessionLocal = ShiroSessionUtils.getSessionLocal();
			
			if (sessionLocal == null) {
				jsonObject.put("success", false);
				jsonObject.put("message", "您未登陆或登陆已失效");
				return jsonObject;
			}
			// 初始化Form验证信息
			FormBaseResult result = null;
			order.setCheckIndex(0);
			order.setFormId(order.getFormId());
			order.setFormCode(FormCodeEnum.ASSETS_TRANSFEREE_APPLICATION);
			order.setUserId(sessionLocal.getUserId());
			order.setUserName(sessionLocal.getRealName());
			order.setUserAccount(sessionLocal.getUserName());
			//			setSessionLocalInfo2Order(order);
			result = assetsTransfereeApplicationServiceClient.save(order);
			jsonObject = toJSONResult(jsonObject, result, "提交资产受让申请单成功", null);
			jsonObject.put("formId", result.getFormInfo().getFormId());
			
			if (result.isSuccess() && order.getCheckStatus() == 1) {
				jsonObject.put("success", true);
				jsonObject.put("status", "SUBMIT");
				jsonObject.put("message", "提交成功");
			} else if (result.isSuccess() && order.getCheckStatus() == 0) {
				jsonObject.put("success", true);
				jsonObject.put("status", "hold");
				jsonObject.put("message", "暂存成功");
			} else {
				jsonObject.put("success", false);
				jsonObject.put("message", result.getMessage());
			}
		} catch (Exception e) {
			jsonObject = toJSONResult(tipPrefix, e);
			logger.error(tipPrefix, e);
		}
		
		return jsonObject;
	}
	
	/**
	 * 资产受让申请单审核
	 *
	 * @param formId
	 * @param model
	 * @return
	 */
	
	@RequestMapping("audit.htm")
	public String audit(long formId, String toPage, HttpServletRequest request, Integer toIndex,
						Model model, HttpSession session) {
		FormInfo form = formServiceAmClient.findByFormId(formId);
		
		if (form == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "表单不存在");
		}
		// SessionLocal sessionLocal = ShiroSessionUtils.getSessionLocal();
		FAssetsTransfereeApplicationInfo info = assetsTransfereeApplicationServiceClient
			.findByFormId(formId);
		
		model.addAttribute("info", info);
		model.addAttribute("currPage", toPage);
		
		model.addAttribute("form", form);// 表单信息
		model.addAttribute("formCode", form.getFormCode());
		
		if (toIndex == null)
			toIndex = 0;
		model.addAttribute("toIndex", toIndex);
		//WebNodeInfo nodeInfo = initWorkflow(model, form, request.getParameter("taskId"));
		//if(nodeInfo.getFormUrl())
		initWorkflow(model, form, request.getParameter("taskId"));
		
		return vm_path + "receiveView.vm";
	}
	
	/**
	 * 关闭系统消息
	 *
	 * @param projectCode
	 * @param model
	 * @return
	 */
	@RequestMapping("closeMessage.htm")
	@ResponseBody
	public JSONObject stopSell(long formId, Model model) {
		FormInfo form = formServiceAmClient.findByFormId(formId);
		
		if (form == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "表单不存在");
		}
		JSONObject result = new JSONObject();
		FAssetsTransfereeApplicationInfo info = assetsTransfereeApplicationServiceClient
			.findByFormId(formId);
		if (info.getIsCloseMessage() != BooleanEnum.IS) {
			int num = assetsTransfereeApplicationServiceClient.updateIsColseMessage(info.getId());
			if (num > 0) {
				result.put("success", true);
				result.put("message", "终止系统消息推送成功");
			} else {
				result.put("false", false);
				result.put("message", "终止系统消息推送失败");
			}
		} else {
			result.put("success", true);
			result.put("message", "已关闭系统消息");
		}
		return result;
	}
	
	/**
	 * 检查外部项目名称 是否重复
	 *
	 * @param companyName
	 * @param model
	 * @return
	 */
	@RequestMapping("checkOuterProjectName.htm")
	@ResponseBody
	public JSONObject checkOuterProjectName(String projectName, Model model) {
		String tipPrefix = "检查外部项目名称是否重复";
		JSONObject result = new JSONObject();
		try {
			long count = assetsTransfereeApplicationServiceClient
				.findByOuterProjectNameCount(projectName);
			if (count > 0) {
				result.put("success", true);
				result.put("message", "该外部项目名称已存在");
				
			} else {
				result.put("success", false);
				result.put("message", "该外部项目名称可用");
			}
		} catch (Exception e) {
			result = toJSONResult(tipPrefix, e);
			logger.error(tipPrefix, e);
		}
		return result;
	}
	
	/**
	 * 打印
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("print.htm")
	public String print(long formId, Model model) {
		FormInfo form = formServiceAmClient.findByFormId(formId);
		if (form == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "表单不存在");
		}
		FRefundApplicationInfo info = refundApplicationServiceClient
			.findRefundApplicationByFormId(formId);
		
		ProjectSimpleDetailInfo projectInfo = projectServiceClient.querySimpleDetailInfo(info
			.getProjectCode());
		model.addAttribute("projectInfo", projectInfo);
		
		List<FRefundApplicationFeeInfo> feeInfoList = refundApplicationServiceClient
			.findByRefundId(info.getRefundId());
		model.addAttribute("feeType", FeeTypeEnum.getAllEnum());
		model.addAttribute("info", info);
		model.addAttribute("form", form);
		
		model.addAttribute("feeInfoList", feeInfoList);
		
		return vm_path + "receiveView.vm";
	}
	
}
