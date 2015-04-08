package com.ead.spring.intergration.route.filter;

import com.ead.spring.intergration.route.model.SimplePojo;
import com.ead.spring.intergration.route.model.SimplePojoBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
@Service
public class NonPdfFilesChannelServiceActivator<T extends File> {
	private static final Log log = LogFactory.getLog(NonPdfFilesChannelServiceActivator.class);
	@ServiceActivator(inputChannel = "rejected")
	public Message<SimplePojo> handleMessage(Message<T> message) {
		final T payload = message.getPayload();
		final SimplePojo simplePojo = SimplePojoBuilder.aSimplePojo().withName(payload.getName()).withLength(payload.length()).build();
		return MessageBuilder.withPayload(simplePojo).build();
	}
}
