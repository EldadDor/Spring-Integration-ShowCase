package com.ead.spring.intergration.gateway;

import java.util.List;

/**
 * Created by EAD-MASTER on 10/4/2015.
 */
public interface SimpleGateway {
	List<SimpleRequest> somethingSimpleWithReply(SimpleRequest request);

	SimpleRequest somethingSimple(SimpleRequest request);

	void somethingSimpleNoReply(SimpleRequest request);

	void somethingSimple(List<SimpleRequest> request);

	List<SimpleRequest> getSomethingSimple();


}
