package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 
		 * 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일
		 * 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 
		 * 1이상의 숫자를 입력하세요 : 4  1이상의 숫자를 입력하세요 : 0 
		 * 1 2 3 4                        1 이상의 숫자를 입력해주세요.
		 * 
		 */
		
		// 1. 내가 입력한 값 (input) 이 조건에 맞는지 파악하기
		// -> 조건문을 이용해야한다 if
		
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int input = sc.nextInt();

		if (input >= 1) {
			
			// 1부터 input까지 1씩 증가 반복 출력
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
	}
	
}

	public void practice2() {

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 
		 * 모든 숫자를 거꾸로 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 
		 * 1이상의 숫자를 입력하세요 : 4   1이상의 숫자를 입력하세요 : 0 
		 * 4 3 2 1                         1 이상의 숫자를 입력해주세요. 
		 * 
		 */

		System.out.print("1이상의 숫자를 입력하세요. : ");
		int input = sc.nextInt();

		if (input >= 1) {  // 조건 0
			// input = 5
			
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice3() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		 * 
		 * 정수를 하나 입력하세요 : 8 
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		System.out.print("정수 하나를 입력하세요. : ");
		int input = sc.nextInt();

		int sum = 0;
		String result = "";

		for (int i = 1; i <= input; i++) {

			sum += i;

			if (i == input) { // 마지막턴
				result += i;
			} else { // 이전턴들..
				result += i + " + ";
			}

			// i가 1씩 증가함
			// i는 input 같아짐 -> 마지막 턴

			// 마지막 턴일떈 i 뒤에 + 안붙임
			// 마지막 턴 아닐떈 i + "+"
		}
		System.out.printf("%s = %d", result, sum);
	}

	public void practice4() {

		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
		 * 만일 1 미만의 숫자가 입력됐다면 
		 * “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 
		 * 첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9 
		 * 두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0 
		 * 4 5 6 7 8        4 5 6 7 8      1 이상의 숫자를 입력해주세요. *
		 */

		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		String result = "";

		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if (input1 < input2) {
				for (int i = input1; i <= input2; i++) {
					result += i + " ";
				}
			} else {
				for (int i = input2; i <= input1; i++) {
					result += i + " ";
				}
			}
		}
		System.out.printf("%s", result);
	}

	public void practice5() {

		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * 
		 * 숫자 : 4 
		 * ===== 4단 ===== 
		 * 4 * 1 = 4 
		 * 4 * 2 = 8 
		 * 4 * 3 = 12 
		 * 4 * 4 = 16 
		 * 4 * 5 = 20 
		 * 4 * 6 = 24 
		 * 4 * 7 = 28 
		 * 4 * 8 = 32 
		 * 4 * 9 = 36 
		 */

		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.println("======" + dan + "단 ======" );
		

		//if (dan >= 2 && dan <= 9) { // 2 ~ 9 사이일 때
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		//	}
		}

	}

	public void practice6() {

		/*
		 * 
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 
		 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를
		 * 출력하세요.
		 * 
		 * 숫자 : 4 숫자 : 10 
		 * ===== 4단 ===== 2~9 사이 숫자만 입력해주세요. 
		 * ===== 5단 ===== 
		 * ===== 6단 ===== 
		 * ===== 7단 ===== 
		 * ===== 8단 ===== 
		 * ===== 9단 ===== (해당 단의 내용들은 길이 상 생략)
		 * 
		 */
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if (input < 2 || input > 9) { //2~9를 벗어난 경우
			System.out.println("2~9 숫자만 입력하세요.");
		} else { //정상 범위
			
			// 입력받은 숫자의 단부터 9단까지 증가하면서 반복 출력
			for(int dan = input; dan <= 9; dan++) {
				
				// 곱해지는 수 1~9까지 반복
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, dan * i);
				}
					
			}
				
				
		}

		//if (input >= 2 && input <= 9) {
			//for (int input1 = input; input1 <= 9; input1++) { // 2단부터 9단까지 차례대로 증가
//
	//			for (int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
		//			System.out.printf("%d X %d = %2d  ", input1, num, input1 * num);
			//	}
				//System.out.println();
			//}

	//	} else {
	//		System.out.println("2~9 사이 숫자만 입력해주세요.");
	//	}
	}

	public void practice7() {
		
		/*
		 * 정수 입력 4
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 * 별 출력하기
		 * 
		 * - 행(row)은 입력한 input 만큼 진행
		 * - 열(col)은 현재행(row) 만큼 반복
		 * 
		 * */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) { //1~4까지 4번 반복
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.println(); // 한 행의 모든 출력이 끝나면 줄바꿈
			
		}
		
		
	}
}
