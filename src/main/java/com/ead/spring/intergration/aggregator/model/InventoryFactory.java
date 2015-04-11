package com.ead.spring.intergration.aggregator.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
public class InventoryFactory implements InventoryGateway {

	@Autowired
	private Map<String, Ingredient> ingredientStore;

	@Override
	public Ingredient findIngredient(List<Ingredient> ingredient) {
		return null;
	}
}
