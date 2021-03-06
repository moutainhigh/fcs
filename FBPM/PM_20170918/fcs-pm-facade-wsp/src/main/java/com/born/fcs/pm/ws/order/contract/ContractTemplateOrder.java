package com.born.fcs.pm.ws.order.contract;

import java.util.Date;

import com.born.fcs.pm.ws.order.base.ProcessOrder;

/**
 * 合同模板Order
 * 
 * @author heh
 * 
 */
public class ContractTemplateOrder extends ProcessOrder {
	
	private static final long serialVersionUID = -907102866946209429L;
	
	private Long templateId;
	
	private String name;
	
	private String contractType;
	
	private String busiType;
	
	private String busiTypeName;
	
	private String isMain;
	
	private String creditConditionType;
	
	private String pledgeType;
	
	private String stampPhase;
	
	private String templateFile;
	
	private String templateContent;
	
	private String status;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;

	private Integer checkStatus;

	private String attachment;

	private String remark;

	private String templateType;

	private String letterType;

	private Long formId;

	private String userName;

	private String userAccount;

	private long legalManagerId;

	private String legalManagerAccount;

	private String legalManagerName;

	private String isProcess;

	private Long parentId;

	//是否强制修改，不用走流程
	private String isForcedModify;

	public String getIsForcedModify() {
		return isForcedModify;
	}

	public void setIsForcedModify(String isForcedModify) {
		this.isForcedModify = isForcedModify;
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String getUserAccount() {
		return userAccount;
	}

	@Override
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public long getLegalManagerId() {
		return legalManagerId;
	}

	public void setLegalManagerId(long legalManagerId) {
		this.legalManagerId = legalManagerId;
	}

	public String getLegalManagerAccount() {
		return legalManagerAccount;
	}

	public void setLegalManagerAccount(String legalManagerAccount) {
		this.legalManagerAccount = legalManagerAccount;
	}

	public String getLegalManagerName() {
		return legalManagerName;
	}

	public void setLegalManagerName(String legalManagerName) {
		this.legalManagerName = legalManagerName;
	}

	public String getIsProcess() {
		return isProcess;
	}

	public void setIsProcess(String isProcess) {
		this.isProcess = isProcess;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public Long getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContractType() {
		return contractType;
	}
	
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	
	public String getBusiType() {
		return busiType;
	}
	
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	
	public String getIsMain() {
		return isMain;
	}
	
	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}
	
	public String getCreditConditionType() {
		return creditConditionType;
	}
	
	public void setCreditConditionType(String creditConditionType) {
		this.creditConditionType = creditConditionType;
	}
	
	public String getPledgeType() {
		return pledgeType;
	}
	
	public void setPledgeType(String pledgeType) {
		this.pledgeType = pledgeType;
	}
	
	public String getStampPhase() {
		return stampPhase;
	}
	
	public void setStampPhase(String stampPhase) {
		this.stampPhase = stampPhase;
	}
	
	public String getTemplateFile() {
		return templateFile;
	}
	
	public void setTemplateFile(String templateFile) {
		this.templateFile = templateFile;
	}
	
	public String getTemplateContent() {
		return templateContent;
	}
	
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
	
	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getBusiTypeName() {
		return busiTypeName;
	}
	
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContractTemplateOrder [templateId=");
		builder.append(templateId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", contractType=");
		builder.append(contractType);
		builder.append(", busiType=");
		builder.append(busiType);
		builder.append(", busiTypeName=");
		builder.append(busiTypeName);
		builder.append(", isMain=");
		builder.append(isMain);
		builder.append(", creditConditionType=");
		builder.append(creditConditionType);
		builder.append(", pledgeType=");
		builder.append(pledgeType);
		builder.append(", stampPhase=");
		builder.append(stampPhase);
		builder.append(", templateFile=");
		builder.append(templateFile);
		builder.append(", status=");
		builder.append(status);
		builder.append(", rawAddTime=");
		builder.append(rawAddTime);
		builder.append(", rawUpdateTime=");
		builder.append(rawUpdateTime);
		builder.append("]");
		return builder.toString();
	}
	
}
