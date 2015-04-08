/*
 * User: eldad.Dor
 * Date: 19/03/2015 23:05
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.handlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

import javax.annotation.PostConstruct;

/**
 * @author eldad
 * @date 19/03/2015
 */
@MessageEndpoint(value = "directoryListerEndPoint")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DirectoryListerEndPoint {
	private static final Log log = LogFactory.getLog(DirectoryListerEndPoint.class);
	private int counter;

	@PostConstruct
	public void initDirectoryListerEndPoint() {
		log.info("initDirectoryListerEndPoint(): counter=" + counter);
	}

	public void handleFile(Message<?> message) {
		log.info("handleFile(): counter pre=" + counter);
		log.info("handleFile(): message=" + message.getPayload());
		++counter;
		log.info("handleFile(): counter post=" + counter);
	}
}