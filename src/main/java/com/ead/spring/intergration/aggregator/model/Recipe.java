package com.ead.spring.intergration.aggregator.model;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class Recipe {
	private List<Ingredient> ingredients;

	public void mixIngredients() {
		for (Ingredient ingredient : ingredients) {
			ingredient.addToBowl();
		}
	}

	public void addIngredients(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
}
