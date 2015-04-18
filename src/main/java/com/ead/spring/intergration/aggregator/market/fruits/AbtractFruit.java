package com.ead.spring.intergration.aggregator.market.fruits;

import com.ead.spring.intergration.aggregator.market.Fruit;
import com.ead.spring.intergration.aggregator.market.FruitBox;

import java.awt.*;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class AbtractFruit implements Fruit {
	protected long weight;
	protected Color color;
	protected boolean passedInspection;
	protected boolean isSoft;
	protected long diameter;
	protected double disColorationMargin;
	private FruitBox box;

	public AbtractFruit(long weight, Color color, boolean passedInspection, boolean isSoft,
	                    long diameter, double disColorationMargin) {
		this.weight = weight;
		this.color = color;
		this.passedInspection = passedInspection;
		this.isSoft = isSoft;
		this.diameter = diameter;
		this.disColorationMargin = disColorationMargin;
	}

	public FruitBox getBox() {
		return box;
	}

	public void setBox(FruitBox box) {
		this.box = box;
	}

	@Override
	public long weight() {
		return weight;
	}

	@Override
	public Color color() {
		return color;
	}

	@Override
	public boolean passedInspection() {
		return passedInspection;
	}

	public void setPassedInspection(boolean passedInspection) {
		this.passedInspection = passedInspection;
	}

	public void setIsSoft(boolean isSoft) {
		this.isSoft = isSoft;
	}

	@Override
	public boolean isSoft() {
		return isSoft;
	}

	@Override
	public long diameter() {
		return diameter;
	}

	@Override
	public double disColorationMargin() {
		return disColorationMargin;
	}
}
