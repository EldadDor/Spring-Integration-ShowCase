/*
 * User: eldad.Dor
 * Date: 19/03/2015 22:03
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.aggregators;

import com.ead.spring.intergration.aggregator.HeadChef;
import com.ead.spring.intergration.aggregator.kitchen.model.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

/**
 * @author eldad
 * @date 19/03/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = DelegatingSmartContextLoader.class, locations = "/spring/integration/aggregators/showcase-context-divideAndConquer.xml")
public class SpringIntegrationShowCaseDivideAndConquerTest {
	private static final Log log = LogFactory.getLog(SpringIntegrationShowCaseDivideAndConquerTest.class);
	@Autowired
	private ApplicationContext context;

	@Test
	public void testFileFetch() throws Exception {
		log.info("testFileFetch():");
		context.getBeanDefinitionNames();
		final Recipe recipe = createRecipe();
		context.getBean(HeadChef.class).makeRecipe(recipe);
		log.info("testChaiing(): recipe=" + recipe);
	}

	private Recipe createRecipe() {
		final Recipe recipe = new Recipe();
		final Egg egg = new Egg(2);
		final Flour flour = new Flour(500);
		final Butter butter = new Butter(100);
		final Oil oil = new Oil(250);
		recipe.addIngredients(egg);
		recipe.addIngredients(flour);
		recipe.addIngredients(butter);
		recipe.addIngredients(oil);
		return recipe;
	}
}