package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;


public class Run {
		
	public static void main(String[] args) {

		// 1. 객체배열을 크기3으로 할당한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] emplArr = new Employee[3];
		
		emplArr[0] = new Employee(); // 기본생성자
		emplArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실" );
		emplArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'f', 
						1000000, 0.01, "01011112222","서울 마곡" );
		
		/*System.out.printf("emp[0] : %d , %s , %s , %s , %d , %c , %d , %f , %s , %s\n",
				emplArr[0].getEmpNo(), emplArr[0].getEmpName(), emplArr[0].getDept(),
				emplArr[0].getJob(), emplArr[0].getAge(),
				emplArr[0].getGender(), emplArr[0].getSalary(), emplArr[0].getBonusPoint(),
				emplArr[0].getPhone(), emplArr[0].getAddress());
		System.out.printf("emp[1] : %d / %s / %s / %s / %d / %c / %d / %f / %s / %s\n",
				emplArr[1].getEmpNo(), emplArr[1].getEmpName(), emplArr[1].getDept(),
				emplArr[1].getJob(), emplArr[1].getAge(),
				emplArr[1].getGender(), emplArr[1].getSalary(), emplArr[1].getBonusPoint(),
				emplArr[1].getPhone(), emplArr[1].getAddress());
		System.out.printf("emp[2] : %d / %s / %s / %s / %d / %c / %d / %f / %s / %s\n",
				emplArr[2].getEmpNo(), emplArr[2].getEmpName(), emplArr[2].getDept(),
				emplArr[2].getJob(), emplArr[2].getAge(),
				emplArr[2].getGender(), emplArr[2].getSalary(), emplArr[2].getBonusPoint(),
				emplArr[2].getPhone(), emplArr[2].getAddress());
				*/
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("emp[" + i + "] : " + emplArr[i].information());
		}
		
		System.out.println("=====================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 넣을 값을 넣은 뒤 출력
		emplArr[0].setEmpNo(0);
		emplArr[0].setEmpName("김말똥");
		emplArr[0].setDept("교육부");
		emplArr[0].setJob("팀장");
		emplArr[0].setAge(30);
		emplArr[0].setGender('M');
		emplArr[0].setSalary(3000000);
		emplArr[0].setBonusPoint(0.2);
		emplArr[0].setPhone("01055559999");
		emplArr[0].setAddress("전라도 광주");
		
		
		emplArr[1].setDept("영업부");
		emplArr[1].setJob("부장");
		emplArr[1].setSalary(4000000);
		emplArr[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + emplArr[0].information());
		System.out.println("emp[1] : " + emplArr[1].information());
		
	/*	System.out.printf("emp[0] : %d , %s , %s , %s , %d , %c , %d , %.1f , %s , %s\n",
				emplArr[0].getEmpNo(), emplArr[0].getEmpName(), emplArr[0].getDept(),
				emplArr[0].getJob(), emplArr[0].getAge(),
				emplArr[0].getGender(), emplArr[0].getSalary(), emplArr[0].getBonusPoint(),
				emplArr[0].getPhone(), emplArr[0].getAddress());
		System.out.printf("emp[1] : %d , %s , %s , %s , %d , %c , %d , %.1f , %s , %s\n",
				emplArr[1].getEmpNo(), emplArr[1].getEmpName(), emplArr[1].getDept(),
				emplArr[1].getJob(), emplArr[1].getAge(),
				emplArr[1].getGender(), emplArr[1].getSalary(), emplArr[1].getBonusPoint(),
				emplArr[1].getPhone(), emplArr[1].getAddress());
	*/
		
		System.out.println("=====================================================");
		
		
		// 3) 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉 = (급여 + (급여 + 보너스포인트)) * 12	
		
	/*	int input = ((int)(emplArr[0].getSalary() + (emplArr[0].getSalary() * emplArr[0].getBonusPoint())) * 12 );
		int input1 = ((int)(emplArr[1].getSalary() + (emplArr[1].getSalary() * emplArr[1].getBonusPoint())) * 12 );
		int input2 = ((int)(emplArr[2].getSalary() + (emplArr[2].getSalary() * emplArr[2].getBonusPoint())) * 12 );
		
		System.out.printf("김말똥의 연봉 : %d\n" , input);
		System.out.printf("김말똥의 연봉 : %d\n" , input1);
		System.out.printf("김말똥의 연봉 : %d\n" , input2);
		int input4 = (input + input1 + input2) / 3;
		
		System.out.printf("직원들의 연봉의 평균 : %d", input4);
		
				*/
		
		int sum = 0; // 3명의 연봉을 누적해줄 변수
		for(int i = 0; i < emplArr.length; i++) {
			
			int sumSalary = (int)(emplArr[i].getSalary() + (emplArr[i].getSalary() * emplArr[i].getBonusPoint())) * 12; 
			System.out.println(emplArr[i].getEmpName() + "의 연봉 : " + sumSalary + "원");
			
			sum += sumSalary;
		}
		
		System.out.println("=====================================================");
		
		System.out.println("직원들의 연봉의 평균 : " + sum / emplArr.length + "원");
		// 3명의 직원의 연봉 평균을 구하여 출력
		

        }

}
