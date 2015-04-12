package com.ead.spring.intergration.aggregator.kitchen.model;

import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class Oil extends AbstractIngredient {
	public Oil() {
	}

	public Oil(long weight) {
		super.setWeight(weight);
	}


	@Override
	public String addToBowl() {
		return "Adding " + super.weight() + "ml of Oil";
	}

	@Override
	public void setMass(long mass) {
		super.setWeight(mass);
	}
}
