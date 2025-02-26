package com.hw1.model.dto;

public class Poetry extends Book{

	private int numberOfPoems;
	
	@Override
	public String displyInfo() {
		return null;
	}
	public Poetry() {}
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}
	
	public int getNumberOfPoems() {
		return numberOfPoems;
	}
	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	@Override
	public String toString() {
		return "[시집]" + super.toString() + " / 시 수 : " + numberOfPoems;
	}
	
}
