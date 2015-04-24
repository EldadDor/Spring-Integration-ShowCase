package com.ead.spring.intergration.aggregator.market;

import org.springframework.integration.aggregator.CorrelationStrategy;
import org.springframework.messaging.Message;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
//@Service
public class FruitsCorrelationStrategy implements CorrelationStrategy {
	@Override
	public Object getCorrelationKey(Message<?> message) {
		return null;
	}
}
