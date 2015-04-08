package com.ead.spring.intergration.route.model;

/**
 * Created by EAD-MASTER on 8/4/2015.
 */
public class PhaseOnePojo implements TransformationPhase {
	private String name;

	public PhaseOnePojo(String name) {
		this.name = name;
	}

	@Override
	public Long getLength() {
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
