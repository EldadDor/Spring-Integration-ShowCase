package com.ead.spring.intergration.aggregator.market;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class FruitInspector implements MessageSelector {

	@Override
	public boolean accept(Message<?> message) {
		return false;
	}

}
