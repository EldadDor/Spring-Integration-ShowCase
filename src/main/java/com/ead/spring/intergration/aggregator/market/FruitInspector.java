package com.ead.spring.intergration.aggregator.market;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
public class FruitInspector implements MessageSelector {

	@Override
	public boolean accept(Message<?> message) {
		return true;
	}

}
