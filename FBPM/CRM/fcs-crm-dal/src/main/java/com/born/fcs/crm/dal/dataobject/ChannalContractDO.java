/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 * A data object class directly models database table <tt>channal_contract</tt>.
 * 
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/channal_contract.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 * 
 * @author peigen
 */
public class ChannalContractDO extends FormDO implements Serializable {
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -4282603875229233564L;
	
	//========== properties ==========
	
	private long formId;
	
	private String contractNo;
	
	private String channalCode;
	
	private String channalName;
	
	private String channalType;
	
	private String contract;
	
	private String contractReturn;
	
	private String info1;
	
	private String info2;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	//========== getters and setters ==========
	
	@Override
	public long getFormId() {
		return formId;
	}
	
	@Override
	public void setFormId(long formId) {
		this.formId = formId;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getChannalCode() {
		return channalCode;
	}
	
	public void setChannalCode(String channalCode) {
		this.channalCode = channalCode;
	}
	
	public String getChannalName() {
		return channalName;
	}
	
	public void setChannalName(String channalName) {
		this.channalName = channalName;
	}
	
	public String getChannalType() {
		return channalType;
	}
	
	public void setChannalType(String channalType) {
		this.channalType = channalType;
	}
	
	public String getContract() {
		return this.contract;
	}
	
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	@Override
	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	@Override
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	@Override
	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	@Override
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public String getContractReturn() {
		return this.contractReturn;
	}
	
	public void setContractReturn(String contractReturn) {
		this.contractReturn = contractReturn;
	}
	
	public String getInfo1() {
		return this.info1;
	}
	
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
	
	public String getInfo2() {
		return this.info2;
	}
	
	public void setInfo2(String info2) {
		this.info2 = info2;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChannalContractDO [formId=");
		builder.append(formId);
		builder.append(", contractNo=");
		builder.append(contractNo);
		builder.append(", channalCode=");
		builder.append(channalCode);
		builder.append(", channalName=");
		builder.append(channalName);
		builder.append(", channalType=");
		builder.append(channalType);
		builder.append(", contract=");
		builder.append(contract);
		builder.append(", contractReturn=");
		builder.append(contractReturn);
		builder.append(", info1=");
		builder.append(info1);
		builder.append(", info2=");
		builder.append(info2);
		builder.append(", rawAddTime=");
		builder.append(rawAddTime);
		builder.append(", rawUpdateTime=");
		builder.append(rawUpdateTime);
		builder.append("]");
		return builder.toString();
	}
}
