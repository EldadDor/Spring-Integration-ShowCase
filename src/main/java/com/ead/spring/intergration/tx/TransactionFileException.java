/*
 * User: eldad.Dor
 * Date: 22/03/2015 18:24
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.tx;

import org.springframework.messaging.MessagingException;

/**
 * @author eldad
 * @date 22/03/2015
 */
public class TransactionFileException extends MessagingException {

	public TransactionFileException(String description) {
		super(description);
	}
}