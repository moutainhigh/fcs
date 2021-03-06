/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.CouncilProjectVoteDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>council_project_vote</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/council_project_vote.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CouncilProjectVoteDAO {
	/**
	 *  Insert one <tt>CouncilProjectVoteDO</tt> object to DB table <tt>council_project_vote</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into council_project_vote(council_project_id,council_id,council_code,project_code,project_name,judge_id,judge_name,role_id,role_name,org_name,vote_status,vote_result,vote_result_desc,vote_remark,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param councilProjectVote
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CouncilProjectVoteDO councilProjectVote) throws DataAccessException;

	/**
	 *  Update DB table <tt>council_project_vote</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update council_project_vote set council_project_id=?, council_id=?, council_code=?, project_code=?, project_name=?, judge_id=?, judge_name=?, role_id=?, role_name=?, org_name=?, vote_status=?, vote_result=?, vote_result_desc=?, vote_remark=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param councilProjectVote
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CouncilProjectVoteDO councilProjectVote) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_project_vote where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CouncilProjectVoteDO
	 *	@throws DataAccessException
	 */	 
    public CouncilProjectVoteDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_project_vote where ((council_id = ?) AND (project_code = ?) AND (judge_id = ?))</tt>
	 *
	 *	@param councilId
	 *	@param projectCode
	 *	@param judgeId
	 *	@return CouncilProjectVoteDO
	 *	@throws DataAccessException
	 */	 
    public CouncilProjectVoteDO findProjectsVote(long councilId, String projectCode, long judgeId) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_project_vote where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return List<CouncilProjectVoteDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilProjectVoteDO> findByCouncilId(long councilId) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_project_vote where ((council_id = ?) AND (project_code = ?))</tt>
	 *
	 *	@param councilId
	 *	@param projectCode
	 *	@return List<CouncilProjectVoteDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilProjectVoteDO> findByProjectIdAndCouncilId(long councilId, String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_project_vote</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_project_vote where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_project_vote</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_project_vote where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCouncilId(long councilId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_project_vote</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_project_vote where ((council_id = ?) AND (project_code = ?))</tt>
	 *
	 *	@param councilId
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCouncilIdProjectCode(long councilId, String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_project_vote where (1 = 1)</tt>
	 *
	 *	@param councilProjectVote
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CouncilProjectVoteDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilProjectVoteDO> findByCondition(CouncilProjectVoteDO councilProjectVote, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_project_vote</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from council_project_vote where (1 = 1)</tt>
	 *
	 *	@param councilProjectVote
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CouncilProjectVoteDO councilProjectVote) throws DataAccessException;

}