/*
 * User: eldad.Dor
 * Date: 29/03/2015 12:52
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.route.destinations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

/**
 * @author eldad
 * @date 29/03/2015
 */
@MessageEndpoint(value = "nonXmlFilesEndPoint")
public class NonXmlFilesEndPoint {
	private static final Log log = LogFactory.getLog(NonXmlFilesEndPoint.class);

	public void handleFile(Message<?> message) {
		log.info("handleFile():");
	}
}