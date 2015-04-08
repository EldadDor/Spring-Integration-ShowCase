/*
 * User: eldad.Dor
 * Date: 29/03/2015 12:58
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.route.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.support.GenericMessage;

import java.io.File;
import java.util.Map;

/**
 * @author eldad
 * @date 29/03/2015
 */
public class XmlFileMessage extends GenericMessage<File> {
	private static final Log log = LogFactory.getLog(XmlFileMessage.class);

	public XmlFileMessage(File payload, Map<String, Object> headers) {
		super(payload, headers);
	}

	public XmlFileMessage(File payload) {
		super(payload);
	}
}