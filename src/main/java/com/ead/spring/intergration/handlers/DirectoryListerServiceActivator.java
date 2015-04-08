/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:00
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.handlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.history.MessageHistory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * @author eldad
 * @date 19/03/2015
 */
@Service
public class DirectoryListerServiceActivator {
	private static final Log log = LogFactory.getLog(DirectoryListerServiceActivator.class);

	@ServiceActivator
	public void processFile(Message<?> message) {
		log.info("processFile(): message=" + message.getPayload());
		for (Properties next : message.getHeaders().get(MessageHistory.HEADER_NAME, MessageHistory.class)) {
			final Object o = next.get(MessageHistory.NAME_PROPERTY);
			log.info("processFile(): passed via message history=" + o);
		}
	}
}