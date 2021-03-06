/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCouncilSummaryProjectUnderwritingDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryProjectUnderwritingDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCouncilSummaryProjectUnderwritingDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_underwriting.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFCouncilSummaryProjectUnderwritingDAO extends SqlMapClientDaoSupport implements FCouncilSummaryProjectUnderwritingDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryProjectUnderwritingDO</tt> object to DB table <tt>f_council_summary_project_underwriting</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_project_underwriting(sp_id,bourse_id,bourse_name,release_rate,bourse_fee,bourse_fee_type,law_firm_fee,law_firm_fee_type,club_fee,club_fee_type,underwriting_fee,underwriting_fee_type,other_fee,other_fee_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectUnderwriting
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryProjectUnderwritingDO FCouncilSummaryProjectUnderwriting) throws DataAccessException {
    	if (FCouncilSummaryProjectUnderwriting == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-INSERT", FCouncilSummaryProjectUnderwriting);

        return FCouncilSummaryProjectUnderwriting.getId();
    }

	/**
	 *  Update DB table <tt>f_council_summary_project_underwriting</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project_underwriting set sp_id=?, bourse_id=?, bourse_name=?, release_rate=?, bourse_fee=?, bourse_fee_type=?, law_firm_fee=?, law_firm_fee_type=?, club_fee=?, club_fee_type=?, underwriting_fee=?, underwriting_fee_type=?, other_fee=?, other_fee_type=? where (id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectUnderwriting
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryProjectUnderwritingDO FCouncilSummaryProjectUnderwriting) throws DataAccessException {
    	if (FCouncilSummaryProjectUnderwriting == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-UPDATE", FCouncilSummaryProjectUnderwriting);
    }

	/**
	 *  Query DB table <tt>f_council_summary_project_underwriting</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_underwriting where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilSummaryProjectUnderwritingDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectUnderwritingDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FCouncilSummaryProjectUnderwritingDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_summary_project_underwriting</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_underwriting where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return FCouncilSummaryProjectUnderwritingDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectUnderwritingDO findBySpId(long spId) throws DataAccessException {
        Long param = new Long(spId);

        return (FCouncilSummaryProjectUnderwritingDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-FIND-BY-SP-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_underwriting</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_underwriting where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_underwriting</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_underwriting where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySpId(long spId) throws DataAccessException {
        Long param = new Long(spId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-SUMMARY-PROJECT-UNDERWRITING-DELETE-BY-SP-ID", param);
    }

}