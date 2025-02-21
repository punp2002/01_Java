package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {

		MethodExample methodEx = new MethodExample();
		methodEx.method1();
		
		
		// 그다음 return된 순서대로 빠져나감 
		
		// method2() 함수 호출
		// method1() 메서드 실행
		// main 메서드 실행
		// 바구니 모양으로 확인하기
		// stack에 쌓이는 중 / 메서드 호출한 이력이 쌓임
		// LIFO = Last - Input - First - Out
		
	
	
	}

}
