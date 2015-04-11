package com.ead.spring.intergration.aggregator;

import com.ead.spring.intergration.aggregator.model.InventoryGateway;
import com.ead.spring.intergration.aggregator.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
public class Kitchen {

	@Autowired
	private InventoryGateway inventoryGateway;

	public void makeRecipe(Recipe recipe) {
		recipe.getIngredients();

//		inventoryGateway.findIngredient()
	}
}
