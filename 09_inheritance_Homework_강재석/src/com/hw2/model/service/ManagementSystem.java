package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	public abstract void addPerson(Person person);
	public abstract String removePerson(String id);
	public abstract void displayAllPersons();
	
	
	
}
