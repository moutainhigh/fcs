/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * hjiajie 下午3:48:57 创建
 */
package com.born.fcs.face.web.controller.fund;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rop.thirdparty.com.google.common.collect.Lists;

import com.born.face.webui.table.ReportTemplate;
import com.born.face.webui.table.TableBuilder;
import com.born.fcs.face.web.controller.base.BaseController;
import com.born.fcs.face.web.util.PageUtil;
import com.born.fcs.fm.ws.info.payment.FormPaymentFormInfo;
import com.born.fcs.fm.ws.order.payment.FormPaymentQueryOrder;
import com.born.fcs.pm.ws.enums.FormStatusEnum;
import com.born.fcs.pm.ws.result.base.QueryBaseBatchResult;
import com.born.fcs.pm.ws.service.report.field.DataTypeEnum;
import com.born.fcs.pm.ws.service.report.field.FcsField;
import com.born.fcs.pm.ws.service.report.result.DataListItem;
import com.born.fcs.pm.ws.service.report.result.ReportDataResult;
import com.born.fcs.pm.ws.service.report.result.ReportItem;
import com.yjf.common.lang.util.ListUtil;
import com.yjf.common.lang.util.money.Money;

/**
 * 
 * 
 * @author hjiajie 付款单 报表列表
 */
@Controller
@RequestMapping("fundMg/report")
public class FundPaymentApplyController extends BaseController {
	final static String vm_path = "/fundMg/fundMgModule/reportAnalyze/";
	private static String formatString = "######0.00";
	
	@Override
	protected String[] getDateInputDayNameArray() {
		return new String[] { "useTime", "backTime", "interestTime" };
	}
	
	/**
	 * 查询 使用列表查询
	 * @param order
	 * @param model
	 * @return
	 */
	@RequestMapping("paymentApplyList.htm")
	public String paymentApplyList(FormPaymentQueryOrder order, HttpServletRequest request,
									Model model) {
		
		order.setPageNumber(1);
		order.setPageSize(999);
		QueryBaseBatchResult<FormPaymentFormInfo> result = paymentApplyServiceClient
			.searchForm(order);
		model.addAttribute("statusList", FormStatusEnum.getAllEnum());
		Money allAmount = Money.zero();
		Money allInterest = Money.zero();
		if (result != null && ListUtil.isNotEmpty(result.getPageList())) {
			for (FormPaymentFormInfo info : result.getPageList()) {
				allAmount.addTo(info.getAmount());
			}
		}
		model.addAttribute("page", PageUtil.getCovertPage(result));
		model.addAttribute("result", result);
		model.addAttribute("conditions", order);
		model.addAttribute("allAmount", allAmount);
		model.addAttribute("allInterest", allInterest);
		return vm_path + "paymentDetail.vm";
	}
	
	/***
	 * 导出
	 */
	@RequestMapping("paymentApplyExport.htm")
	public String paymentApplyExport(FormPaymentQueryOrder order, HttpServletRequest request,
										HttpServletResponse response, Model model) {
		order.setPageNumber(1);
		order.setPageSize(999);
		QueryBaseBatchResult<FormPaymentFormInfo> result = paymentApplyServiceClient
			.searchForm(order);
		makeExcel(result, request, response);
		return null;
	}
	
	public void makeExcel(QueryBaseBatchResult<FormPaymentFormInfo> result,
							HttpServletRequest request, HttpServletResponse response) {
		ReportDataResult dataResult = makeResult(result);
		ReportTemplate reportTemplate = new ReportTemplate();
		reportTemplate.setReportName("项目付款明细表");
		//		//多行表头
		//		String[][] head = new String[2][3];
		//		head[0] = new String[] { "大类", "大类", "数据" };
		//		head[1] = new String[] { "类型", "名称", "数据" };
		//		reportTemplate.setColHeadString(head);
		//		
		//		reportTemplate.setMergeRow(true);
		//		reportTemplate.setMergeColCount(2);
		TableBuilder builder = new TableBuilder(dataResult, reportTemplate,
			TableBuilder.Table_Option_Excel, false);
		builder.init();
		builder.dataBind(request, response);
	}
	
