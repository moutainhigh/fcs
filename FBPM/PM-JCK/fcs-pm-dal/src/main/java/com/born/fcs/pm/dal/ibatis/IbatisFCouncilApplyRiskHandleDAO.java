/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCouncilApplyRiskHandleDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilApplyRiskHandleDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCouncilApplyRiskHandleDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_apply_risk_handle.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFCouncilApplyRiskHandleDAO extends SqlMapClientDaoSupport implements FCouncilApplyRiskHandleDAO {
	/**
	 *  Insert one <tt>FCouncilApplyRiskHandleDO</tt> object to DB table <tt>f_council_apply_risk_handle</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_apply_risk_handle(apply_id,form_id,project_code,project_name,customer_id,customer_name,is_repay,company_name,enterprise_type,guarantee_amount,guarantee_rate,guarantee_rate_type,loan_bank,loan_time_limit,busi_manager_name,risk_manager_name,repay_amount,repay_date,loan_type,credit_time_limit,credit_amount,basic_info,risk_info,last_council_decision,last_council_check,this_council_scheme,status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilApplyRiskHandle
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilApplyRiskHandleDO FCouncilApplyRiskHandle) throws DataAccessException {
    	if (FCouncilApplyRiskHandle == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-COUNCIL-APPLY-RISK-HANDLE-INSERT", FCouncilApplyRiskHandle);

        return FCouncilApplyRiskHandle.getId();
    }

	/**
	 *  Update DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_apply_risk_handle set apply_id=?, form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, is_repay=?, company_name=?, enterprise_type=?, guarantee_amount=?, guarantee_rate=?, guarantee_rate_type=?, loan_bank=?, loan_time_limit=?, busi_manager_name=?, risk_manager_name=?, repay_amount=?, repay_date=?, loan_type=?, credit_time_limit=?, credit_amount=?, basic_info=?, risk_info=?, last_council_decision=?, last_council_check=?, this_council_scheme=?, status=? where (id = ?)</tt>
	 *
	 *	@param FCouncilApplyRiskHandle
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilApplyRiskHandleDO FCouncilApplyRiskHandle) throws DataAccessException {
    	if (FCouncilApplyRiskHandle == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-APPLY-RISK-HANDLE-UPDATE", FCouncilApplyRiskHandle);
    }

	/**
	 *  Update DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_apply_risk_handle set apply_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, is_repay=?, company_name=?, enterprise_type=?, guarantee_amount=?, guarantee_rate=?, guarantee_rate_type=?, loan_bank=?, loan_time_limit=?, busi_manager_name=?, risk_manager_name=?, repay_amount=?, repay_date=?, loan_type=?, credit_time_limit=?, credit_amount=?, basic_info=?, risk_info=?, last_council_decision=?, last_council_check=?, this_council_scheme=?, status=? where (form_id = ?)</tt>
	 *
	 *	@param FCouncilApplyRiskHandle
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FCouncilApplyRiskHandleDO FCouncilApplyRiskHandle) throws DataAccessException {
    	if (FCouncilApplyRiskHandle == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-APPLY-RISK-HANDLE-UPDATE-BY-FORM-ID", FCouncilApplyRiskHandle);
    }

	/**
	 *  Update DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_apply_risk_handle set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, is_repay=?, company_name=?, enterprise_type=?, guarantee_amount=?, guarantee_rate=?, guarantee_rate_type=?, loan_bank=?, loan_time_limit=?, busi_manager_name=?, risk_manager_name=?, repay_amount=?, repay_date=?, loan_type=?, credit_time_limit=?, credit_amount=?, basic_info=?, risk_info=?, last_council_decision=?, last_council_check=?, this_council_scheme=?, status=? where (apply_id = ?)</tt>
	 *
	 *	@param FCouncilApplyRiskHandle
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByApplyId(FCouncilApplyRiskHandleDO FCouncilApplyRiskHandle) throws DataAccessException {
    	if (FCouncilApplyRiskHandle == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-APPLY-RISK-HANDLE-UPDATE-BY-APPLY-ID", FCouncilApplyRiskHandle);
    }

	/**
	 *  Query DB table <tt>f_council_apply_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_apply_risk_handle where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilApplyRiskHandleDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilApplyRiskHandleDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FCouncilApplyRiskHandleDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-APPLY-RISK-HANDLE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_apply_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_apply_risk_handle where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FCouncilApplyRiskHandleDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilApplyRiskHandleDO findByApplyId(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (FCouncilApplyRiskHandleDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-APPLY-RISK-HANDLE-FIND-BY-APPLY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_apply_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_apply_risk_handle where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCouncilApplyRiskHandleDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilApplyRiskHandleDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FCouncilApplyRiskHandleDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-APPLY-RISK-HANDLE-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_apply_risk_handle where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-APPLY-RISK-HANDLE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_apply_risk_handle where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByApplyId(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-APPLY-RISK-HANDLE-DELETE-BY-APPLY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_council_apply_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_apply_risk_handle where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFromId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-APPLY-RISK-HANDLE-DELETE-BY-FROM-ID", param);
    }

}