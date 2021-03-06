/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>f_charge_notification</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_charge_notification.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FChargeNotificationDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long notificationId;

	private long formId;

	private String projectCode;

	private String projectName;

	private long customerId;

	private String customerName;

	private String contractCode;

	private String contractName;

	private String isAgentPay;

	private String selfPay;

	private Money payAmount = new Money(0, 0);

	private String payName;

	private String payAccount;

	private String payBank;

	private Date payTime;

	private String payForAnother;

	private Money anotherPayAmount = new Money(0, 0);

	private String anotherPayName;

	private String anotherPayAccount;

	private String anotherPayBank;

	private Date anotherPayTime;

	private long submitManId;

	private String chargeNo;

	private Date chargeTime;

	private String submitManName;

	private String status;

	private String chargeBasis;

	private String applyCode;

	private String applyTitle;

	private String payer;

	private String attachment;

	private String institutionId;

	private String institutionName;

	private String chargeName;

	private double chargeFee;

	private String chargeType;

	private String remark;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getNotificationId() {
		return notificationId;
	}
	
	public void setNotificationId(long notificationId) {
		this.notificationId = notificationId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContractCode() {
		return contractCode;
	}
	
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}
	
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getIsAgentPay() {
		return isAgentPay;
	}
	
	public void setIsAgentPay(String isAgentPay) {
		this.isAgentPay = isAgentPay;
	}

	public String getSelfPay() {
		return selfPay;
	}
	
	public void setSelfPay(String selfPay) {
		this.selfPay = selfPay;
	}

	public Money getPayAmount() {
		return payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		if (payAmount == null) {
			this.payAmount = new Money(0, 0);
		} else {
			this.payAmount = payAmount;
		}
	}

	public String getPayName() {
		return payName;
	}
	
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getPayAccount() {
		return payAccount;
	}
	
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayBank() {
		return payBank;
	}
	
	public void setPayBank(String payBank) {
		this.payBank = payBank;
	}

	public Date getPayTime() {
		return payTime;
	}
	
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayForAnother() {
		return payForAnother;
	}
	
	public void setPayForAnother(String payForAnother) {
		this.payForAnother = payForAnother;
	}

	public Money getAnotherPayAmount() {
		return anotherPayAmount;
	}
	
	public void setAnotherPayAmount(Money anotherPayAmount) {
		if (anotherPayAmount == null) {
			this.anotherPayAmount = new Money(0, 0);
		} else {
			this.anotherPayAmount = anotherPayAmount;
		}
	}

	public String getAnotherPayName() {
		return anotherPayName;
	}
	
	public void setAnotherPayName(String anotherPayName) {
		this.anotherPayName = anotherPayName;
	}

	public String getAnotherPayAccount() {
		return anotherPayAccount;
	}
	
	public void setAnotherPayAccount(String anotherPayAccount) {
		this.anotherPayAccount = anotherPayAccount;
	}

	public String getAnotherPayBank() {
		return anotherPayBank;
	}
	
	public void setAnotherPayBank(String anotherPayBank) {
		this.anotherPayBank = anotherPayBank;
	}

	public Date getAnotherPayTime() {
		return anotherPayTime;
	}
	
	public void setAnotherPayTime(Date anotherPayTime) {
		this.anotherPayTime = anotherPayTime;
	}

	public long getSubmitManId() {
		return submitManId;
	}
	
	public void setSubmitManId(long submitManId) {
		this.submitManId = submitManId;
	}

	public String getChargeNo() {
		return chargeNo;
	}
	
	public void setChargeNo(String chargeNo) {
		this.chargeNo = chargeNo;
	}

	public Date getChargeTime() {
		return chargeTime;
	}
	
	public void setChargeTime(Date chargeTime) {
		this.chargeTime = chargeTime;
	}

	public String getSubmitManName() {
		return submitManName;
	}
	
	public void setSubmitManName(String submitManName) {
		this.submitManName = submitManName;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getChargeBasis() {
		return chargeBasis;
	}
	
	public void setChargeBasis(String chargeBasis) {
		this.chargeBasis = chargeBasis;
	}

	public String getApplyCode() {
		return applyCode;
	}
	
	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}

	public String getApplyTitle() {
		return applyTitle;
	}
	
	public void setApplyTitle(String applyTitle) {
		this.applyTitle = applyTitle;
	}

	public String getPayer() {
		return payer;
	}
	
	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getAttachment() {
		return attachment;
	}
	
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getInstitutionId() {
		return institutionId;
	}
	
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return institutionName;
	}
	
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getChargeName() {
		return chargeName;
	}
	
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public double getChargeFee() {
		return chargeFee;
	}
	
	public void setChargeFee(double chargeFee) {
		this.chargeFee = chargeFee;
	}

	public String getChargeType() {
		return chargeType;
	}
	
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
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


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
