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
 * A data object class directly models database table <tt>project_risk_log</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_risk_log.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectRiskLogDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long logId;

	private long customerId;

	private String customerName;

	private String projectCode;

	private String projectName;

	private long busiManagerId;

	private String busiManagerName;

	private Date occurTime;

	private String eventTitle;

	private String eventDetail;

	private String needAnnounce;

	private String logStatus;

	private Date rawAddTime;

	private Date rawUpdateTime;

	private long createManId;

	private String createManName;

	private String participantIds;

	private String participantNames;

	private String councilPlace;

    //========== getters and setters ==========

	public long getLogId() {
		return logId;
	}
	
	public void setLogId(long logId) {
		this.logId = logId;
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

	public long getBusiManagerId() {
		return busiManagerId;
	}
	
	public void setBusiManagerId(long busiManagerId) {
		this.busiManagerId = busiManagerId;
	}

	public String getBusiManagerName() {
		return busiManagerName;
	}
	
	public void setBusiManagerName(String busiManagerName) {
		this.busiManagerName = busiManagerName;
	}

	public Date getOccurTime() {
		return occurTime;
	}
	
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getEventTitle() {
		return eventTitle;
	}
	
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDetail() {
		return eventDetail;
	}
	
	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	public String getNeedAnnounce() {
		return needAnnounce;
	}
	
	public void setNeedAnnounce(String needAnnounce) {
		this.needAnnounce = needAnnounce;
	}

	public String getLogStatus() {
		return logStatus;
	}
	
	public void setLogStatus(String logStatus) {
		this.logStatus = logStatus;
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

	public long getCreateManId() {
		return createManId;
	}
	
	public void setCreateManId(long createManId) {
		this.createManId = createManId;
	}

	public String getCreateManName() {
		return createManName;
	}
	
	public void setCreateManName(String createManName) {
		this.createManName = createManName;
	}

	public String getParticipantIds() {
		return participantIds;
	}
	
	public void setParticipantIds(String participantIds) {
		this.participantIds = participantIds;
	}

	public String getParticipantNames() {
		return participantNames;
	}
	
	public void setParticipantNames(String participantNames) {
		this.participantNames = participantNames;
	}

	public String getCouncilPlace() {
		return councilPlace;
	}
	
	public void setCouncilPlace(String councilPlace) {
		this.councilPlace = councilPlace;
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
