package com.ead.spring.intergration.model;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
public class SimplePojoBuilder {
	private String name;
	private Long length;

	private SimplePojoBuilder() {
	}

	public static SimplePojoBuilder aSimplePojo() {
		return new SimplePojoBuilder();
	}

	public SimplePojoBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public SimplePojoBuilder withLength(Long length) {
		this.length = length;
		return this;
	}

	public SimplePojoBuilder but() {
		return aSimplePojo().withName(name).withLength(length);
	}

	public SimplePojo build() {
		SimplePojo simplePojo = new SimplePojo();
		simplePojo.setName(name);
		simplePojo.setLength(length);
		return simplePojo;
	}
}
