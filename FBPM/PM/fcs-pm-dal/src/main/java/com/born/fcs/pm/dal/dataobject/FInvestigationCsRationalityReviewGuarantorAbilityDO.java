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
 * A data object class directly models database table <tt>f_investigation_cs_rationality_review_guarantor_ability</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_cs_rationality_review_guarantor_ability.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FInvestigationCsRationalityReviewGuarantorAbilityDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long csrReviewId;

	private String guarantor;

	private String abilityLevel;

	private Money totalCapital = new Money(0, 0);

	private Money intangibleAssets = new Money(0, 0);

	private Money contingentLiability = new Money(0, 0);

	private Money guaranteeAmount = new Money(0, 0);

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getCsrReviewId() {
		return csrReviewId;
	}
	
	public void setCsrReviewId(long csrReviewId) {
		this.csrReviewId = csrReviewId;
	}

	public String getGuarantor() {
		return guarantor;
	}
	
	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public String getAbilityLevel() {
		return abilityLevel;
	}
	
	public void setAbilityLevel(String abilityLevel) {
		this.abilityLevel = abilityLevel;
	}

	public Money getTotalCapital() {
		return totalCapital;
	}
	
	public void setTotalCapital(Money totalCapital) {
		if (totalCapital == null) {
			this.totalCapital = new Money(0, 0);
		} else {
			this.totalCapital = totalCapital;
		}
	}

	public Money getIntangibleAssets() {
		return intangibleAssets;
	}
	
	public void setIntangibleAssets(Money intangibleAssets) {
		if (intangibleAssets == null) {
			this.intangibleAssets = new Money(0, 0);
		} else {
			this.intangibleAssets = intangibleAssets;
		}
	}

	public Money getContingentLiability() {
		return contingentLiability;
	}
	
	public void setContingentLiability(Money contingentLiability) {
		if (contingentLiability == null) {
			this.contingentLiability = new Money(0, 0);
		} else {
			this.contingentLiability = contingentLiability;
		}
	}

	public Money getGuaranteeAmount() {
		return guaranteeAmount;
	}
	
	public void setGuaranteeAmount(Money guaranteeAmount) {
		if (guaranteeAmount == null) {
			this.guaranteeAmount = new Money(0, 0);
		} else {
			this.guaranteeAmount = guaranteeAmount;
		}
	}

	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
