/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectExtendInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_extend_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_extend_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectExtendInfoDAO {
	/**
	 *  Insert one <tt>ProjectExtendInfoDO</tt> object to DB table <tt>project_extend_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_extend_info(extend_id,form_id,project_code,property,property_name,property_value,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectExtendInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectExtendInfoDO projectExtendInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_extend_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_extend_info set form_id=?, project_code=?, property=?, property_name=?, property_value=?, remark=? where (extend_id = ?)</tt>
	 *
	 *	@param projectExtendInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectExtendInfoDO projectExtendInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_extend_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_extend_info where (extend_id = ?)</tt>
	 *
	 *	@param extendId
	 *	@return ProjectExtendInfoDO
	 *	@throws DataAccessException
	 */	 
    public ProjectExtendInfoDO findById(long extendId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_extend_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_extend_info where ((project_code = ?) AND (property = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param property
	 *	@return List<ProjectExtendInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectExtendInfoDO> findByProjectCodeAndProperty(String projectCode, String property) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_extend_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_extend_info where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return ProjectExtendInfoDO
	 *	@throws DataAccessException
	 */	 
    public ProjectExtendInfoDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_extend_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_extend_info where (extend_id = ?)</tt>
	 *
	 *	@param extendId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long extendId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_extend_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_extend_info where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_extend_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_extend_info where ((project_code = ?) AND (property = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param property
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCodeAndProperty(String projectCode, String property) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_extend_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_extend_info where (1 = 1)</tt>
	 *
	 *	@param projectExtendInfo
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectExtendInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectExtendInfoDO> findByCondition(ProjectExtendInfoDO projectExtendInfo, long loginUserId, List deptIdList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_extend_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_extend_info where (1 = 1)</tt>
	 *
	 *	@param projectExtendInfo
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectExtendInfoDO projectExtendInfo, long loginUserId, List deptIdList) throws DataAccessException;

}