package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExampleIndivi {

	Scanner sc = new Scanner(System.in);
	
	public void indivi() {
		
		System.out.print("숫자를 한 개 입력하세요. : ");
		int input1 = sc.nextInt();
		
		String result;
				
		if (input1 < 0 ) {
			result = ("양수만 입력해주세요.");
		} else if (input1 % 2 == 0) {
			result = ("짝수 입니다.");
		} else  {
			result = ("홀수 입니다.");
		}
		System.out.println(result);
	}
	
	public void indivi2() {
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		int sum = input1 + input2 + input3;
		double ang = sum / 3.0;
		
		if(ang >= 60 && input1 >= 40 && input2 >= 40 && input3 >= 40 ) {
			System.out.println("국어 :" + input1);
			System.out.println("영어 :" + input2);
			System.out.println("수학 :" + input3);
			System.out.println("합계 :" + sum);
			System.out.println("평균 :" + ang);
			System.out.print("축하합니다. 합격입니다.");
			
		} else {
			System.out.print("국어 :" + input1);
			System.out.print("영어 :" + input1);
			System.out.print("수학 :" + input1);
			System.out.print("불합격입니다. 공부하세요");
		}
		
	}
	
}
