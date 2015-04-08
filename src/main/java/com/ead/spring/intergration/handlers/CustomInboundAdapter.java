/*
 * User: eldad.Dor
 * Date: 29/03/2015 13:35
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.handlers;

import com.ead.spring.intergration.route.model.SimplePojo;
import com.ead.spring.intergration.route.model.SimplePojoBuilder;
import com.google.common.collect.Maps;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author eldad
 * @date 29/03/2015
 */
@Service
public class CustomInboundAdapter {
	private static final Log log = LogFactory.getLog(CustomInboundAdapter.class);

	public Message<?> createInBoundMessages() {
		final SimplePojo simplePojo = SimplePojoBuilder.aSimplePojo().withName("Rad_" + Math.random() * 31).withLength((long) Math.random()).build();
		final Map<String, Object> headers = Maps.newHashMap();
		headers.put("CustomAdapter", simplePojo.getName());
		final Message<SimplePojo> message = MessageBuilder.createMessage(simplePojo, new MessageHeaders(headers));
		return message;
	}
}