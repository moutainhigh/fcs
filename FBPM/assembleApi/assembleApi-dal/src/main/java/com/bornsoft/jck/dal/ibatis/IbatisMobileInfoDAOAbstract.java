/**
 * www.yiji.com Inc.
 * Copyright (c) 2013 All Rights Reserved.
 */
package com.bornsoft.jck.dal.ibatis;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.bornsoft.jck.dal.daointerface.MobileInfoDAOAbstract;
import com.bornsoft.jck.dal.dataobject.MobileInfoDO;

/**
 * An ibatis based implementation of dao interface <tt>com.bornsoft.jck.dal.daointerface.MobileInfoDAO</tt>.
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
public abstract class IbatisMobileInfoDAOAbstract extends SqlMapClientDaoSupport implements MobileInfoDAOAbstract {

	/**
	 *  Update DB table <tt>mobile_info</tt>.
	 *
	 *	@param mobileInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(MobileInfoDO mobileInfo) throws DataAccessException {
    	if (mobileInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}

        return getSqlMapClientTemplate().update("MS-MOBILE-INFO-UPDATE", mobileInfo);
    }

	/**
	 *	@param mobileInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public java.lang.Long insert(MobileInfoDO mobileInfo) throws DataAccessException {
    	if (mobileInfo == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-MOBILE-INFO-INSERT", mobileInfo);

        return mobileInfo.getMid();
    }

	/**
	 *	@param Mid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(String Mid) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-MOBILE-INFO-DELETE-BY-ID", Mid);
    }
	
}