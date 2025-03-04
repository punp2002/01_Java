package com.hw3.model.service;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;



public class BookService {

	
	private List<Book> bookList = new ArrayList<>();
	
	private Scanner sc = new Scanner(System.in);
	
	public  BookService() {
		
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	
		
	}
	
public void displayMenu() {
		
		int menuNum = 0; 
		
		do {
			System.out.println("\n======도서 목록 프로그램 =====");
			System.out.println();
			System.out.println("1. 도서 등록");
			System.out.println();
			System.out.println("2. 도서 조회");
			System.out.println();
			System.out.println("3. 도서 수정");
			System.out.println();
			System.out.println("4. 도서 삭제");
			System.out.println();
			System.out.println("5. 즐겨찾기 추가");
			System.out.println();
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println();
			System.out.println("7. 즐겨찾기 조회"); // Comparable 사용
			System.out.println();
			System.out.println("8. 추천도서 뽑기"); // Comparator 사용
			System.out.println();
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				
				menuNum = sc.nextInt();
				sc.nextLine(); // 입력버퍼 개행문자 제거용
				
				switch(menuNum) {
				case 1: System.out.println(addBook()); break;
				case 2: selectAll(); break;
				case 3: /*System.out.println(updateBook));*/ break;
				case 4: /*System.out.println(removeStudent()); */break;
				case 5: /*searchName1();*/ break;
				case 6: /*searchName2();*/ break;
				case 7: /*sortByAge();*/ break;
				case 8: /*sortByName();*/ break;
				case 0: /*System.out.println("프로그램 종료..");*/ break;
				default : /*System.out.println("메뉴에 작성된 번호만 입력하세요.");*/ break;
				}
				
			} catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
			
				sc.nextLine(); 
				
				menuNum = -1; 
				
			}
			
		
		} while ( menuNum != 0 );
		
	}
	public String addBook() {
		System.out.println("======도서 정보 추가======");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String bookName = sc.nextLine();
				
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		if( bookList.add(new Book(bookNum, bookName, author, price, publisher)) ) {
			
			return "등록 완료";
			
		}else {
			
			return "등록 실패";
		}
	}
	public void selectAll() {
			
		
		// studentList가 비어있는지 확인
		// List 에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
		
		//if(studentList.size() == 0) {
		// boolean List.isEmpty() : 컬렉션이 비어있다면 true 반환
		if(bookList.isEmpty()) {
			System.out.println("도서 정보가 없습니다.");
			return; // 현재 메서드를 종료하고 호출한 곳으로 돌아감.
		}
		
		// 일반 for문
		/*
		for(int i = 0; i < studentList.size(); i++) { // ->length(X)
			System.out.println(studentList.get(i));
		}*/
		
		// 향상된 for문(for each문)
		// - 컬렉션, 배열의 모든 요소를 순차적으로 반복 접근할 수 있는 for문
		
		int index = 0;
		for(Book btd : bookList) {
			System.out.println(btd);
			System.out.println();
	}

}
	public String updateBook() {
		
System.out.println("======도서 정보 수정======");
		
		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();
		
		// 1) 학생 정보가 studentList에 하나라도 있는지 검사
		if(bookList.isEmpty()) {
			return "입력된 도서정보가 없습니다.";
		
		// 2) 입력된 숫자가 0보다 작은지	
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
			
		// 3) studentList 범위 내 인덱스 번호인지 검사	
		} else if(index >= bookList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			// 수정 코드 작성
			// 1. index번째 저장된 학생정보 출력
			System.out.println(index + "번째에 저장된 도서 정보");
			System.out.println(bookList.get(index));
			
			// 2. 수정할 내용 입력 받기
			System.out.print("도서 번호 : ");
			int bookNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("도서 제목 : ");			
			String bookName = sc.next();
			
			System.out.print("도서 저자 : ");
			String author = sc.nextLine();
			
			System.out.print("도서 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 입력 받은 index번째에 수정할 학생정보를 세팅 -> 수정
			// index번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장
			Book temp = bookList.set(index, new Book(bookNum, bookName, author, price, publisher));
			
			return temp.getBookName() + "의 정보가 변경되었습니다.";
			
		}
		
		
	}
	
}
