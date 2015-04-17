/*
 * User: eldad.Dor
 * Date: 29/03/2015 12:47
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.route;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * @author eldad
 * @date 29/03/2015
 */
@Service
public class AllFilesToDestinationNameRouter {
	private static final Log log = LogFactory.getLog(AllFilesToDestinationNameRouter.class);

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			final int rand = 1 + (int) (Math.random() * ((3 - 1) + 1));
			log.info("main(): rand=" + rand);
		}
	}

	public String routeToDestination(Message<?> message) {
		log.info("routeToDestination():");
		final int rand = 1 + (int) (Math.random() * ((3 - 1) + 1));
		log.info("routeToDestination(): rand=" + rand);
		if (rand <= 2) {
			return "xmlFilesChannel";
		} else {
			return "nonXmlFilesChannel";
		}
	}
}