package com.hw1.model.dto;

public abstract class Book {
	
	private String title;
	private String author;
	
	public Book() {}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract String displyInfo();
	
	@Override
	public String toString() {
		return "제목 : " + title + " / 저자 : " + author;
	}
}
