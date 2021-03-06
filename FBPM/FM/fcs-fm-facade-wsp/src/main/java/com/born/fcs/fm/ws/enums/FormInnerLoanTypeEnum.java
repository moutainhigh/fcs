/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * hjiajie 下午2:18:14 创建
 */
package com.born.fcs.fm.ws.enums;

/**
 * 内部借款申请单 -- 付息方式
 * 
 * @author hjiajie
 * 
 */
public enum FormInnerLoanTypeEnum {
	
	/*** 协议借款 */
	LOAN_AGREEMENT("LOAN_AGREEMENT", "协议借款"),
	/*** 备用金 */
	PETTY_CASH("PETTY_CASH", "备用金"),
	
	;
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 
	 * @param code 枚举值
	 * @param message 枚举描述
	 */
	private FormInnerLoanTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 * 
	 * @param code
	 * @return FormInnerLoanInterestTypeEnum
	 */
	public static FormInnerLoanTypeEnum getByCode(String code) {
		for (FormInnerLoanTypeEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<FormInnerLoanInterestTypeEnum>
	 */
	public static java.util.List<FormInnerLoanTypeEnum> getAllEnum() {
		java.util.List<FormInnerLoanTypeEnum> list = new java.util.ArrayList<FormInnerLoanTypeEnum>(
			values().length);
		for (FormInnerLoanTypeEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public static java.util.List<String> getAllEnumCode() {
		java.util.List<String> list = new java.util.ArrayList<String>(values().length);
		for (FormInnerLoanTypeEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
	
	/**
	 * 通过code获取msg
	 * @param code 枚举值
	 * @return
	 */
	public static String getMsgByCode(String code) {
		if (code == null) {
			return null;
		}
		FormInnerLoanTypeEnum _enum = getByCode(code);
		if (_enum == null) {
			return null;
		}
		return _enum.getMessage();
	}
	
	/**
	 * 获取枚举code
	 * @param _enum
	 * @return
	 */
	public static String getCode(FormInnerLoanTypeEnum _enum) {
		if (_enum == null) {
			return null;
		}
		return _enum.getCode();
	}
}
