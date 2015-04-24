package com.ead.spring.intergration.aggregator.market;

import com.ead.spring.intergration.aggregator.market.fruits.AbtractFruit;
import com.ead.spring.intergration.aggregator.market.fruits.FruitFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
public class MarketManager {

	@Autowired
	private ApplicationContext context;

	public <T extends Fruit> Pallet createFruits(int amountOfFruit, Class<T> fruitClass) {
		final Pallet pallet = context.getBean(Pallet.class);
		for (int i = 0; i < amountOfFruit && i < Pallet.MAX_BOXES_IN_PALLET; i++) {
			final FruitBox fruitBox = context.getBean(FruitBox.class);
			fruitBox.setContainingPallet(pallet);
			for (int j = 0; j < FruitBox.MAX_FRUITS_IN_BOX; j++) {
				fruitBox.setFruitBoxId(i);
				final Fruit fruit = FruitFactory.createFruit(fruitClass);
				if (fruit != null) {
					((AbtractFruit) fruit).setBox(fruitBox);
				}
				fruitBox.addFruit(fruit);
			}
			pallet.addBox(fruitBox);
		}
		return pallet;
	}
}
