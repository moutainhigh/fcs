package com.born.fcs.face.integration.bpm.service;

import java.util.Map;

import com.born.fcs.pm.ws.info.common.FormInfo;
import com.born.fcs.pm.ws.order.common.SimpleUserInfo;

/**
 * 流程批量审核service，各业务自行实现
 * @author wuzj
 */
public interface WorkflowBatchProcessService {
	
	/**
	 * 不支持批量审核的任务
	 */
	String[] nonSupportTask();
	
	/**
	 * 检查是否支持批量审核
	 * @param form
	 * @return
	 */
	boolean isSupport(FormInfo form, SimpleUserInfo executor);
	
	/**
	 * 创建自流程自定义审核
	 * @param form
	 * @param taskUrl
	 * @return
	 */
	Map<String, Object> makeCustomizeMap(FormInfo form, SimpleUserInfo executor);
}
