package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		
		System.out.println("***** KH 동물원 ***** ");
		System.out.println("원하는 작업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:  
			System.out.println("동물들의 울음소리를 들어보세요 : ");
			zoo.showAnimals();
			
			break;
			
		case 2: System.out.println("프로그램 종료.."); break;
		
		}
	
	}
		
}


