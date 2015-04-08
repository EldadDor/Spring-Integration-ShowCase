/*
 * User: eldad.Dor
 * Date: 29/03/2015 13:15
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.transform;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * @author eldad
 * @date 29/03/2015
 */
@Service
public class FilesTypesMessageTransformer {
	@Transformer
	public Message<?> transform(Message<?> message) {
		return message;
	}
}