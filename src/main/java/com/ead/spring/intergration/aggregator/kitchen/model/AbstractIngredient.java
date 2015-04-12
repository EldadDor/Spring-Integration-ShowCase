package com.ead.spring.intergration.aggregator.kitchen.model;

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

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public void setWeight(long weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{" + getClass().getSimpleName() +
				"= quantity=" + quantity +
				", weight=" + weight +
				'}';
	}
}
