package com.hw2.model.dto;

public class Prisoner extends Person {

	private String crime;
	
	public Prisoner(String id, String name) {
		super(id, name);
	}

	@Override
	public String getInfo() {
		return null;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	
}
