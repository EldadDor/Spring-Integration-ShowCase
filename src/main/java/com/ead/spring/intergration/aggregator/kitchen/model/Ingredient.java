package com.ead.spring.intergration.aggregator.kitchen.model;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
public interface Ingredient {
	int quantity();

	long weight();

	String addToBowl();

	void setQuantity(int quantity);

	void setWeight(long weight);

	void setMass(long mass);
}
