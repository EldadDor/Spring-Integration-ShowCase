package com.ead.spring.intergration.model;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
public class HeaderPojo {
	private int sequenceNr;
	private String name;

	public HeaderPojo(String name) {
		this.name = name;
	}

	public HeaderPojo(int sequenceNr) {
		this.sequenceNr = sequenceNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSequenceNr() {
		return sequenceNr;
	}

	public void setSequenceNr(int sequenceNr) {
		this.sequenceNr = sequenceNr;
	}
}
