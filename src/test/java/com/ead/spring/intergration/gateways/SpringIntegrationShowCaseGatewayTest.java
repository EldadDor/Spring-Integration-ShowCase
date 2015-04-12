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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

/**
 * @author eldad
 * @date 19/03/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/gateways/showcase-context-simple-gateway.xml")
public class SpringIntegrationShowCaseGatewayTest {
	@Autowired
	private ApplicationContext context;
	@Test
	public void testFileFetch() throws Exception {
		final SimpleGateway gateway = context.getBean(SimpleGateway.class);
		final Object starting = context.getBean(("simpleRequest"), "Starting");
		final SimpleRequest simpleRequest = gateway.somethingSimple((SimpleRequest) starting);
	}
}