package com.ead.spring.intergration.route.filter;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */

public class PdfFilesChannelOnlyEndPoint {
	@ServiceActivator(outputChannel = "queueChannel")
	public Message<?> handle(Message<?> message) {
		message.getPayload();
		return message;
	}
}
