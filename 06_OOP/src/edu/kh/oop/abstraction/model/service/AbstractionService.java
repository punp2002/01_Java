package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비지니스 로직)을 제공하는 패키지
// (비밀번호 -> 암호화 , 파일 -> 유효한파일 걸러내는 작업)
public class AbstractionService {

	// 속성 x
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// int[]arr = new int[5]; 
		// 자료형이 들어가야하는 자리임
		
		// * 클래스 이름이 자료형처럼 사용된다 *
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다.
		/*		
		p1.name = "홍길동"; // The field People.name is not visible
		p1.gender = '남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		//System.out.println("p1의 gender : " + (int)p1.gender);
		// char타입 jvm 기본값은 0
		// 유니코드 문자 체계에서 0은 공백을 나타냄
		// -> int 형으로 강제 형변환하면 0인것을 확인할 수 있음
		
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
				
		// 전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		System.out.println( p1.getName() );
		System.out.println( p1.getGender() );
		System.out.println( p1.getpNo() );
		System.out.println( p1.getAddress() );
		System.out.println( p1.getPhone() );
		System.out.println( p1.getAge() );
		
		// 본인 객체
		// People 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
		
		People jae = new People();
		
		jae.setName("강재석");
		jae.setGender('남');
		jae.setpNo("891020-1019414");
		jae.setAddress("서울 광진구 구의동");
		jae.setPhone("010-9163-1973");
		jae.setAge(37);
		
		System.out.println( jae.getName() );
		System.out.println( jae.getGender() );
		System.out.println( jae.getpNo() );
		System.out.println( jae.getAddress() );
		System.out.println( jae.getPhone() );
		System.out.println( jae.getAge() );
		
	}
	

		
	}

