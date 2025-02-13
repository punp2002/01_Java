package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	


	//public void practice1() {
	public void ex() {
		/*
		 * 키보드로 나이를 입력받아 
			20세 이상이면 "저는 성인 입니다", 
			아니면 "저는 미성년 입니다" 출력.
			입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? 
			true"출력, 아니면 false 출력
			입력받은 값이 65세 이상이거나, 12세 이하면 
			"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		 * 
		 * 당신의 나이는 ? : 20
			저는 성인입니다
			청소년 입니까? false
			노인이거나 어린이 입니까? false
-----------------------------------------
			당신의 나이는 ? : 13
			저는 미성년입니다
			청소년 입니까? true
			노인이거나 어린이 입니까? false
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		// int input = sc.nextInt();
		int age = sc.nextInt();
		
		//String result = input >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		String personType = age >= 20 ? "성인" : "미성년";
		System.out.println("저는 " + personType + "입니다.");
				
		//System.out.println(result);
			
		//String result2 = input <= 20 ? " false " : "true";
		//System.out.println("청소년 입니까?" + result2);
		
		boolean isTeenager = (age >= 13) && (age <= 19);
		System.out.println("청소년 입니까?" + isTeenager);
		
		//boolean result3 = (input >= 65) && (input <= 12);
		//System.out.println("노인이거나 어린이 입니까? " + result3);
		
		boolean isSeniorOrChild = (age >= 65) || (age <= 12);
		System.out.println("노인이거나 어린이입니까?" + isSeniorOrChild);
		
		
		// --------------------------------------------
		//System.out.println();
		
		//System.out.print("당신의 나이는 ? : ");
		//int input2 = sc.nextInt();
		
		//String result4 = input >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		
		//System.out.println(result);
		
		//String result5 = input <= 20 ? " true " : "false";
		//System.out.println("청소년 입니까?" + result5);
		
		//boolean result6 = (input >= 65) && (input <= 12);
		// 오류 문구 확인 후 수정했으나 왜 이런 결과 값이 나온건지 이해가 안되는 상황
		// boolean 을 배우지 않았던 것 같은데 이렇게 문제 해결하는게 맞는지
		//System.out.println("노인이거나 어린이 입니까? " + result3);
	}
	

}
