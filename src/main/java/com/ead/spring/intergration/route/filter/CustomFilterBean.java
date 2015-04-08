package com.ead.spring.intergration.route.filter;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
@Service
public class CustomFilterBean {
//		implements MessageSelector {
	private static final Log log = LogFactory.getLog(CustomFilterBean.class);

	public boolean filter(Message<?> message) {
		if (message.getPayload() instanceof File) {
			if (FilenameUtils.isExtension(((File) message.getPayload()).getName(), "pdf")) {
				return true;
			}
		}
		return false;
	}

}
