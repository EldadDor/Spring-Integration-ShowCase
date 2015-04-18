package com.ead.spring.intergration.aggregator.market;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class FruitBox {
	public static final int MAX_FRUITS_IN_BOX = 40;
	private List<Fruit> fruits = Lists.newArrayListWithExpectedSize(MAX_FRUITS_IN_BOX);


	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	public boolean addFruit(Fruit fruit) {
		if (fruits.size() < MAX_FRUITS_IN_BOX) {
			fruits.add(fruit);
			return true;
		}
		return false;
	}
}
