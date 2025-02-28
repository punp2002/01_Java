package com.hw3.model.run;

import com.hw3.model.service.BookService;

public class Run {

	public static void main(String[] args) {
		BookService booklist = new BookService();
		
		booklist.displayMenu();
		
	}

}
