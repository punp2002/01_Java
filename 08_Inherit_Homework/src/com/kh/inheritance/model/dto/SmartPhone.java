package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {

	private String operatingSysrem;
	private int storageCapacity;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String model, int year, int price, String operatingSysrem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSysrem = operatingSysrem;
		this.storageCapacity = storageCapacity;
	}

	public String getOperatingSysrem() {
		return operatingSysrem;
	}

	public void setOperatingSysrem(String operatingSysrem) {
		this.operatingSysrem = operatingSysrem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	@Override
	public void printinfo() {
		super.printinfo();
		
		System.out.println("Operating System : " + operatingSysrem);
		System.out.println("Storage Capacity : " + storageCapacity + "GB");
		
	}


	
}
