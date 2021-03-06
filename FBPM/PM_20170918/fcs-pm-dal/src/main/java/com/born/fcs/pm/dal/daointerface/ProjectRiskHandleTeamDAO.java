/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRiskHandleTeamDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_risk_handle_team</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_risk_handle_team.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectRiskHandleTeamDAO {
	/**
	 *  Insert one <tt>ProjectRiskHandleTeamDO</tt> object to DB table <tt>project_risk_handle_team</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_risk_handle_team(team_id,customer_id,customer_name,project_code,project_name,busi_manager_id,busi_manager_name,chief_leader_id,chief_leader_name,vice_leader_id,vice_leader_name,member_ids,member_names,create_man_id,create_man_name,create_time,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRiskHandleTeam
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRiskHandleTeamDO projectRiskHandleTeam) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_risk_handle_team</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_risk_handle_team set customer_id=?, customer_name=?, project_code=?, project_name=?, busi_manager_id=?, busi_manager_name=?, chief_leader_id=?, chief_leader_name=?, vice_leader_id=?, vice_leader_name=?, member_ids=?, member_names=?, create_man_id=?, create_man_name=?, create_time=? where (team_id = ?)</tt>
	 *
	 *	@param projectRiskHandleTeam
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRiskHandleTeamDO projectRiskHandleTeam) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_handle_team</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_risk_handle_team where (team_id = ?)</tt>
	 *
	 *	@param teamId
	 *	@return ProjectRiskHandleTeamDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRiskHandleTeamDO findById(long teamId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_handle_team</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_risk_handle_team where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return ProjectRiskHandleTeamDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRiskHandleTeamDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_risk_handle_team</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_risk_handle_team where (team_id = ?)</tt>
	 *
	 *	@param teamId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long teamId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_handle_team</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select item.* from project_risk_handle_team item where (1 = 1)</tt>
	 *
	 *	@param projectRiskHandleTeam
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<ProjectRiskHandleTeamDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRiskHandleTeamDO> findByCondition(ProjectRiskHandleTeamDO projectRiskHandleTeam, long limitStart, long pageSize, Date startTimeBegin, Date startTimeEnd, long loginUserId, List deptIdList, List relatedRoleList, String sortCol, String sortOrder) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_handle_team</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_risk_handle_team where (1 = 1)</tt>
	 *
	 *	@param projectRiskHandleTeam
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectRiskHandleTeamDO projectRiskHandleTeam, Date startTimeBegin, Date startTimeEnd, long loginUserId, List deptIdList, List relatedRoleList) throws DataAccessException;

}