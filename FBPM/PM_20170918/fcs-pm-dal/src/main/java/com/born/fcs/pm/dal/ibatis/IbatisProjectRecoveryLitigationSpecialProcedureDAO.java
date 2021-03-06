/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationSpecialProcedureDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryLitigationSpecialProcedureDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationSpecialProcedureDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_special_procedure.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisProjectRecoveryLitigationSpecialProcedureDAO extends SqlMapClientDaoSupport implements ProjectRecoveryLitigationSpecialProcedureDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryLitigationSpecialProcedureDO</tt> object to DB table <tt>project_recovery_litigation_special_procedure</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_litigation_special_procedure(project_recovery_id,accepting_court,agent_law_firm,agent_attorney,agent_judge,place_on_file_time,pay_time,referee_clerk,referee_time,memo,litigation_index,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryLitigationSpecialProcedure
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryLitigationSpecialProcedureDO projectRecoveryLitigationSpecialProcedure) throws DataAccessException {
    	if (projectRecoveryLitigationSpecialProcedure == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-INSERT", projectRecoveryLitigationSpecialProcedure);

        return projectRecoveryLitigationSpecialProcedure.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery_litigation_special_procedure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_special_procedure set project_recovery_id=?, accepting_court=?, agent_law_firm=?, agent_attorney=?, agent_judge=?, place_on_file_time=?, pay_time=?, referee_clerk=?, referee_time=?, memo=?, litigation_index=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationSpecialProcedure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryLitigationSpecialProcedureDO projectRecoveryLitigationSpecialProcedure) throws DataAccessException {
    	if (projectRecoveryLitigationSpecialProcedure == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-UPDATE", projectRecoveryLitigationSpecialProcedure);
    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_special_procedure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_special_procedure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryLitigationSpecialProcedureDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationSpecialProcedureDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryLitigationSpecialProcedureDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_special_procedure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_special_procedure where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryLitigationSpecialProcedureDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryLitigationSpecialProcedureDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-FIND-BY-RECOVERY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_special_procedure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_special_procedure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_special_procedure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_special_procedure where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-SPECIAL-PROCEDURE-DELETE-BY-RECOVERY-ID", param);
    }

}