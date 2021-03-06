/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationPersonDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationPersonDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationPersonDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_person.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFInvestigationPersonDAO extends SqlMapClientDaoSupport implements FInvestigationPersonDAO {
	/**
	 *  Insert one <tt>FInvestigationPersonDO</tt> object to DB table <tt>f_investigation_person</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_person(form_id,investigate_date,investigate_place,main_investigator_id,main_investigator_account,main_investigator_name,assist_investigator_id,assist_investigator_name,reception_persion,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationPerson
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationPersonDO FInvestigationPerson) throws DataAccessException {
    	if (FInvestigationPerson == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-PERSON-INSERT", FInvestigationPerson);

        return FInvestigationPerson.getId();
    }

	/**
	 *  Update DB table <tt>f_investigation_person</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_person set form_id=?, investigate_date=?, investigate_place=?, main_investigator_id=?, main_investigator_account=?, main_investigator_name=?, assist_investigator_id=?, assist_investigator_name=?, reception_persion=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationPerson
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationPersonDO FInvestigationPerson) throws DataAccessException {
    	if (FInvestigationPerson == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-PERSON-UPDATE", FInvestigationPerson);
    }

	/**
	 *  Update DB table <tt>f_investigation_person</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_person set investigate_date=?, investigate_place=?, main_investigator_id=?, main_investigator_account=?, main_investigator_name=?, assist_investigator_id=?, assist_investigator_name=?, reception_persion=?, sort_order=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationPerson
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationPersonDO FInvestigationPerson) throws DataAccessException {
    	if (FInvestigationPerson == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-PERSON-UPDATE-BY-FORM-ID", FInvestigationPerson);
    }

	/**
	 *  Query DB table <tt>f_investigation_person</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_person where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationPersonDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationPersonDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FInvestigationPersonDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-PERSON-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_person</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_person where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FInvestigationPersonDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationPersonDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-PERSON-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_person</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_person where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-PERSON-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_person</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_person where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-PERSON-DELETE-BY-FORM-ID", param);
    }

}