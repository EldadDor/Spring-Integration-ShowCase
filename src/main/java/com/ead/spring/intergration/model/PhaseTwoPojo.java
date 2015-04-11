package com.ead.spring.intergration.model;

/**
 * Created by EAD-MASTER on 8/4/2015.
 */
public class PhaseTwoPojo implements TransformationPhase {
	private Long length;

	public PhaseTwoPojo(Long length) {
		this.length = length;
	}

	@Override
	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	@Override
	public String getName() {
		return null;
	}
}
