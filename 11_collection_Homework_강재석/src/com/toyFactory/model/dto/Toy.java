package com.toyFactory.model.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Toy {

	private String toyname;
	private int toyage;
	private int toyprice;
	private String toycolor;
	private String toyyear;
	private Set<String> toymaterials;
	
	public Toy() {}

	public Toy(String toyname, int toyage, int toyprice, String toycolor, String toyyear, String... toymaterials) {
		super();
		this.toyname = toyname;
		this.toyage = toyage;
		this.toyprice = toyprice;
		this.toycolor = toycolor;
		this.toyyear = toyyear;
		
		this.toymaterials = new HashSet<>();
		
		for( String str : toymaterials) {
			
			 this.toymaterials.add(str);
				
			}
		
		
	}

	public String getToyname() {
		return toyname;
	}

	public void setToyname(String toyname) {
		this.toyname = toyname;
	}

	public int getToyage() {
		return toyage;
	}

	public void setToyage(int toyage) {
		this.toyage = toyage;
	}

	public int getToyprice() {
		return toyprice;
	}

	public void setToyprice(int toyprice) {
		this.toyprice = toyprice;
	}

	public String getToycolor() {
		return toycolor;
	}

	public void setToycolor(String toycolor) {
		this.toycolor = toycolor;
	}

	public String getToyyear() {
		return toyyear;
	}

	public void setToyyear(String toyyear) {
		this.toyyear = toyyear;
	}

	public Set<String> getToymaterials() {
		return toymaterials;
	}

	public void setToymaterials(Set<String> toymaterials) {
		this.toymaterials = toymaterials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(toyage, toycolor, toymaterials, toyname, toyprice, toyyear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return toyage == other.toyage && Objects.equals(toycolor, other.toycolor)
				&& Objects.equals(toymaterials, other.toymaterials) && Objects.equals(toyname, other.toyname)
				&& Objects.equals(toyprice, other.toyprice) && Objects.equals(toyyear, other.toyyear);
	}

	@Override
	public String toString() {
		
		
		
		return "이름: " + toyname + " / 가격" + toyprice + " / 색상 : " + toycolor + " / 사용가능연령 : " + toyage
				+ " / " + toyyear + " / 재료 : " + toymaterials;
	}
	
	

	
}