	private static ReportDataResult makeResult(QueryBaseBatchResult<FormPaymentFormInfo> result) {
		ReportDataResult dataResult = new ReportDataResult();
		if (result == null || ListUtil.isEmpty(result.getPageList())) {
			return dataResult;
		}
		dataResult.getFcsFields().add(new FcsField("protocol_code", "协议编码", null));
		dataResult.getFcsFields().add(new FcsField("creditor_name", "债权人", null));
		dataResult.getFcsFields().add(new FcsField("apply_dept_name", "借款单位", null));
		dataResult.getFcsFields().add(new FcsField("use_time", "借款日期", null));
		dataResult.getFcsFields().add(new FcsField("back_time", "到期日", null));
		dataResult.getFcsFields().add(new FcsField("interest_rate", "利率(%/年)", null));
		dataResult.getFcsFields().add(new FcsField("loan_amount", "金额(元)", null));
		dataResult.getFcsFields().add(new FcsField("interest", "到期应收利息(元)", null));
		
		List<DataListItem> dataListItems = Lists.newArrayList();
		// 信息
		Money allAmount = Money.zero();
		Money allInterest = Money.zero();
		for (FormPaymentFormInfo info : result.getPageList()) {
			DataListItem item = new DataListItem();
			List<ReportItem> valueList = Lists.newArrayList();
			
			//			//1
			//			ReportItem reportItem = new ReportItem();
			//			reportItem.setKey("protocol_code");
			//			reportItem.setValue(info.getProtocolCode());
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//2
			//			reportItem = new ReportItem();
			//			reportItem.setKey("creditor_name");
			//			reportItem.setValue(info.getCreditorName());
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//3
			//			reportItem = new ReportItem();
			//			reportItem.setKey("apply_dept_name");
			//			reportItem.setValue(info.getApplyDeptName());
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//4
			//			reportItem = new ReportItem();
			//			reportItem.setKey("use_time");
			//			reportItem.setValue(DateUtil.dtSimpleFormat(info.getUseTime()));
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//5
			//			reportItem = new ReportItem();
			//			reportItem.setKey("back_time");
			//			reportItem.setValue(DateUtil.dtSimpleFormat(info.getBackTime()));
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//6
			//			reportItem = new ReportItem();
			//			reportItem.setKey("interest_rate");
			//			
			//			BigDecimal decimal = new BigDecimal(info.getInterestRate());
			//			
			//			DecimalFormat decimalFormat = new DecimalFormat(formatString);
			//			String temp = decimalFormat.format(decimal);
			//			
			//			reportItem.setValue(temp);
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			//7
			//			reportItem = new ReportItem();
			//			reportItem.setKey("loan_amount");
			//			reportItem.setValue(info.getLoanAmount().toStandardString());
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			allAmount.addTo(info.getLoanAmount());
			//			
			//			//8
			//			reportItem = new ReportItem();
			//			reportItem.setKey("interest");
			//			reportItem.setValue(info.getInterest().toStandardString());
			//			reportItem.setDataTypeEnum(DataTypeEnum.STRING);
			//			valueList.add(reportItem);
			//			
			//			allInterest.addTo(info.getInterest());
			
			item.setValueList(valueList);
			dataListItems.add(item);
		}
		DataListItem item = new DataListItem();
		List<ReportItem> valueList = Lists.newArrayList();
		
		//1
		ReportItem reportItem = new ReportItem();
		reportItem.setKey("protocol_code");
		reportItem.setValue("总计");
		reportItem.setDataTypeEnum(DataTypeEnum.STRING);
		valueList.add(reportItem);
		//7
		reportItem = new ReportItem();
		reportItem.setKey("loan_amount");
		reportItem.setValue(allAmount.toStandardString());
		reportItem.setDataTypeEnum(DataTypeEnum.STRING);
		valueList.add(reportItem);
		
		//8
		reportItem = new ReportItem();
		reportItem.setKey("interest");
		reportItem.setValue(allInterest.toStandardString());
		reportItem.setDataTypeEnum(DataTypeEnum.STRING);
		valueList.add(reportItem);
		
		item.setValueList(valueList);
		dataListItems.add(item);
		
		dataResult.setDataList(dataListItems);
		return dataResult;
	}
	
}