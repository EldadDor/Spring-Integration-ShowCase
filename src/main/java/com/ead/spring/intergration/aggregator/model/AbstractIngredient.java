package com.ead.spring.intergration.aggregator.model;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
public abstract class AbstractIngredient implements Ingredient {
	private int quantity;
	private long weight;

	@Override
	public int quantity() {
		return quantity;
	}

	@Override
	public long weight() {
		return weight;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}
}
