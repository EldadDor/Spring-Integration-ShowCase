/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:03
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.chaining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

import java.util.concurrent.TimeUnit;

/**
 * @author eldad
 * @date 19/03/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/chaning/showcase-context-ChainingInOnly.xml")
public class SpringIntegrationShowCaseChainingFilesTest {
	private static final Log log = LogFactory.getLog(SpringIntegrationShowCaseChainingFilesTest.class);
	@Autowired
	private ApplicationContext context;

	@Test
	public void testChaiing() throws Exception {
		log.info("testChaiing():");
		TimeUnit.MINUTES.sleep(50);

	}


}