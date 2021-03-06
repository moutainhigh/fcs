package com.born.fcs.pm.biz.service.file;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.born.fcs.pm.dataobject.FileFormDO;
import com.born.fcs.pm.util.StringUtil;
import com.born.fcs.pm.ws.order.file.FileOrder;
import com.born.fcs.pm.ws.service.file.FileService;
import com.yjf.common.lang.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rop.thirdparty.com.google.common.collect.Maps;

import com.born.fcs.pm.biz.service.base.BaseProcessService;
import com.born.fcs.pm.dal.dataobject.FFileDO;
import com.born.fcs.pm.dal.dataobject.FFileInputListDO;
import com.born.fcs.pm.dal.dataobject.FFileListDO;
import com.born.fcs.pm.domain.context.FcsPmDomainHolder;
import com.born.fcs.pm.integration.bpm.result.WorkflowResult;
import com.born.fcs.pm.ws.enums.FileStatusEnum;
import com.born.fcs.pm.ws.enums.FileTypeEnum;
import com.born.fcs.pm.ws.info.common.FormInfo;
import com.born.fcs.pm.ws.order.bpm.WorkflowStartOrder;
import com.born.fcs.pm.ws.order.common.SimpleUserInfo;
import com.born.fcs.pm.ws.order.common.WorkFlowBeforeProcessOrder;
import com.born.fcs.pm.ws.result.base.FcsBaseResult;

/**
 * 文档入库流程处理
 *
 * @author heh
 *
 * 2016-4-23 下午1:46:05
 */
@Service("fileInputApplyProcessService")
public class FileInputProcessServiceImpl extends BaseProcessService {

	@Autowired
	FileService fileService;
	
