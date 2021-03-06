/**
 * www.yiji.com Inc.
 * Copyright (c) 2013 All Rights Reserved.
 */
package com.bornsoft.jck.dal.ibatis;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.bornsoft.jck.dal.daointerface.SmsSendRecordDAOAbstract;
import com.bornsoft.jck.dal.dataobject.SmsSendRecordDO;

/**
 * An ibatis based implementation of dao interface <tt>com.bornsoft.jck.dal.daointerface.SmsSendRecordDAO</tt>.
 *
 * This file is generated by <tt>CodeMaker</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>yjh</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>CodeMaker/src/main/resources/templete/dao</tt>, and 
 * find the corresponding configuration file (<tt>daoAbstract.vm</tt>). 
 * Modify the vm file according to your needs, then run <tt>CodeMaker</tt> 
 * to generate this file.
 *
 * @author jlcon@qq.com
 */ 
@SuppressWarnings("deprecation")
public abstract class IbatisSmsSendRecordDAOAbstract extends SqlMapClientDaoSupport implements SmsSendRecordDAOAbstract {

	/**
	 *  Update DB table <tt>sms_send_record</tt>.
	 *
	 *	@param smsSendRecord
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SmsSendRecordDO smsSendRecord) throws DataAccessException {
    	if (smsSendRecord == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}

        return getSqlMapClientTemplate().update("MS-SMS-SEND-RECORD-UPDATE", smsSendRecord);
    }

	/**
	 *	@param smsSendRecord
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public java.lang.Long insert(SmsSendRecordDO smsSendRecord) throws DataAccessException {
    	if (smsSendRecord == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-SMS-SEND-RECORD-INSERT", smsSendRecord);

        return smsSendRecord.getRid();
    }

	/**
	 *	@param Rid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(String Rid) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-SMS-SEND-RECORD-DELETE-BY-ID", Rid);
    }
	
}