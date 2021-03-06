package com.born.fcs.pm.ws.info.formchange;

import java.util.Date;
import java.util.List;

import com.born.fcs.pm.ws.enums.BooleanEnum;
import com.born.fcs.pm.ws.enums.CustomerTypeEnum;
import com.born.fcs.pm.ws.enums.FormChangeApplyEnum;
import com.born.fcs.pm.ws.enums.FormChangeApplyStatusEnum;
import com.born.fcs.pm.ws.enums.FormChangeApplyTypeEnum;
import com.born.fcs.pm.ws.info.common.BaseToStringInfo;
import com.yjf.common.lang.util.money.Money;

/**
 * 签报申请
 *
 * @author wuzj
 *
 */
public class FormChangeApplyInfo extends BaseToStringInfo {
	
	private static final long serialVersionUID = 6229395122557953677L;
	
	/** 申请ID */
	private long applyId;
	
	/** 申请表单ID */
	private long formId;
	
	/** 签报编号 */
	private String applyCode;
	
	/** 签报事项 */
	private String applyTitle;
	
	/** 申请类型 */
	private FormChangeApplyTypeEnum applyType;
	
	/** 项目编号 */
	private String projectCode;
	
	/** 项目名称 */
	private String projectName;
	
	/** 客户ID */
	private long customerId;
	/** 客户名称 */
	private String customerName;
	/** 客户类型 */
	private CustomerTypeEnum customerType;
	/** 签报表单 */
	private FormChangeApplyEnum changeForm;
	
	private String busiType;
	
	private String busiTypeName;
	
	/** 修改表单ID */
	private long changeFormId;
	
	/** 修改备注 */
	private String changeRemark;
	
	private BooleanEnum isNeedCouncil;
	
	private FormChangeApplyStatusEnum status;
	
	private Money chargedAmount = new Money(0, 0);
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	/** 修改记录 */
	List<FormChangeRecordInfo> records;
	
	public long getApplyId() {
		return this.applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}
	
	public long getFormId() {
		return this.formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}
	
	public FormChangeApplyTypeEnum getApplyType() {
		return this.applyType;
	}
	
	public void setApplyType(FormChangeApplyTypeEnum applyType) {
		this.applyType = applyType;
	}
	
	public String getProjectName() {
		return this.projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public CustomerTypeEnum getCustomerType() {
		return this.customerType;
	}
	
	public void setCustomerType(CustomerTypeEnum customerType) {
		this.customerType = customerType;
	}
	
	public String getProjectCode() {
		return this.projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public FormChangeApplyEnum getChangeForm() {
		return this.changeForm;
	}
	
	public void setChangeForm(FormChangeApplyEnum changeForm) {
		this.changeForm = changeForm;
	}
	
	public long getChangeFormId() {
		return this.changeFormId;
	}
	
	public void setChangeFormId(long changeFormId) {
		this.changeFormId = changeFormId;
	}
	
	public String getChangeRemark() {
		return this.changeRemark;
	}
	
	public void setChangeRemark(String changeRemark) {
		this.changeRemark = changeRemark;
	}
	
	public Date getRawAddTime() {
		return this.rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return this.rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public long getCustomerId() {
		return this.customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getBusiType() {
		return this.busiType;
	}
	
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	
	public String getBusiTypeName() {
		return this.busiTypeName;
	}
	
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}
	
	public List<FormChangeRecordInfo> getRecords() {
		return this.records;
	}
	
	public void setRecords(List<FormChangeRecordInfo> records) {
		this.records = records;
	}
	
	public String getApplyCode() {
		return this.applyCode;
	}
	
	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}
	
	public BooleanEnum getIsNeedCouncil() {
		return this.isNeedCouncil;
	}
	
	public void setIsNeedCouncil(BooleanEnum isNeedCouncil) {
		this.isNeedCouncil = isNeedCouncil;
	}
	
	public FormChangeApplyStatusEnum getStatus() {
		return this.status;
	}
	
	public void setStatus(FormChangeApplyStatusEnum status) {
		this.status = status;
	}
	
	public String getApplyTitle() {
		return this.applyTitle;
	}
	
	public void setApplyTitle(String applyTitle) {
		this.applyTitle = applyTitle;
	}
	
	public Money getChargedAmount() {
		return this.chargedAmount;
	}
	
	public void setChargedAmount(Money chargedAmount) {
		this.chargedAmount = chargedAmount;
	}
	
}
