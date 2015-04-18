package com.ead.spring.intergration.aggregator.market.fruits;

import java.awt.*;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class Apple extends AbtractFruit {

	public Apple(long weight, Color color, boolean passedInspection, boolean isSoft, long diameter, double disColorationMargin) {
		super(weight, color, passedInspection, isSoft, diameter, disColorationMargin);
	}

	@Override
	public double disColorationMargin() {
		return disColorationMargin * 0.1;
	}
}
