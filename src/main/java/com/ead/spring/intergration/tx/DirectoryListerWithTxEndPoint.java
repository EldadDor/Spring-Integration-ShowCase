/*
 * User: eldad.Dor
 * Date: 22/03/2015 18:22
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.tx;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

import java.io.File;

/**
 * @author eldad
 * @date 22/03/2015
 */
@MessageEndpoint(value = "directoryListerTxEndPoint")
public class DirectoryListerWithTxEndPoint {

	private static final Log log = LogFactory.getLog(DirectoryListerWithTxEndPoint.class);

	public void handleFile(Message<?> message) {
		log.info("handleFile(): message=" + message.getPayload());
		if (message.getPayload() instanceof File) {
			if (((File) message.getPayload()).isFile()) {
				throw new TransactionFileException("File=" + ((File) message.getPayload()).getName() + " is not a directory");
			}
		}
	}
}