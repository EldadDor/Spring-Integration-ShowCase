package com.ead.spring.intergration.aggregator.model;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import java.util.List;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@MessagingGateway
public interface InventoryGateway {
	@Gateway
	Ingredient findIngredient(List<Ingredient> ingredient);

}
