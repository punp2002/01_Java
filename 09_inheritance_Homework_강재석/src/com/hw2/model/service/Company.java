package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	
	
	Employee[] employees = new Employee[(Integer) null];
	
	int employeeCount = employees.length;
			
	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public String removePerson(String id) {
		return null;
	}

	@Override
	public void displayAllPersons() {
		
	}

	protected int size;

	
}
