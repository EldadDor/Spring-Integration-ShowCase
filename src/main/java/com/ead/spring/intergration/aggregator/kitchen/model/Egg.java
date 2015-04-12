package com.ead.spring.intergration.aggregator.kitchen.model;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Egg extends AbstractIngredient {

	public Egg(int quantity) {
		super.setQuantity(quantity);
	}

	public Egg() {
	}

	@Override
	public String addToBowl() {
		return "Adding " + super.quantity() + " Eggs";
	}

	@Override
	public void setMass(long mass) {
		super.setQuantity((int) mass);
	}
}
