/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.CouncilParticipantDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>council_participants</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/council_participants.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CouncilParticipantDAO {
	/**
	 *  Insert one <tt>CouncilParticipantDO</tt> object to DB table <tt>council_participants</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into council_participants(council_id,council_code,participant_id,participant_name,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param councilParticipant
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CouncilParticipantDO councilParticipant) throws DataAccessException;

	/**
	 *  Update DB table <tt>council_participants</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update council_participants set council_id=?, council_code=?, participant_id=?, participant_name=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param councilParticipant
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CouncilParticipantDO councilParticipant) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_participants</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_participants where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CouncilParticipantDO
	 *	@throws DataAccessException
	 */	 
    public CouncilParticipantDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_participants</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_participants where (council_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param councilId
	 *	@return List<CouncilParticipantDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilParticipantDO> findByCouncilId(long councilId) throws DataAccessException;

	/**
	 *  Query DB table <tt>council_participants</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_participants where (council_code = ?) order by sort_order ASC</tt>
	 *
	 *	@param councilCode
	 *	@return List<CouncilParticipantDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilParticipantDO> findByCouncilCode(String councilCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_participants</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_participants where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_participants</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_participants where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCouncilId(long councilId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>council_participants</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_participants where (council_code = ?)</tt>
	 *
	 *	@param councilCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCouncilCode(String councilCode) throws DataAccessException;

}