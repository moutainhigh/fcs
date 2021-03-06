/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FPayNotificationFeeDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FPayNotificationFeeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FPayNotificationFeeDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_pay_notification_fee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFPayNotificationFeeDAO extends SqlMapClientDaoSupport implements FPayNotificationFeeDAO {
	/**
	 *  Insert one <tt>FPayNotificationFeeDO</tt> object to DB table <tt>f_pay_notification_fee</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_pay_notification_fee(notification_id,type,charge_type,charge_type_desc,charge_way,charge_unit,charge_amount,charge_rate,actual_charge_amount,actual_charge_amount_check,start_time,end_time,remark,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FPayNotificationFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FPayNotificationFeeDO FPayNotificationFee) throws DataAccessException {
    	if (FPayNotificationFee == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-PAY-NOTIFICATION-FEE-INSERT", FPayNotificationFee);

        return FPayNotificationFee.getId();
    }

	/**
	 *  Update DB table <tt>f_pay_notification_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_pay_notification_fee set notification_id=?, type=?, charge_type=?, charge_type_desc=?, charge_way=?, charge_unit=?, charge_amount=?, charge_rate=?, actual_charge_amount=?, actual_charge_amount_check=?, start_time=?, end_time=?, remark=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FPayNotificationFee
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FPayNotificationFeeDO FPayNotificationFee) throws DataAccessException {
    	if (FPayNotificationFee == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PAY-NOTIFICATION-FEE-UPDATE", FPayNotificationFee);
    }

	/**
	 *  Query DB table <tt>f_pay_notification_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_pay_notification_fee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FPayNotificationFeeDO
	 *	@throws DataAccessException
	 */	 
    public FPayNotificationFeeDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FPayNotificationFeeDO) getSqlMapClientTemplate().queryForObject("MS-F-PAY-NOTIFICATION-FEE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_pay_notification_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_pay_notification_fee where (notification_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param notificationId
	 *	@return List<FPayNotificationFeeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FPayNotificationFeeDO> findByNotificationId(long notificationId) throws DataAccessException {
        Long param = new Long(notificationId);

        return getSqlMapClientTemplate().queryForList("MS-F-PAY-NOTIFICATION-FEE-FIND-BY-NOTIFICATION-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_pay_notification_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_pay_notification_fee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-PAY-NOTIFICATION-FEE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_pay_notification_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_pay_notification_fee where (notification_id = ?)</tt>
	 *
	 *	@param notificationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByNotificationId(long notificationId) throws DataAccessException {
        Long param = new Long(notificationId);

        return getSqlMapClientTemplate().delete("MS-F-PAY-NOTIFICATION-FEE-DELETE-BY-NOTIFICATION-ID", param);
    }

	/**
	 *  Query DB table <tt>f_pay_notification_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_pay_notification_fee where (1 = 1)</tt>
	 *
	 *	@param FPayNotificationFee
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FPayNotificationFeeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FPayNotificationFeeDO> findByCondition(FPayNotificationFeeDO FPayNotificationFee, long limitStart, long pageSize) throws DataAccessException {
    	if (FPayNotificationFee == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FPayNotificationFee", FPayNotificationFee);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-PAY-NOTIFICATION-FEE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_pay_notification_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_pay_notification_fee where (1 = 1)</tt>
	 *
	 *	@param FPayNotificationFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FPayNotificationFeeDO FPayNotificationFee) throws DataAccessException {
    	if (FPayNotificationFee == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-PAY-NOTIFICATION-FEE-FIND-BY-CONDITION-COUNT", FPayNotificationFee);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}