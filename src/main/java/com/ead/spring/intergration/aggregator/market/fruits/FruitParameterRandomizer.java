package com.ead.spring.intergration.aggregator.market.fruits;

import com.google.common.collect.Maps;

import java.awt.*;
import java.util.Map;
import java.util.Random;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class FruitParameterRandomizer {
	private static Map<Integer, Color[]> colorsMap;

	static {
		colorsMap = Maps.newHashMap();
		colorsMap.put(1, new Color[]{Color.RED});
		colorsMap.put(2, new Color[]{Color.YELLOW});
		colorsMap.put(3, new Color[]{Color.GREEN});
		colorsMap.put(4, new Color[]{Color.RED, Color.YELLOW});
		colorsMap.put(5, new Color[]{Color.RED, Color.GREEN});
		colorsMap.put(6, new Color[]{Color.GREEN, Color.YELLOW});
		colorsMap.put(7, new Color[]{Color.GREEN, Color.YELLOW, Color.RED});
	}

	public static long getRandWeight(int base) {
		long weight = (base + new Random().nextInt(12));
		return weight;
	}

	public static long getRandDiameter(int rand) {
		long diameter = 15 * new Random().nextInt(rand) / 10;
		return diameter;
	}

	public static double getRandDisColorationMargin() {
		double disColorationMargin = 20 + new Random().nextDouble();
		return disColorationMargin;
	}

	public static Color getRandColor(int base) {
		final Color[] colors = colorsMap.get(base);
		final int i = new Random().nextInt(2) + 1;
		if (colors.length == 1) {
			return colors[0];
		} else {
			return colors[i];
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(getRandColor(3).toString());
			System.out.println(getRandColor(7));
			System.out.println(getRandColor(7));
			System.out.println(getRandColor(1));
			System.out.println(getRandColor(2));
			System.out.println(getRandColor(7));
			System.out.println(getRandColor(7));
		}
	}
}
