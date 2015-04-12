/*
 * User: eldad.Dor
 * Date: 12/04/2015 19:15
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.aggregator.kitchen.services;

import com.ead.spring.intergration.aggregator.kitchen.model.Ingredient;
import com.ead.spring.intergration.aggregator.kitchen.model.Recipe;
import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

import java.util.List;

/**
 * @author eldad
 * @date 12/04/2015
 */
@MessageEndpoint(value = "RecipeInventoryEndPoint")
public class RecipeInventoryEndPoint {

	@Aggregator(inputChannel = "inventoryStoreResponseChannel", outputChannel = "cookingChannel")
	public Recipe gatherRecipeIngredients(List<Message<Ingredient>> ingredients) {
		final Recipe recipe = new Recipe();
		for (final Message<Ingredient> ingredient : ingredients) {
			recipe.addIngredients(ingredient.getPayload());
		}
		return recipe;
	}


}