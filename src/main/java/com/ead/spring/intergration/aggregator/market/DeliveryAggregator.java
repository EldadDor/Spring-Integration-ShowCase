package com.ead.spring.intergration.aggregator.market;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
public class DeliveryAggregator {

	public Pallet aggregateFruits(Message<Fruit> message) {
		final Fruit fruit = message.getPayload();
		return null;
	}
}
