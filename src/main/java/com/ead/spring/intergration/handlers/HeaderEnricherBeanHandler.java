package com.ead.spring.intergration.handlers;

import com.ead.spring.intergration.model.HeaderPojo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
public class HeaderEnricherBeanHandler {
	private static final Log log = LogFactory.getLog(HeaderEnricherBeanHandler.class);

	public Message<?> enrichMessageWithSequence(Message<?> message) {
		int sequence = 100 + new Random().nextInt(250);
		final HeaderPojo headerPojo = new HeaderPojo(sequence);
		return MessageBuilder.withPayload(headerPojo).build();
	}

	public Message<?> enrichMessageWithName(Message<?> message) {
		int sequence = 100 + new Random().nextInt(250);
		HeaderPojo headerPojo;
		if (sequence > 200) {
			headerPojo = new HeaderPojo("SALSA");
		} else {
			headerPojo = new HeaderPojo("SOYA");
		}
		return MessageBuilder.withPayload(headerPojo).build();
	}

}
