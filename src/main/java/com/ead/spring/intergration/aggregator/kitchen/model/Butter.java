package com.ead.spring.intergration.aggregator.kitchen.model;

import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class Butter extends AbstractIngredient {

	public Butter() {
	}

	public Butter(long weight) {
		super.setWeight(weight);
	}

	@Override
	public String addToBowl() {
		return "Adding " + super.weight() + "gr of Butter";
	}

	@Override
	public void setMass(long mass) {
		super.setWeight(mass);
	}
}
