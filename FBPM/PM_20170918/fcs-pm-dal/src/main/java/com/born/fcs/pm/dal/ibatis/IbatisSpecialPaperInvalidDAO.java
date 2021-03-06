/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.SpecialPaperInvalidDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.SpecialPaperInvalidDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.SpecialPaperInvalidDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/special_paper_invalid.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisSpecialPaperInvalidDAO extends SqlMapClientDaoSupport implements SpecialPaperInvalidDAO {
	/**
	 *  Insert one <tt>SpecialPaperInvalidDO</tt> object to DB table <tt>special_paper_invalid</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into special_paper_invalid(receive_man_id,receive_man_name,keeping_man_id,keeping_man_name,pieces,receive_date,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param specialPaperInvalid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SpecialPaperInvalidDO specialPaperInvalid) throws DataAccessException {
    	if (specialPaperInvalid == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-SPECIAL-PAPER-INVALID-INSERT", specialPaperInvalid);

        return specialPaperInvalid.getId();
    }

	/**
	 *  Update DB table <tt>special_paper_invalid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update special_paper_invalid set receive_man_id=?, receive_man_name=?, keeping_man_id=?, keeping_man_name=?, pieces=?, receive_date=?, remark=? where (id = ?)</tt>
	 *
	 *	@param specialPaperInvalid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SpecialPaperInvalidDO specialPaperInvalid) throws DataAccessException {
    	if (specialPaperInvalid == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-SPECIAL-PAPER-INVALID-UPDATE", specialPaperInvalid);
    }

	/**
	 *  Query DB table <tt>special_paper_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from special_paper_invalid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return SpecialPaperInvalidDO
	 *	@throws DataAccessException
	 */	 
    public SpecialPaperInvalidDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (SpecialPaperInvalidDO) getSqlMapClientTemplate().queryForObject("MS-SPECIAL-PAPER-INVALID-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>special_paper_invalid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from special_paper_invalid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-SPECIAL-PAPER-INVALID-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>special_paper_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from special_paper_invalid where (1 = 1)</tt>
	 *
	 *	@param specialPaperInvalid
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SpecialPaperInvalidDO>
	 *	@throws DataAccessException
	 */	 
    public List<SpecialPaperInvalidDO> findByCondition(SpecialPaperInvalidDO specialPaperInvalid, long limitStart, long pageSize) throws DataAccessException {
    	if (specialPaperInvalid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("specialPaperInvalid", specialPaperInvalid);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-SPECIAL-PAPER-INVALID-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>special_paper_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from special_paper_invalid where (1 = 1)</tt>
	 *
	 *	@param specialPaperInvalid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SpecialPaperInvalidDO specialPaperInvalid) throws DataAccessException {
    	if (specialPaperInvalid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-SPECIAL-PAPER-INVALID-FIND-BY-CONDITION-COUNT", specialPaperInvalid);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}