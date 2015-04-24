package com.ead.spring.intergration.aggregator.market;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Pallet {
	public static final int MAX_BOXES_IN_PALLET = 12;
	private List<FruitBox> fruitBoxList;
	private boolean isFull = false;

	@PostConstruct
	public void init() {
		fruitBoxList = Lists.newLinkedList();
		final List<Fruit> fruitsInBox = Lists.newLinkedList();
	}

	public void addBox(FruitBox fruitBox) {
		fruitBoxList.add(fruitBox);
		if (fruitBoxList.size() == MAX_BOXES_IN_PALLET) {
			isFull = true;
		}
	}

	public List<FruitBox> getFruitBoxList() {
		return fruitBoxList;
	}

	public boolean isFull() {
		return isFull;
	}
}
