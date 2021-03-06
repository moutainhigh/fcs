/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationRiskDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_risk</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_risk.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FInvestigationRiskDAO {
	/**
	 *  Insert one <tt>FInvestigationRiskDO</tt> object to DB table <tt>f_investigation_risk</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_risk(form_id,project_code,project_name,customer_id,customer_name,risk_analysis,conclusion,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationRisk
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationRiskDO FInvestigationRisk) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_risk set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, risk_analysis=?, conclusion=? where (risk_id = ?)</tt>
	 *
	 *	@param FInvestigationRisk
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationRiskDO FInvestigationRisk) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_risk set project_code=?, project_name=?, customer_id=?, customer_name=?, risk_analysis=?, conclusion=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationRisk
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationRiskDO FInvestigationRisk) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_risk set form_id=?, project_name=?, customer_id=?, customer_name=?, risk_analysis=?, conclusion=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationRisk
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationRiskDO FInvestigationRisk) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_risk where (risk_id = ?)</tt>
	 *
	 *	@param riskId
	 *	@return FInvestigationRiskDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationRiskDO findById(long riskId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_risk where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationRiskDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationRiskDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_risk where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationRiskDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationRiskDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_risk where (risk_id = ?)</tt>
	 *
	 *	@param riskId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long riskId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_risk where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_risk where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}