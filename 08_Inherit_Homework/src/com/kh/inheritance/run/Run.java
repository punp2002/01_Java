package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		SmartPhone smp = new SmartPhone("Samsung", "Galaxt S20", 2020, 1200000, "Android", 128);
		
		smp.printinfo();
		
		System.out.println("=============================");
		
		BasicPhone bsp = new BasicPhone("Nokia", "3310", 2000, 10000 ,true);
		
		bsp.printinfo();
	}

}
