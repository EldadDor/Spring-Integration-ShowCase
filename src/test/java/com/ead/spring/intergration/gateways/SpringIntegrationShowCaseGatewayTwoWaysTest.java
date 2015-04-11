/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:03
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.gateways;

import com.ead.spring.intergration.gateway.SimpleGateway;
import com.ead.spring.intergration.gateway.SimpleRequest;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

import java.util.List;

/**
 * @author eldad
 * @date 19/03/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/gateways/showcase-context-simple-gatewayTwoWays.xml")
public class SpringIntegrationShowCaseGatewayTwoWaysTest {
	@Autowired
	private ApplicationContext context;

	@Test
	public void testFileFetch() throws Exception {
		final SimpleGateway gateway = context.getBean(SimpleGateway.class);
		final Object starting = context.getBean(("simpleRequest"), "Starting");
		gateway.somethingSimpleNoReply((SimpleRequest) starting);
		final List<SimpleRequest> requestList = gateway.getSomethingSimple();
		Assert.assertTrue(!requestList.isEmpty());
		gateway.somethingSimple(requestList);
	}

	@Test
	public void testGatewayListRequest() throws Exception {
		final SimpleGateway gateway = context.getBean(SimpleGateway.class);
		final SimpleRequest starting1 = (SimpleRequest) context.getBean(("simpleRequest"), "Starting1");
		final SimpleRequest starting2 = (SimpleRequest) context.getBean(("simpleRequest"), "Starting2");
		final List<SimpleRequest> requests = Lists.newLinkedList();
		requests.add(starting1);
		requests.add(starting2);
		gateway.somethingSimple(requests);

	}
}