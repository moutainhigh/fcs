/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationOpabilityReviewUpdownStreamDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_opability_review_updown_stream</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_opability_review_updown_stream.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FInvestigationOpabilityReviewUpdownStreamDAO {
	/**
	 *  Insert one <tt>FInvestigationOpabilityReviewUpdownStreamDO</tt> object to DB table <tt>f_investigation_opability_review_updown_stream</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_opability_review_updown_stream(op_review_id,up_or_down,name,clearing_form,payment_terms,ending_balance,remark,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReviewUpdownStream
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationOpabilityReviewUpdownStreamDO FInvestigationOpabilityReviewUpdownStream) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_opability_review_updown_stream</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_opability_review_updown_stream set op_review_id=?, up_or_down=?, name=?, clearing_form=?, payment_terms=?, ending_balance=?, remark=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReviewUpdownStream
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationOpabilityReviewUpdownStreamDO FInvestigationOpabilityReviewUpdownStream) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_opability_review_updown_stream</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_opability_review_updown_stream where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationOpabilityReviewUpdownStreamDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationOpabilityReviewUpdownStreamDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_opability_review_updown_stream</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_opability_review_updown_stream where (op_review_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param opReviewId
	 *	@return List<FInvestigationOpabilityReviewUpdownStreamDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationOpabilityReviewUpdownStreamDO> findByReviewId(long opReviewId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_opability_review_updown_stream</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_opability_review_updown_stream where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_opability_review_updown_stream</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_opability_review_updown_stream where (op_review_id = ?)</tt>
	 *
	 *	@param opReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReviewId(long opReviewId) throws DataAccessException;

}