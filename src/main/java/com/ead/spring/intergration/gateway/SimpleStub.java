package com.ead.spring.intergration.gateway;

import com.google.common.collect.Lists;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by EAD-MASTER on 10/4/2015.
 */
@Service
public class SimpleStub {
	private static final Log log = LogFactory.getLog(SimpleStub.class);
	private volatile String name;

	private float simpleNum = 1.5f;

	@PostConstruct
	public void init() {
		log.info("init():");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSimpleNum(float simpleNum) {
		this.simpleNum = simpleNum;
	}

	@ServiceActivator
	public List<SimpleRequest> handleWithReply(SimpleRequest request,
	                                           @Header(value = "RESPONSE_TYPE") String responseType) {
		log.info("handleWithReply(): request=" + request.getSomeMessageExtra() + " RESPONSE_TYPE=" + responseType);
		request.setSomeMessageExtra("StubHandler_");
		final List<SimpleRequest> list = Lists.newArrayList();
		list.add(request);
		return list;
	}

	@ServiceActivator
	public SimpleRequest handleWithReply(Object request) {
//		log.info("handleWithReply(): request=" + request.getSomeMessageExtra());
//		request.setSomeMessageExtra("StubHandler_");
//		return request;
		return null;
	}

	@ServiceActivator
	public void handleAsEndPoint(List<SimpleRequest> requestList) {
		for (SimpleRequest simpleRequest : requestList) {
			log.info("handleAsEndPoint(): simpleRequest=" + simpleRequest);
		}
	}

	/*@ServiceActivator
	public List<SimpleRequest> handleWithReply(SimpleRequest request) {
		log.info("handleWithReply(): request=" + request.getSomeMessageExtra());
		request.setSomeMessageExtra("StubHandler_");
		final List<SimpleRequest> list = Lists.newArrayList();
		list.add(request);
		return list;
	}*/

/*	@ServiceActivator
	public void handle(SimpleRequest request) {
		log.info("handle(): request=" + request.getSomeMessageExtra());
	}*/
}
