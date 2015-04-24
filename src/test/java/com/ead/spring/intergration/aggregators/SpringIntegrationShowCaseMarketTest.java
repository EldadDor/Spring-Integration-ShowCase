/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:03
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.aggregators;

import com.ead.spring.intergration.aggregator.market.MarketGateway;
import com.ead.spring.intergration.aggregator.market.MarketManager;
import com.ead.spring.intergration.aggregator.market.Pallet;
import com.ead.spring.intergration.aggregator.market.fruits.Apple;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/aggregators/showcase-context-Market.xml")
public class SpringIntegrationShowCaseMarketTest {
	private static final Log log = LogFactory.getLog(SpringIntegrationShowCaseMarketTest.class);
	@Autowired
	private ApplicationContext context;

	@Test
	public void testFileFetch() throws Exception {
		log.info("testFileFetch():");
		final MarketGateway gateway = context.getBean(MarketGateway.class);
		final MarketManager marketManager = context.getBean(MarketManager.class);
		final Pallet applePallet = marketManager.createFruits(1000, Apple.class);
		gateway.placeDelivery(applePallet);
		final Pallet passedInspectionPallet = gateway.takePassedInspectionPallet();
		log.info("testFileFetch():");
	}


}