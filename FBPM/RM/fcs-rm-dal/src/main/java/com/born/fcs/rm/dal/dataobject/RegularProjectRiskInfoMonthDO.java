/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>regular_project_risk_info_month</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_risk_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class RegularProjectRiskInfoMonthDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String reportDate;

	private int reportYear;

	private int reportMonth;

	private long customerId;

	private String customerName;

	private String busiLicenseNo;

	private String projectCode;

	private String projectName;

	private Money compBalanceBeginning = new Money(0, 0);

	private Money compBalanceEnding = new Money(0, 0);

	private Money compAmountThisYear = new Money(0, 0);

	private Money compAmountThisMonth = new Money(0, 0);

	private String compAmountThisMonthDetail;

	private Money compBackAmountThisYear = new Money(0, 0);

	private Money compBackAmountThisMonth = new Money(0, 0);

	private String compBackAmountThisMonthDetail;

	private Money lossAmount = new Money(0, 0);

	private String riskLevel;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public String getReportDate() {
		return reportDate;
	}
	
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public int getReportYear() {
		return reportYear;
	}
	
	public void setReportYear(int reportYear) {
		this.reportYear = reportYear;
	}

	public int getReportMonth() {
		return reportMonth;
	}
	
	public void setReportMonth(int reportMonth) {
		this.reportMonth = reportMonth;
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

	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
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

	public Money getCompBalanceBeginning() {
		return compBalanceBeginning;
	}
	
	public void setCompBalanceBeginning(Money compBalanceBeginning) {
		if (compBalanceBeginning == null) {
			this.compBalanceBeginning = new Money(0, 0);
		} else {
			this.compBalanceBeginning = compBalanceBeginning;
		}
	}

	public Money getCompBalanceEnding() {
		return compBalanceEnding;
	}
	
	public void setCompBalanceEnding(Money compBalanceEnding) {
		if (compBalanceEnding == null) {
			this.compBalanceEnding = new Money(0, 0);
		} else {
			this.compBalanceEnding = compBalanceEnding;
		}
	}

	public Money getCompAmountThisYear() {
		return compAmountThisYear;
	}
	
	public void setCompAmountThisYear(Money compAmountThisYear) {
		if (compAmountThisYear == null) {
			this.compAmountThisYear = new Money(0, 0);
		} else {
			this.compAmountThisYear = compAmountThisYear;
		}
	}

	public Money getCompAmountThisMonth() {
		return compAmountThisMonth;
	}
	
	public void setCompAmountThisMonth(Money compAmountThisMonth) {
		if (compAmountThisMonth == null) {
			this.compAmountThisMonth = new Money(0, 0);
		} else {
			this.compAmountThisMonth = compAmountThisMonth;
		}
	}

	public String getCompAmountThisMonthDetail() {
		return compAmountThisMonthDetail;
	}
	
	public void setCompAmountThisMonthDetail(String compAmountThisMonthDetail) {
		this.compAmountThisMonthDetail = compAmountThisMonthDetail;
	}

	public Money getCompBackAmountThisYear() {
		return compBackAmountThisYear;
	}
	
	public void setCompBackAmountThisYear(Money compBackAmountThisYear) {
		if (compBackAmountThisYear == null) {
			this.compBackAmountThisYear = new Money(0, 0);
		} else {
			this.compBackAmountThisYear = compBackAmountThisYear;
		}
	}

	public Money getCompBackAmountThisMonth() {
		return compBackAmountThisMonth;
	}
	
	public void setCompBackAmountThisMonth(Money compBackAmountThisMonth) {
		if (compBackAmountThisMonth == null) {
			this.compBackAmountThisMonth = new Money(0, 0);
		} else {
			this.compBackAmountThisMonth = compBackAmountThisMonth;
		}
	}

	public String getCompBackAmountThisMonthDetail() {
		return compBackAmountThisMonthDetail;
	}
	
	public void setCompBackAmountThisMonthDetail(String compBackAmountThisMonthDetail) {
		this.compBackAmountThisMonthDetail = compBackAmountThisMonthDetail;
	}

	public Money getLossAmount() {
		return lossAmount;
	}
	
	public void setLossAmount(Money lossAmount) {
		if (lossAmount == null) {
			this.lossAmount = new Money(0, 0);
		} else {
			this.lossAmount = lossAmount;
		}
	}

	public String getRiskLevel() {
		return riskLevel;
	}
	
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
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
