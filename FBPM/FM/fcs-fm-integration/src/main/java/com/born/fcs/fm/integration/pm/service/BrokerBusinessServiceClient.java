package com.born.fcs.fm.integration.pm.service;

import java.net.SocketTimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.born.fcs.fm.integration.bpm.service.CallExternalInterface;
import com.born.fcs.fm.integration.bpm.service.ClientAutowiredBaseService;
import com.born.fcs.pm.ws.info.brokerbusiness.BrokerBusinessFormInfo;
import com.born.fcs.pm.ws.info.brokerbusiness.FBrokerBusinessInfo;
import com.born.fcs.pm.ws.order.brokerbusiness.BrokerBusinessQueryOrder;
import com.born.fcs.pm.ws.order.brokerbusiness.FBrokerBusinessOrder;
import com.born.fcs.pm.ws.result.base.FormBaseResult;
import com.born.fcs.pm.ws.result.base.QueryBaseBatchResult;
import com.born.fcs.pm.ws.service.brokerbusiness.BrokerBusinessService;

@Service("brokerBusinessServiceClient")
public class BrokerBusinessServiceClient extends ClientAutowiredBaseService implements
																			BrokerBusinessService {
	@Autowired
	BrokerBusinessService brokerBusinessWebService;
	
	@Override
	public FormBaseResult save(final FBrokerBusinessOrder order) {
		return callInterface(new CallExternalInterface<FormBaseResult>() {
			@Override
			public FormBaseResult call() throws SocketTimeoutException {
				return brokerBusinessWebService.save(order);
			}
		});
	}
	
	@Override
	public QueryBaseBatchResult<BrokerBusinessFormInfo> queryPage(	final BrokerBusinessQueryOrder order) {
		return callInterface(new CallExternalInterface<QueryBaseBatchResult<BrokerBusinessFormInfo>>() {
			@Override
			public QueryBaseBatchResult<BrokerBusinessFormInfo> call()
																		throws SocketTimeoutException {
				return brokerBusinessWebService.queryPage(order);
			}
		});
	}
	
	@Override
	public FBrokerBusinessInfo findByFormId(final long formId) {
		return callInterface(new CallExternalInterface<FBrokerBusinessInfo>() {
			@Override
			public FBrokerBusinessInfo call() throws SocketTimeoutException {
				return brokerBusinessWebService.findByFormId(formId);
			}
		});
	}
}
