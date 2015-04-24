package com.ead.spring.intergration.aggregator.market;

import com.ead.spring.intergration.aggregator.market.fruits.AbtractFruit;
import com.google.common.collect.Maps;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
public class DeliveryAggregator {

	private static final Log log = LogFactory.getLog(DeliveryAggregator.class);

	@Autowired
	private ApplicationContext context;

	public Message<Pallet> aggregateFruits(Collection<Fruit> message) {
		final Pallet pallet = context.getBean(Pallet.class);
		final Map<Integer, FruitBox> fruitBoxesMap = Maps.newHashMap();
		for (int i = 0; i < Pallet.MAX_BOXES_IN_PALLET; i++) {
			final FruitBox fruitBox = context.getBean(FruitBox.class);
			fruitBox.setFruitBoxId(i);
			fruitBoxesMap.put(i, fruitBox);
			pallet.addBox(fruitBox);
		}
		for (Fruit fruit : message) {
			final FruitBox fruitBox = fruitBoxesMap.get(((AbtractFruit) fruit).getBox().getFruitBoxId());
			fruitBox.addFruit(fruit);
		}
		return MessageBuilder.withPayload(pallet).setHeaderIfAbsent("PALLET", "PALLET").build();
	}


}
