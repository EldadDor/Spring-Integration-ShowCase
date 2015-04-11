package com.ead.spring.intergration.model;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
public class SimplePojo {
	private String name;
	private Long length;

	public SimplePojo() {
	}

	public SimplePojo(String name, Long length) {
		this.name = name;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}
}
