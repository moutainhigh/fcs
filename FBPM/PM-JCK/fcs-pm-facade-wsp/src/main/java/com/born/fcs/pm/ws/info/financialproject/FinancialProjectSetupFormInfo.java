package com.born.fcs.pm.ws.info.financialproject;

import java.util.Date;

import com.born.fcs.pm.ws.enums.FinancialProductInterestTypeEnum;
import com.born.fcs.pm.ws.enums.FinancialProductTermTypeEnum;
import com.born.fcs.pm.ws.enums.FinancialProductTypeEnum;
import com.born.fcs.pm.ws.enums.ProjectCouncilEnum;
import com.born.fcs.pm.ws.enums.ProjectCouncilStatusEnum;
import com.born.fcs.pm.ws.enums.TimeUnitEnum;
import com.born.fcs.pm.ws.info.common.FormVOInfo;
import com.yjf.common.lang.util.money.Money;

/**
 * 理财项目立项列表INFO
 *
 *
 * @author wuzj
 *
 */
public class FinancialProjectSetupFormInfo extends FormVOInfo {
	
	private static final long serialVersionUID = 6910361401999733452L;
	
	private long id;
	
	private String projectCode;
	
	private long productId;
	
	private FinancialProductTypeEnum productType;
	
	private FinancialProductTermTypeEnum termType;
	
	private FinancialProductInterestTypeEnum interestType;
	
	private String productName;
	
	private int timeLimit;
	
	private TimeUnitEnum timeUnit;
	
	private String issueInstitution;
	
	private double interestRate;
	
	private Date expectBuyDate;
	
	private Date expectExpireDate;
	
	private Money price = new Money(0, 0);
	
	private long buyNum;
	
	private long createUserId;
	
	private String createUserAccount;
	
	private String createUserName;
	
	private long deptId;
	
	private String deptCode;
	
	private String deptName;
	
	private String deptPath;
	
	private String deptPathName;
	
	/** 上会申请ID */
	private long councilApplyId;
	/** 上会类型 */
	private ProjectCouncilEnum councilType;
	/** 上会状态 */
	private ProjectCouncilStatusEnum councilStatus;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getProjectCode() {
		return this.projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public long getProductId() {
		return this.productId;
	}
	
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public FinancialProductTypeEnum getProductType() {
		return this.productType;
	}
	
	public void setProductType(FinancialProductTypeEnum productType) {
		this.productType = productType;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getTimeLimit() {
		return this.timeLimit;
	}
	
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	
	public TimeUnitEnum getTimeUnit() {
		return this.timeUnit;
	}
	
	public void setTimeUnit(TimeUnitEnum timeUnit) {
		this.timeUnit = timeUnit;
	}
	
	public String getIssueInstitution() {
		return this.issueInstitution;
	}
	
	public void setIssueInstitution(String issueInstitution) {
		this.issueInstitution = issueInstitution;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Date getExpectBuyDate() {
		return this.expectBuyDate;
	}
	
	public void setExpectBuyDate(Date expectBuyDate) {
		this.expectBuyDate = expectBuyDate;
	}
	
	public Date getExpectExpireDate() {
		return this.expectExpireDate;
	}
	
	public void setExpectExpireDate(Date expectExpireDate) {
		this.expectExpireDate = expectExpireDate;
	}
	
	public Money getPrice() {
		return this.price;
	}
	
	public void setPrice(Money price) {
		this.price = price;
	}
	
	public long getBuyNum() {
		return this.buyNum;
	}
	
	public void setBuyNum(long buyNum) {
		this.buyNum = buyNum;
	}
	
	public long getCreateUserId() {
		return this.createUserId;
	}
	
	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}
	
	public String getCreateUserAccount() {
		return this.createUserAccount;
	}
	
	public void setCreateUserAccount(String createUserAccount) {
		this.createUserAccount = createUserAccount;
	}
	
	public String getCreateUserName() {
		return this.createUserName;
	}
	
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	
	public long getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptCode() {
		return this.deptCode;
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptPath() {
		return this.deptPath;
	}
	
	public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
	}
	
	public String getDeptPathName() {
		return this.deptPathName;
	}
	
	public void setDeptPathName(String deptPathName) {
		this.deptPathName = deptPathName;
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
	
	public FinancialProductTermTypeEnum getTermType() {
		return this.termType;
	}
	
	public void setTermType(FinancialProductTermTypeEnum termType) {
		this.termType = termType;
	}
	
	public FinancialProductInterestTypeEnum getInterestType() {
		return this.interestType;
	}
	
	public void setInterestType(FinancialProductInterestTypeEnum interestType) {
		this.interestType = interestType;
	}
	
	public long getCouncilApplyId() {
		return this.councilApplyId;
	}
	
	public void setCouncilApplyId(long councilApplyId) {
		this.councilApplyId = councilApplyId;
	}
	
	public ProjectCouncilEnum getCouncilType() {
		return this.councilType;
	}
	
	public void setCouncilType(ProjectCouncilEnum councilType) {
		this.councilType = councilType;
	}
	
	public ProjectCouncilStatusEnum getCouncilStatus() {
		return this.councilStatus;
	}
	
	public void setCouncilStatus(ProjectCouncilStatusEnum councilStatus) {
		this.councilStatus = councilStatus;
	}
	
}
