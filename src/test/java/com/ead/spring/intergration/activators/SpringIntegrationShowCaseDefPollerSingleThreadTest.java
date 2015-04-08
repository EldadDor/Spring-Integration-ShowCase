/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:03
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.activators;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

import java.util.concurrent.TimeUnit;

/**
 * @author eldad
 * @date 19/03/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/service-activators/showcase-context-default_poller_single_thread.xml")
public class SpringIntegrationShowCaseDefPollerSingleThreadTest {
	@Test
	public void testFileFetch() throws Exception {
		TimeUnit.MINUTES.sleep(50);

	}
}