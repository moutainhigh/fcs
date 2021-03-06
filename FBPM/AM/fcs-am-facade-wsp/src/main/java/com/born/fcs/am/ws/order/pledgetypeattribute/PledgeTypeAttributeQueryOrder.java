package com.born.fcs.am.ws.order.pledgetypeattribute;

import java.util.Date;

import com.born.fcs.pm.ws.base.QueryPageBase;

/**
 * 资产-抵质押品分类-属性Order
 *
 * @author jil
 *
 */
public class PledgeTypeAttributeQueryOrder extends QueryPageBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6094489175092936966L;
	
	private Long attributeId;
	
	private long assetsId;
	
	private long typeId;
	
	private String attributeKey;
	
	private String attributeValue;
	
	private String customType;
	
	private Date rawAddTime;
	
	public Long getAttributeId() {
		return attributeId;
	}
	
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}
	
	public long getAssetsId() {
		return assetsId;
	}
	
	public void setAssetsId(long assetsId) {
		this.assetsId = assetsId;
	}
	
	public long getTypeId() {
		return typeId;
	}
	
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	
	public String getAttributeKey() {
		return attributeKey;
	}
	
	public void setAttributeKey(String attributeKey) {
		this.attributeKey = attributeKey;
	}
	
	public String getAttributeValue() {
		return attributeValue;
	}
	
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	public String getCustomType() {
		return customType;
	}
	
	public void setCustomType(String customType) {
		this.customType = customType;
	}
	
	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
}
