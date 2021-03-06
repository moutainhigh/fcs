/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.am.dal.daointerface.FAssessCompanyApplyDAO;


// auto generated imports
import com.born.fcs.am.dal.dataobject.FAssessCompanyApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.am.dal.daointerface.FAssessCompanyApplyDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_assess_company_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFAssessCompanyApplyDAO extends SqlMapClientDaoSupport implements FAssessCompanyApplyDAO {
	/**
	 *  Insert one <tt>FAssessCompanyApplyDO</tt> object to DB table <tt>f_assess_company_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_assess_company_apply(form_id,project_code,project_name,customer_id,customer_name,customer_type,customer_addr,country_name,country_code,province_code,province_name,city_code,city_name,county_code,county_name,quality_land,quality_house,quality_assets,appoint_person,appoint_person_account,appoint_person_name,appoint_way,appoint_remark,company_id,company_name,apply_status,be_replaced_id,replaced_id,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAssessCompanyApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAssessCompanyApplyDO FAssessCompanyApply) throws DataAccessException {
    	if (FAssessCompanyApply == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-ASSESS-COMPANY-APPLY-INSERT", FAssessCompanyApply);

        return FAssessCompanyApply.getId();
    }

	/**
	 *  Update DB table <tt>f_assess_company_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_assess_company_apply set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, customer_type=?, customer_addr=?, country_name=?, country_code=?, province_code=?, province_name=?, city_code=?, city_name=?, county_code=?, county_name=?, quality_land=?, quality_house=?, quality_assets=?, appoint_person=?, appoint_person_account=?, appoint_person_name=?, appoint_way=?, appoint_remark=?, company_id=?, company_name=?, apply_status=?, be_replaced_id=?, replaced_id=? where (id = ?)</tt>
	 *
	 *	@param FAssessCompanyApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAssessCompanyApplyDO FAssessCompanyApply) throws DataAccessException {
    	if (FAssessCompanyApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-ASSESS-COMPANY-APPLY-UPDATE", FAssessCompanyApply);
    }

	/**
	 *  Query DB table <tt>f_assess_company_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_assess_company_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FAssessCompanyApplyDO
	 *	@throws DataAccessException
	 */	 
    public FAssessCompanyApplyDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FAssessCompanyApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-ASSESS-COMPANY-APPLY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_assess_company_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_assess_company_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FAssessCompanyApplyDO
	 *	@throws DataAccessException
	 */	 
    public FAssessCompanyApplyDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FAssessCompanyApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-ASSESS-COMPANY-APPLY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_assess_company_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_assess_company_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FAssessCompanyApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAssessCompanyApplyDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-ASSESS-COMPANY-APPLY-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_assess_company_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_assess_company_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-ASSESS-COMPANY-APPLY-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_assess_company_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_assess_company_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-ASSESS-COMPANY-APPLY-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Query DB table <tt>f_assess_company_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_assess_company_apply where (1 = 1)</tt>
	 *
	 *	@param FAssessCompanyApply
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<FAssessCompanyApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAssessCompanyApplyDO> findByCondition(FAssessCompanyApplyDO FAssessCompanyApply, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException {
    	if (FAssessCompanyApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FAssessCompanyApply", FAssessCompanyApply);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);

        return getSqlMapClientTemplate().queryForList("MS-F-ASSESS-COMPANY-APPLY-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_assess_company_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_assess_company_apply where (1 = 1)</tt>
	 *
	 *	@param FAssessCompanyApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FAssessCompanyApplyDO FAssessCompanyApply) throws DataAccessException {
    	if (FAssessCompanyApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-ASSESS-COMPANY-APPLY-FIND-BY-CONDITION-COUNT", FAssessCompanyApply);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}