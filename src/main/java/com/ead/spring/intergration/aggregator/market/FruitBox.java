package com.ead.spring.intergration.aggregator.market;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FruitBox {
	public static final int MAX_FRUITS_IN_BOX = 40;
	private List<Fruit> fruits = Lists.newArrayListWithExpectedSize(MAX_FRUITS_IN_BOX);
	private Pallet containingPallet;
	private int fruitBoxId;

	public int getFruitBoxId() {
		return fruitBoxId;
	}

	public void setFruitBoxId(int fruitBoxId) {
		this.fruitBoxId = fruitBoxId;
	}

	public void setContainingPallet(Pallet containingPallet) {
		this.containingPallet = containingPallet;
	}

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
