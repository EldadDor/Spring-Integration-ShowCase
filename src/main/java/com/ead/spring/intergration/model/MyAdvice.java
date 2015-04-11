package com.ead.spring.intergration.model;

import org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 10/4/2015.
 */
@Service
public class MyAdvice extends AbstractRequestHandlerAdvice {

	@Override
	protected Object doInvoke(ExecutionCallback callback, Object target, Message<?> message) throws Exception {
		// add code before the invocation
		Object result = callback.execute();
		// add code after the invocation
		return result;
	}
}
