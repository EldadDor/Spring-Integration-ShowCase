package com.ead.spring.intergration.aggregator.kitchen.services;

import com.ead.spring.intergration.aggregator.kitchen.model.Recipe;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@MessagingGateway
public interface InventoryGateway {
	/**
	 * two ways to take -
	 * make this gateway method with reply-channel and wait for a reply (making it synchronous tasl)
	 * send to the channel and get a reply from another channel (making it asynchronous task)
	 *
	 * @param recipe the recipe to send to the spiltter
	 */
	@Gateway(requestChannel = "ordersChannel")
	void findIngredients(Recipe recipe);

	/**
	 * Taking the Recipe back from the aggregator after it's been spilt and looked from in the Inventory
	 *
	 * @return the aggregated Recipe
	 */
	@Gateway(replyChannel = "cookingChannel")
	Recipe cookRecipe();
}
