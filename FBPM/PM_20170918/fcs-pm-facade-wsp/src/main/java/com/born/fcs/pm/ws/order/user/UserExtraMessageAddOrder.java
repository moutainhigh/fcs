/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * hjiajie 上午9:57:25 创建
 */
package com.born.fcs.pm.ws.order.user;

import org.springframework.util.Assert;

import com.born.fcs.pm.ws.order.base.ValidateOrderBase;
import com.yjf.common.service.Order;

/**
 * 
 * 
 * @author hjiajie
 * 
 */
public class UserExtraMessageAddOrder extends ValidateOrderBase implements Order {
	
	private static final long serialVersionUID = 1L;
	
	private Long userId;
	
	private String userName;
	
	private String userAccount;
	
	private String userJudgeKey;
	
	private String oaSystemId;
	
	private String bankName;
	
	private String bankAccountNo;
	
	private String cancelAlert;
	
	//档案系统账号
	private String fileSysUname;
	//档案系统密码
	private String fileSysPsw;
	
	public Long getUserId() {
		return this.userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getOaSystemId() {
		return this.oaSystemId;
	}
	
	public void setOaSystemId(String oaSystemId) {
		this.oaSystemId = oaSystemId;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getUserAccount() {
		return this.userAccount;
	}
	
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	public String getUserJudgeKey() {
		return this.userJudgeKey;
	}
	
	public void setUserJudgeKey(String userJudgeKey) {
		this.userJudgeKey = userJudgeKey;
	}
	
	public String getCancelAlert() {
		return cancelAlert;
	}
	
	public void setCancelAlert(String cancelAlert) {
		this.cancelAlert = cancelAlert;
	}
	
	public String getFileSysUname() {
		return this.fileSysUname;
	}
	
	public void setFileSysUname(String fileSysUname) {
		this.fileSysUname = fileSysUname;
	}
	
	public String getFileSysPsw() {
		return this.fileSysPsw;
	}
	
	public void setFileSysPsw(String fileSysPsw) {
		this.fileSysPsw = fileSysPsw;
	}
	
	@Override
	public void check() {
		super.check();
		Assert.isTrue(userId > 0, "用户id不能为空！");
		Assert.notNull(userAccount, "用户登录名不能为空！");
	}
	
}
