package com.hw1.model.vo;

public class Student extends Person {

	private int grade;// 학년
	private String major; // 전공
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + String.format(" / 학년 : %d / 전공 : %s", grade ,major) ;
	}
	
}
