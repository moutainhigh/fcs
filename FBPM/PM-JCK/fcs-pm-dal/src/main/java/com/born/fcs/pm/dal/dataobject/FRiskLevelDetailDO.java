/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>f_risk_level_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_risk_level_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FRiskLevelDetailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long riskLevelId;

	private long scoreTemplateId;

	private double evaluation;

	private double reevaluation;

	private String evaluationReason;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getRiskLevelId() {
		return riskLevelId;
	}
	
	public void setRiskLevelId(long riskLevelId) {
		this.riskLevelId = riskLevelId;
	}

	public long getScoreTemplateId() {
		return scoreTemplateId;
	}
	
	public void setScoreTemplateId(long scoreTemplateId) {
		this.scoreTemplateId = scoreTemplateId;
	}

	public double getEvaluation() {
		return evaluation;
	}
	
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}

	public double getReevaluation() {
		return reevaluation;
	}
	
	public void setReevaluation(double reevaluation) {
		this.reevaluation = reevaluation;
	}

	public String getEvaluationReason() {
		return evaluationReason;
	}
	
	public void setEvaluationReason(String evaluationReason) {
		this.evaluationReason = evaluationReason;
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
