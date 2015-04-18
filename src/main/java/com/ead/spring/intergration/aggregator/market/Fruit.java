package com.ead.spring.intergration.aggregator.market;

import java.awt.*;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public interface Fruit {
	long weight();

	Color color();

	boolean passedInspection();

	boolean isSoft();

	long diameter();

	double disColorationMargin();
}
