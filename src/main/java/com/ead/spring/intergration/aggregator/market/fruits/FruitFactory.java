package com.ead.spring.intergration.aggregator.market.fruits;

import com.ead.spring.intergration.aggregator.market.Fruit;

import java.awt.*;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class FruitFactory {

	public static <T extends Fruit> Fruit createFruit(Class<T> fruit) {
		if (fruit.equals(Apple.class)) {
			return createApple();
		}
		if (fruit.equals(Banana.class)) {
			return createBanana();
		}
		if (fruit.equals(Cherry.class)) {
			return createCherry();
		}
		if (fruit.equals(Grape.class)) {
			return createGrape();
		}
		if (fruit.equals(Orange.class)) {
			return createOrange();
		}
		if (fruit.equals(Strawberry.class)) {
			return createStrawberry();
		}
		return null;
	}

	private static Fruit createApple() {
		return new Apple(FruitParameterRandomizer.getRandWeight(50), FruitParameterRandomizer.getRandColor(7),
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}

	private static Fruit createBanana() {
		return new Banana(FruitParameterRandomizer.getRandWeight(50), FruitParameterRandomizer.getRandColor(6),
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}

	private static Fruit createCherry() {
		return new Cherry(FruitParameterRandomizer.getRandWeight(50), FruitParameterRandomizer.getRandColor(4),
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}

	private static Fruit createGrape() {
		return new Grape(FruitParameterRandomizer.getRandWeight(50), FruitParameterRandomizer.getRandColor(5),
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}

	private static Fruit createOrange() {
		return new Orange(FruitParameterRandomizer.getRandWeight(50), Color.ORANGE,
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}

	private static Fruit createStrawberry() {
		return new Strawberry(FruitParameterRandomizer.getRandWeight(50), Color.RED,
				false, false, FruitParameterRandomizer.getRandDiameter(10), FruitParameterRandomizer.getRandDisColorationMargin());
	}


}
