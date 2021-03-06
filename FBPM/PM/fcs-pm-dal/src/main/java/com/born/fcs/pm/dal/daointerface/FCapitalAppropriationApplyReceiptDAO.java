/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCapitalAppropriationApplyReceiptDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_capital_appropriation_apply_receipt</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_capital_appropriation_apply_receipt.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCapitalAppropriationApplyReceiptDAO {
	/**
	 *  Insert one <tt>FCapitalAppropriationApplyReceiptDO</tt> object to DB table <tt>f_capital_appropriation_apply_receipt</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_capital_appropriation_apply_receipt(form_id,stroke_time,payee_account_name,bank_account,payee_account,payment_amount,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCapitalAppropriationApplyReceipt
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCapitalAppropriationApplyReceiptDO FCapitalAppropriationApplyReceipt) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_capital_appropriation_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_capital_appropriation_apply_receipt set form_id=?, stroke_time=?, payee_account_name=?, bank_account=?, payee_account=?, payment_amount=?, attach=? where (id = ?)</tt>
	 *
	 *	@param FCapitalAppropriationApplyReceipt
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCapitalAppropriationApplyReceiptDO FCapitalAppropriationApplyReceipt) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply_receipt where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCapitalAppropriationApplyReceiptDO
	 *	@throws DataAccessException
	 */	 
    public FCapitalAppropriationApplyReceiptDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply_receipt where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCapitalAppropriationApplyReceiptDO
	 *	@throws DataAccessException
	 */	 
    public FCapitalAppropriationApplyReceiptDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_capital_appropriation_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_capital_appropriation_apply_receipt where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply_receipt where (1 = 1)</tt>
	 *
	 *	@param FCapitalAppropriationApplyReceipt
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FCapitalAppropriationApplyReceiptDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCapitalAppropriationApplyReceiptDO> findByCondition(FCapitalAppropriationApplyReceiptDO FCapitalAppropriationApplyReceipt, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_capital_appropriation_apply_receipt where (1 = 1)</tt>
	 *
	 *	@param FCapitalAppropriationApplyReceipt
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCapitalAppropriationApplyReceiptDO FCapitalAppropriationApplyReceipt) throws DataAccessException;

}