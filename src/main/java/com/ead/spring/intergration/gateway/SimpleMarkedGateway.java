package com.ead.spring.intergration.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import java.util.List;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@MessagingGateway(name = "simpleMarkedGateway", defaultRequestChannel = "allFilesChannel")
public interface SimpleMarkedGateway {
	@Gateway(requestChannel = "allFilesChannel", replyChannel = "outputChannel")
	List<SimpleRequest> somethingSimpleWithReply(SimpleRequest request);

	@Gateway(requestChannel = "allFilesChannel")
	SimpleRequest somethingSimple(SimpleRequest request);

	@Gateway(requestChannel = "outputChannel")
	void somethingSimpleNoReply(SimpleRequest request);

	@Gateway(requestChannel = "allFilesChannel")
	void somethingSimple(List<SimpleRequest> request);

	@Gateway(requestChannel = "allFilesChannel")
	List<SimpleRequest> getSomethingSimple();


}