	@Override
	public Map<String, String> makeMessageVar(FormInfo formInfo) {
		Map<String, String> vars = Maps.newHashMap();
		FFileDO baseFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		FFileDO managenmentFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		
		FFileDO titleFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		FFileDO commonFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_COMMON.code());//风险常规卷
		FFileDO lawsuitFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_LAWSUIT.code());//风险诉讼卷
		String fileCode = "";
		if (baseFileDO != null) {
			fileCode = fileCode + baseFileDO.getFileCode() + ",";
		}
		if (managenmentFileDO != null) {
			fileCode = fileCode + managenmentFileDO.getFileCode() + ",";
		}
		if (titleFileDO != null) {
			fileCode = fileCode + titleFileDO.getFileCode() + ",";
		}
		if (commonFileDO != null) {
			fileCode = fileCode + commonFileDO.getFileCode() + ",";
		}
		if (lawsuitFileDO != null) {
			fileCode = fileCode + lawsuitFileDO.getFileCode() + ",";
		}
		vars.put("档案编号", fileCode.substring(0, fileCode.length() - 1));
		return vars;
	}
	
	@Override
	public FcsBaseResult startBeforeProcess(WorkFlowBeforeProcessOrder order) {
		FcsBaseResult result = new FcsBaseResult();
		try {
			FFileDO baseFileDO = fileDAO.findByFormId(order.getFormInfo().getFormId(),
				FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
			FFileDO managenmentFileDO = fileDAO.findByFormId(order.getFormInfo().getFormId(),
				FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
			
			FFileDO titleFileDO = fileDAO.findByFormId(order.getFormInfo().getFormId(),
				FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
			
			FFileDO commonFileDO = fileDAO.findByFormId(order.getFormInfo().getFormId(),
				FileTypeEnum.RISK_COMMON.code());//风险常规卷
			FFileDO lawsuitFileDO = fileDAO.findByFormId(order.getFormInfo().getFormId(),
				FileTypeEnum.RISK_LAWSUIT.code());//风险诉讼卷
			//自定义待办任务名称
			WorkflowStartOrder startOrder = (WorkflowStartOrder) FcsPmDomainHolder.get()
				.getAttribute("startOrder");
			if (startOrder != null) {
				if (baseFileDO != null) {
					startOrder.setCustomTaskName(baseFileDO.getProjectName() + "-入库申请");
				}
				if (managenmentFileDO != null) {
					startOrder.setCustomTaskName(managenmentFileDO.getProjectName() + "-入库申请");
				}
				if (titleFileDO != null) {
					startOrder.setCustomTaskName(titleFileDO.getProjectName() + "-入库申请");
				}
				if (commonFileDO != null) {
					startOrder.setCustomTaskName(commonFileDO.getProjectName() + "-入库申请");
				}
				if (lawsuitFileDO != null) {
					startOrder.setCustomTaskName(lawsuitFileDO.getProjectName() + "-入库申请");
				}
				
			}
			result.setSuccess(true);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(e.getMessage());
			logger.error("入库申请流程启动前置处理出错 ： {}", e);
		}
		return result;
	}
	
	@Override
	public void startAfterProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		// 启动流程后业务处理(BASE)
		final Date nowDate = FcsPmDomainHolder.get().getSysDate();
		long userId = workflowResult.getCreatorId();
		String userName = workflowResult.getCreator();
		String dept = workflowResult.getStartOrgName();
		String deptCode = formInfo.getDeptCode();
		
		//提交后修改目录明细为已归档
		FFileDO baseFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		if (baseFileDO != null) {
			 List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(baseFileDO.getFileId());
			 updateFileListNo(inputListDOs,baseFileDO.getFileCode(),formInfo.getFormId());
			baseFileDO.setHandOverManId(userId);
			baseFileDO.setHandOverMan(userName);
			baseFileDO.setHandOverDeptCode(deptCode);
			baseFileDO.setHandOverDept(dept);
			baseFileDO.setHandOverTime(nowDate);
			baseFileDO.setFilingTime(nowDate);
			fileDAO.update(baseFileDO);
			//更新档案项目操作时间
			updateTime(baseFileDO.getFileId());
		}
		
		FFileDO managenmentFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		if (managenmentFileDO != null) {
			List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(managenmentFileDO.getFileId());
			updateFileListNo(inputListDOs,managenmentFileDO.getFileCode(),formInfo.getFormId());
			managenmentFileDO.setHandOverManId(userId);
			managenmentFileDO.setHandOverMan(userName);
			managenmentFileDO.setHandOverDeptCode(deptCode);
			managenmentFileDO.setHandOverDept(dept);
			managenmentFileDO.setHandOverTime(nowDate);
			managenmentFileDO.setFilingTime(nowDate);
			fileDAO.update(managenmentFileDO);
			//更新档案项目操作时间
			updateTime(managenmentFileDO.getFileId());
		}
		
		FFileDO titleFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		if (titleFileDO != null) {
			List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(titleFileDO.getFileId());
			updateFileListNo(inputListDOs,titleFileDO.getFileCode(),formInfo.getFormId());
			titleFileDO.setHandOverManId(userId);
			titleFileDO.setHandOverMan(userName);
			titleFileDO.setHandOverDeptCode(deptCode);
				titleFileDO.setHandOverDept(dept);
			titleFileDO.setHandOverTime(nowDate);
			titleFileDO.setFilingTime(nowDate);
			fileDAO.update(titleFileDO);
			//更新档案项目操作时间
			updateTime(titleFileDO.getFileId());
		}
		FFileDO commonFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_COMMON.code());//风险常规卷
		if (commonFileDO != null) {
			List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(commonFileDO.getFileId());
			updateFileListNo(inputListDOs,commonFileDO.getFileCode(),formInfo.getFormId());
			commonFileDO.setHandOverManId(userId);
			commonFileDO.setHandOverMan(userName);
			commonFileDO.setHandOverDeptCode(deptCode);
			commonFileDO.setHandOverDept(dept);
			commonFileDO.setHandOverTime(nowDate);
			commonFileDO.setFilingTime(nowDate);
			fileDAO.update(commonFileDO);
			//更新档案项目操作时间
			updateTime(commonFileDO.getFileId());
		}
		FFileDO lawsuitFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_LAWSUIT.code());//风险诉讼卷
		if (lawsuitFileDO != null) {
			 List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(lawsuitFileDO.getFileId());
			updateFileListNo(inputListDOs,lawsuitFileDO.getFileCode(),formInfo.getFormId());
			lawsuitFileDO.setHandOverManId(userId);
			lawsuitFileDO.setHandOverMan(userName);
			lawsuitFileDO.setHandOverDeptCode(deptCode);
			lawsuitFileDO.setHandOverDept(dept);
			lawsuitFileDO.setHandOverTime(nowDate);
			lawsuitFileDO.setFilingTime(nowDate);
			fileDAO.update(lawsuitFileDO);
			//更新档案项目操作时间
			updateTime(lawsuitFileDO.getFileId());
		}

	}
	
	@Override
	public FcsBaseResult doNextBeforeProcess(WorkFlowBeforeProcessOrder order) {
		FcsBaseResult result = createResult();
		result.setSuccess(true);
		return result;
	}
	
	@Override
	public void doNextAfterProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		// 审核后业务处理(BASE)
		//        if(workflowResult.getStatus().code().equals(WorkflowStatusEnum.STATUS_REJECT.code())){//驳回
		//            FFileDO baseFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		//            if(baseFileDO!=null){
		//                List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(baseFileDO.getFileId());
		//                updateFileListNotArchive(inputListDOs);
		//            }
		//
		//            FFileDO managenmentFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		//            if(managenmentFileDO!=null){
		//                List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(managenmentFileDO.getFileId());
		//                updateFileListNotArchive(inputListDOs);
		//            }
		//
		//            FFileDO titleFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		//            if(titleFileDO!=null){
		//                List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(titleFileDO.getFileId());
		//                updateFileListNotArchive(inputListDOs);
		//            }
		//        }
	}
	
	@Override
	public void endFlowProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		// 结束流程后业务处理(BASE)
		final Date nowDate = FcsPmDomainHolder.get().getSysDate();
		SimpleUserInfo currentUser = (SimpleUserInfo) FcsPmDomainHolder.get().getAttribute(
			"currentUser");
		//Map<String, Object> customizeMap = workflowResult.getCustomizeMap();
		long userId = currentUser.getUserId();
		String userName = currentUser.getUserName();
		String dept = currentUser.getDeptName();
		String deptCode = currentUser.getDeptCode();
		FFileDO baseFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		if (baseFileDO != null) {
			List<FFileInputListDO> inputListDOs = fileInputListDAO.findByFileId(baseFileDO
				.getFileId());
			updateFileListStatus(inputListDOs,baseFileDO.getFileCode());
			baseFileDO.setReceiveManId(userId);
			baseFileDO.setReceiveMan(userName);
			baseFileDO.setReceiveDeptCode(deptCode);
			baseFileDO.setReceiveDept(dept);
			baseFileDO.setReceiveTime(nowDate);
			fileDAO.update(baseFileDO);
			//更新档案项目操作时间
			updateTime(baseFileDO.getFileId());
		}
		FFileDO managenmentFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		if (managenmentFileDO != null) {
			List<FFileInputListDO> inputListDOs = fileInputListDAO.findByFileId(managenmentFileDO
				.getFileId());
			updateFileListStatus(inputListDOs,managenmentFileDO.getFileCode());
			managenmentFileDO.setReceiveManId(userId);
			managenmentFileDO.setReceiveMan(userName);
			managenmentFileDO.setReceiveDeptCode(deptCode);
			managenmentFileDO.setReceiveDept(dept);
			managenmentFileDO.setReceiveTime(nowDate);
			fileDAO.update(managenmentFileDO);
			//更新档案项目操作时间
			updateTime(managenmentFileDO.getFileId());
		}
		FFileDO titleFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		if (titleFileDO != null) {
			List<FFileInputListDO> inputListDOs = fileInputListDAO.findByFileId(titleFileDO
				.getFileId());
			updateFileListStatus(inputListDOs,titleFileDO.getFileCode());
			titleFileDO.setReceiveManId(userId);
			titleFileDO.setReceiveMan(userName);
			titleFileDO.setReceiveDeptCode(deptCode);
			titleFileDO.setReceiveDept(dept);
			titleFileDO.setReceiveTime(nowDate);
			fileDAO.update(titleFileDO);
			//更新档案项目操作时间
			updateTime(titleFileDO.getFileId());
		}
		
		FFileDO commonFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_COMMON.code());//风险常规卷
		if (commonFileDO != null) {
			List<FFileInputListDO> inputListDOs = fileInputListDAO.findByFileId(commonFileDO
				.getFileId());
			updateFileListStatus(inputListDOs,commonFileDO.getFileCode());
			commonFileDO.setReceiveManId(userId);
			commonFileDO.setReceiveMan(userName);
			commonFileDO.setReceiveDeptCode(deptCode);
			commonFileDO.setReceiveDept(dept);
			commonFileDO.setReceiveTime(nowDate);
			fileDAO.update(commonFileDO);
			//更新档案项目操作时间
			updateTime(commonFileDO.getFileId());
		}
		
		FFileDO lawsuitFileDO = fileDAO.findByFormId(formInfo.getFormId(),
			FileTypeEnum.RISK_LAWSUIT.code());//风险诉讼卷
		if (lawsuitFileDO != null) {
			List<FFileInputListDO> inputListDOs = fileInputListDAO.findByFileId(lawsuitFileDO
				.getFileId());
			updateFileListStatus(inputListDOs,lawsuitFileDO.getFileCode());
			lawsuitFileDO.setReceiveManId(userId);
			lawsuitFileDO.setReceiveMan(userName);
			lawsuitFileDO.setReceiveDeptCode(deptCode);
			lawsuitFileDO.setReceiveDept(dept);
			lawsuitFileDO.setReceiveTime(nowDate);
			fileDAO.update(lawsuitFileDO);
			//更新档案项目操作时间
			updateTime(lawsuitFileDO.getFileId());
		}
	}
	
	public void updateFileListStatus(List<FFileInputListDO> inputListDOs,String fileCode) {
		if (inputListDOs.size() > 0) {
			for (FFileInputListDO listDO : inputListDOs) {
				listDO.setStatus(FileStatusEnum.INPUT.code());
				fileInputListDAO.update(listDO);
			}
		}
	}

	public void updateFileListNo(List<FFileInputListDO> inputListDOs,String fileCode,long formId) {
//		Long maxNo=extraDAO.searchMaxNoWithFileCode(fileCode);
//		if(maxNo==null){
//			maxNo=0l;
//		}
//		maxNo=maxNo+1;
//		if (inputListDOs.size() > 0) {
//			for (FFileInputListDO listDO : inputListDOs) {
//				if(StringUtil.isBlank(listDO.getNo())){
//				listDO.setNo(StringUtil.leftPad(String.valueOf(maxNo), 3, "0"));
//				fileInputListDAO.update(listDO);
//				maxNo=maxNo+1;
//				}
//			}
//		}
		List<FileFormDO> list=extraDAO.getFileNOs(fileCode,formId);
		Map <String,String> noMap=new HashMap<String,String>();
		if(ListUtil.isNotEmpty(list)){
			for(FileFormDO DO:list){
				noMap.put(DO.getNo(), DO.getNo());
			}
		}
		if (inputListDOs.size() > 0) {
			Long no = 0l;
			if (noMap.size() > 0) {
				for (FFileInputListDO listDO : inputListDOs) {
					long currNo=no+1;
					String key=noMap.get(StringUtil.leftPad(String.valueOf(currNo), 3, "0"));
					while (key!=null){
						currNo++;
						key=noMap.get(StringUtil.leftPad(String.valueOf(currNo), 3, "0"));
					}
					listDO.setNo(StringUtil.leftPad(String.valueOf(currNo), 3, "0"));
					fileInputListDAO.update(listDO);
					no=currNo;
				}
			} else {
				no++;
				for (FFileInputListDO listDO : inputListDOs) {
						listDO.setNo(StringUtil.leftPad(String.valueOf(no++), 3, "0"));
						fileInputListDAO.update(listDO);
				}
			}
		}
	}
	
	
	
	public void updateFileListIsArchive(List<FFileInputListDO> inputListDOs) {
		if (inputListDOs.size() > 0) {
			for (FFileInputListDO listDO : inputListDOs) {
				FFileListDO fFileListDO = fileListDAO.findById(listDO.getId());
				fFileListDO.setIsArchive("IS");
				fileListDAO.update(fFileListDO);
			}
		}
	}
	
	public void updateFileListNotArchive(List<FFileInputListDO> inputListDOs) {
		if (inputListDOs.size() > 0) {
			for (FFileInputListDO listDO : inputListDOs) {
				FFileListDO fFileListDO = fileListDAO.findById(listDO.getId());
				fFileListDO.setIsArchive(null);
				fileListDAO.update(fFileListDO);
			}
		}
	}
	
	@Override
	public void manualEndFlowProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		// 手动结束流程后业务处理(BASE)
		//        FFileDO baseFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		//        if(baseFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(baseFileDO.getFileId());
		//            updateFileListIsArchive(inputListDOs);
		//        }
		//
		//        FFileDO managenmentFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		//        if(managenmentFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(managenmentFileDO.getFileId());
		//            updateFileListIsArchive(inputListDOs);
		//        }
		//
		//        FFileDO titleFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		//        if(titleFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(titleFileDO.getFileId());
		//            updateFileListIsArchive(inputListDOs);
		//        }
	}
	
	@Override
	public void deleteAfterProcess(FormInfo formInfo) {
		FFileDO baseFileDO = fileDAO.findByFormId(formInfo.getFormId(),
				FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		if (baseFileDO != null) {
			//更新档案项目操作时间
			updateTime(baseFileDO.getFileId());
		}

		FFileDO managenmentFileDO = fileDAO.findByFormId(formInfo.getFormId(),
				FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		if (managenmentFileDO != null) {
			//更新档案项目操作时间
			updateTime(managenmentFileDO.getFileId());
		}

		FFileDO titleFileDO = fileDAO.findByFormId(formInfo.getFormId(),
				FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		if (titleFileDO != null) {
			//更新档案项目操作时间
			updateTime(titleFileDO.getFileId());
		}
		FFileDO commonFileDO = fileDAO.findByFormId(formInfo.getFormId(),
				FileTypeEnum.RISK_COMMON.code());//风险常规卷
		if (commonFileDO != null) {
			//更新档案项目操作时间
			updateTime(commonFileDO.getFileId());
		}
		FFileDO lawsuitFileDO = fileDAO.findByFormId(formInfo.getFormId(),
				FileTypeEnum.RISK_LAWSUIT.code());//风险诉讼卷
		if (lawsuitFileDO != null) {
			//更新档案项目操作时间
			updateTime(lawsuitFileDO.getFileId());
		}
	}
	
	@Override
	public void cancelAfterProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		//撤销表单后业务处理(BASE)
		//        FFileDO baseFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BUSSINESS.code());//基础卷
		//        if(baseFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(baseFileDO.getFileId());
		//            updateFileListNotArchive(inputListDOs);
		//        }
		//
		//        FFileDO managenmentFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.CREDIT_BEFORE_MANAGEMENT.code());//授信后管理卷
		//        if(managenmentFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(managenmentFileDO.getFileId());
		//            updateFileListNotArchive(inputListDOs);
		//        }
		//
		//        FFileDO titleFileDO=fileDAO.findByFormId(formInfo.getFormId(), FileTypeEnum.DOCUMENT_OF_TITLE.code());//权利凭证卷
		//        if(titleFileDO!=null){
		//            List<FFileInputListDO> inputListDOs=fileInputListDAO.findByFileId(titleFileDO.getFileId());
		//            updateFileListNotArchive(inputListDOs);
		//        }
	}
	//更新档案项目操作时间
	public void updateTime(Long fileId){
		FileOrder fileOrder=new FileOrder();
		fileOrder.setFileId(fileId);
		fileService.updateFileProjectTime(fileOrder);
	}
	
}
