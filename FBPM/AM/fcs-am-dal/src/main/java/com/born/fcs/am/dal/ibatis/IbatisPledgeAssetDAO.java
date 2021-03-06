/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.am.dal.daointerface.PledgeAssetDAO;


// auto generated imports
import com.born.fcs.am.dal.dataobject.PledgeAssetDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.am.dal.daointerface.PledgeAssetDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/pledge_asset.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPledgeAssetDAO extends SqlMapClientDaoSupport implements PledgeAssetDAO {
	/**
	 *  Insert one <tt>PledgeAssetDO</tt> object to DB table <tt>pledge_asset</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into pledge_asset(type_id,asset_type,asset_type_desc,project_code,project_name,ownership_id,ownership_name,is_customer,warrant_no,evaluation_price,status,longitude,latitude,user_id,user_account,user_name,search_key,ralate_video,asset_remark_info,remark,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param pledgeAsset
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PledgeAssetDO pledgeAsset) throws DataAccessException {
    	if (pledgeAsset == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PLEDGE-ASSET-INSERT", pledgeAsset);

        return pledgeAsset.getAssetsId();
    }

	/**
	 *  Update DB table <tt>pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update pledge_asset set type_id=?, asset_type=?, asset_type_desc=?, project_code=?, project_name=?, ownership_id=?, ownership_name=?, is_customer=?, warrant_no=?, evaluation_price=?, status=?, longitude=?, latitude=?, user_id=?, user_account=?, user_name=?, search_key=?, ralate_video=?, asset_remark_info=?, remark=?, attach=? where (assets_id = ?)</tt>
	 *
	 *	@param pledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PledgeAssetDO pledgeAsset) throws DataAccessException {
    	if (pledgeAsset == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PLEDGE-ASSET-UPDATE", pledgeAsset);
    }

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_asset where (assets_id = ?)</tt>
	 *
	 *	@param assetsId
	 *	@return PledgeAssetDO
	 *	@throws DataAccessException
	 */	 
    public PledgeAssetDO findById(long assetsId) throws DataAccessException {
        Long param = new Long(assetsId);

        return (PledgeAssetDO) getSqlMapClientTemplate().queryForObject("MS-PLEDGE-ASSET-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from pledge_asset where (assets_id = ?)</tt>
	 *
	 *	@param assetsId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long assetsId) throws DataAccessException {
        Long param = new Long(assetsId);

        return getSqlMapClientTemplate().delete("MS-PLEDGE-ASSET-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_asset where (1 = 1)</tt>
	 *
	 *	@param pledgeAsset
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortOrder
	 *	@param sortCol
	 *	@param assetsIdList
	 *	@return List<PledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeAssetDO> findByCondition(PledgeAssetDO pledgeAsset, long limitStart, long pageSize, String sortOrder, String sortCol, List assetsIdList) throws DataAccessException {
    	if (pledgeAsset == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("pledgeAsset", pledgeAsset);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortOrder", sortOrder);
        param.put("sortCol", sortCol);
        param.put("assetsIdList", assetsIdList);

        return getSqlMapClientTemplate().queryForList("MS-PLEDGE-ASSET-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from pledge_asset where (1 = 1)</tt>
	 *
	 *	@param pledgeAsset
	 *	@param assetsIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PledgeAssetDO pledgeAsset, List assetsIdList) throws DataAccessException {
    	if (pledgeAsset == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("pledgeAsset", pledgeAsset);
        param.put("assetsIdList", assetsIdList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PLEDGE-ASSET-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}