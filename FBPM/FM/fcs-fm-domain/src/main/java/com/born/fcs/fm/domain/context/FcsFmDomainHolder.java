/**
 * www.yiji.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.born.fcs.fm.domain.context;

import java.io.Serializable;

import com.yjf.common.service.Order;

/**
 * @Filename EstateHolder.java
 *
 * @Description 独立线程持有
 *
 * @Version 1.0
 *
 * @Author hasulee
 *
 * @Email ligen@yiji.com
 *       
 * @History
 *<li>Author: hasulee</li>
 *<li>Date: 2012-7-2 下午6:44:47</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 */
public class FcsFmDomainHolder implements Serializable {
	
	private static final long						serialVersionUID	= -6099836956384599949L;
	
	private static ThreadLocal<FcsFmDomainContext<?>>	contextLocal		= new ThreadLocal<FcsFmDomainContext<?>>();
	
	public FcsFmDomainHolder() {
	}
	
	/**
	 * 获取上下文
	 * @return Returns the ContractContext
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Order> FcsFmDomainContext<T> get() {
		return (FcsFmDomainContext<T>) contextLocal.get();
	}
	
	/**
	 * 赋予上下文
	 * @param FcsFmDomainContext
	 */
	public static <T extends Order> void set(FcsFmDomainContext<T> context) {
		contextLocal.set(context);
	}
	
	/**
	 * 清理充值上下文
	 */
	public static void clear() {
		contextLocal.set(null);
	}
}
