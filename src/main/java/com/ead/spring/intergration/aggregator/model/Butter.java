package com.ead.spring.intergration.aggregator.model;

import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class Butter extends AbstractIngredient {

	@Override
	public String addToBowl() {
		return "Adding " + super.weight() + " Butter";
	}
}
