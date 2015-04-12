package com.ead.spring.intergration.aggregator.kitchen.model;

import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class Flour extends AbstractIngredient {
	public Flour() {
	}

	public Flour(long weight) {
		super.setWeight(weight);
	}


	@Override
	public String addToBowl() {
		return "Adding " + super.weight() + "gr of Flour";
	}

	@Override
	public void setMass(long mass) {
		super.setWeight(mass);
	}
}
