/*
 * User: eldad.Dor
 * Date: 12/04/2015 17:50
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.aggregator.kitchen.services;

import com.ead.spring.intergration.aggregator.kitchen.model.*;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author eldad
 * @date 12/04/2015
 */
@Service
public class InventoryStoreServiceActivator {
	private Map<String, Pair<? super Class<Ingredient>, Long>> inventoryRepositoryMap = new ConcurrentHashMap<>();

	@PostConstruct
	public void initInventory() {
		inventoryRepositoryMap.put(Egg.class.getSimpleName(), new MutablePair<>(Egg.class, 1000l));
		inventoryRepositoryMap.put(Flour.class.getSimpleName(), new MutablePair<>(Flour.class, 50000l));
		inventoryRepositoryMap.put(Butter.class.getSimpleName(), new MutablePair<>(Butter.class, 10000l));
		inventoryRepositoryMap.put(Oil.class.getSimpleName(), new MutablePair<>(Oil.class, 10000l));
	}


	/*	@ServiceActivator(inputChannel = "inventoryStoreRequestChannel", outputChannel = "inventoryStoreResponseChannel")
		public Message<Ingredient> getIngredientForAmount(Message<Ingredient> message, Long amount) {
			final Ingredient ingredient = message.getPayload();
			final String key = ingredient.getClass().getSimpleName();
			if (inventoryRepositoryMap.containsKey(key)) { // if in inventory
				final Pair<? super Class<Ingredient>, Long> ingredientRepo = inventoryRepositoryMap.get(key);
				if (ingredientRepo.getRight() > 0 && ingredientRepo.getRight() >= amount) { // if there some amount in inventory
					((MutablePair) ingredientRepo).setRight(ingredientRepo.getRight() - amount); // setting the amount of taking the required
					ingredient.setMass(amount);
					return MessageBuilder.withPayload(ingredient).build();
				}
			}
			return null;
		}
		*/
	@ServiceActivator(inputChannel = "inventoryStoreRequestExChannel", outputChannel = "inventoryStoreResponseChannel")
	public Message<Ingredient> getIngredientForAmount(Message<Ingredient> message) {
		final Ingredient ingredient = message.getPayload();
		final String key = ingredient.getClass().getSimpleName();
		if (inventoryRepositoryMap.containsKey(key)) { // if in inventory
			final Pair<? super Class<Ingredient>, Long> ingredientRepo = inventoryRepositoryMap.get(key);
			if (ingredientRepo.getRight() > 0 && ingredientRepo.getRight() >= 100) { // if there some amount in inventory
				((MutablePair) ingredientRepo).setRight(ingredientRepo.getRight() - 100); // setting the amount of taking the required
				ingredient.setMass(100);
				return MessageBuilder.withPayload(ingredient).build();
			}
		}
		return null;
	}

	@ServiceActivator(inputChannel = "inventoryStoreRequestExChannel", outputChannel = "inventoryStoreResponseChannel")
	public Message<Ingredient> getIngredientForAmount(@Header(value = "Quantity") Integer quantity, Message<Ingredient> message) {
		final Ingredient ingredient = message.getPayload();
		final String key = ingredient.getClass().getSimpleName();
		if (inventoryRepositoryMap.containsKey(key)) { // if in inventory
			final Pair<? super Class<Ingredient>, Long> ingredientRepo = inventoryRepositoryMap.get(key);
			if (ingredientRepo.getRight() > 0 && ingredientRepo.getRight() >= quantity) { // if there some amount in inventory
				((MutablePair) ingredientRepo).setRight(ingredientRepo.getRight() - quantity); // setting the amount of taking the required
				ingredient.setMass(quantity);
				return MessageBuilder.withPayload(ingredient).build();
			}
		}
		return null;
	}
}