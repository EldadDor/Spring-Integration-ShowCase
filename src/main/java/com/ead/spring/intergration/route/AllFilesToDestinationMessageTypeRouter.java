/*
 * User: eldad.Dor
 * Date: 29/03/2015 13:06
 
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
public class AllFilesToDestinationMessageTypeRouter {
	private static final Log log = LogFactory.getLog(AllFilesToDestinationNameRouter.class);

	public Message<?> routeToDestination(Message<?> message) {
		log.info("routeToDestination():");
		return message;
	}
}