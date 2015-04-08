package com.ead.spring.intergration.route.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
public class MessageSelectorBean implements MessageSelector {
	private static final Log log = LogFactory.getLog(MessageSelectorBean.class);
	public boolean accept(Message<?> message) {
		return true;
	}
}
