package com.ead.spring.intergration.aggregator.market;

import java.util.Collection;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class DeliverySplitter {

	public Collection<Fruit> splitForInspection(FruitBox box) {
		return box.getFruits();
	}
}
