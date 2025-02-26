package edu.kh.poly.ex2.model.service;

public interface TestInterface {

	public abstract int plus(int num1, int num2);
	// 인터페이스는 추상메서드
	
	public abstract String test();
	
	
	// Java 8 이후에는 디폴트 메서드(구현부가 있는 메서드)가 추가
	default void display() {
		System.out.println("TestInterface의 display()");
	}
	
}
