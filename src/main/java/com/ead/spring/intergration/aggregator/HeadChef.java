package com.ead.spring.intergration.aggregator;

import com.ead.spring.intergration.aggregator.kitchen.model.Recipe;
import com.ead.spring.intergration.aggregator.kitchen.services.InventoryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class HeadChef {

	@Autowired
	private InventoryGateway inventoryGateway;

	public Recipe makeRecipe(Recipe recipe) {
		inventoryGateway.findIngredients(recipe);
		final Recipe recipeToCook = inventoryGateway.cookRecipe();
		recipe.mixIngredients();
		return recipe;
	}
}
