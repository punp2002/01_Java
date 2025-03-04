package com.toyFactory.model.dto.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	
	private List<Toy> toyList = new ArrayList<>();
	private Map<Integer, String> addmaterials = new LinkedHashMap<>();
	
	public ToyFactory() {
	
		
		
		Toy toy1 = new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", "면직물", "고무");
		Toy toy2 = new Toy("허기워기", 5, 12000, "파란색", "19940312", "면직물,플라스틱");
		Toy toy3 = new Toy("키시미시", 5, 15000, "분홍색", "19940505", "면직물,플라스틱");
		Toy toy4 = new Toy("캣냅", 8, 27000, "보라색", "19960128", "면직물,플래스틱");
		Toy toy5 = new Toy("파피", 12, 57000, "빨간색", "19931225", "고무, 면직물");
		
		toyList.add(toy1);
	    toyList.add(toy2);
	    toyList.add(toy3);
	    toyList.add(toy4);
	    toyList.add(toy5);
	    
	    addmaterials.put(1, "고무");
        addmaterials.put(2, "면직물");
        addmaterials.put(3, "플라스틱");
	    
	}
	
public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거"); 
			System.out.print("선택 : ");
	
		try {
			
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼 개행문자 제거용
			
			switch(menuNum) {
			case 1: selectAll(); break;
			case 2: updateToy(); break;
			case 3: removeStudent(); break;
			case 4: searchYear(); break;
			case 5: searchAge(); break;
			case 6: updateToyMaterials(); break;
			case 7: /*sortByAge();*/ break;
			default : System.out.println("메뉴에 작성된 번호만 입력하세요."); break;
			}
		
			}catch (InputMismatchException e) {
			System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
			
			sc.nextLine(); 
			
			menuNum = -1; 
			
			}
			
		}while(menuNum != 0);
	}
	public void selectAll() {
		System.out.println("<전체 장난감 목록>");
		 for (Toy toy : toyList) {
			 
		     System.out.println(toy);
	
	
		 }


	}
	public void updateToy() {
		
System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyname = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int toyage = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int toyprice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String toycolor = sc.nextLine();
		
		System.out.print("제조일 : ");
		String toyyear = sc.nextLine();
		
        
        List<String> materials = new ArrayList<>();
        while (true) {
        	System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
            String material = sc.nextLine();
            if ("q".equals(material)) {
                break; 
            } else {
                materials.add(material);
            }
        }

        
        String[] materialsArray = materials.toArray(new String[0]);
        Toy newToy = new Toy(toyname, toyage, toyprice, toycolor, toyyear, materialsArray);

        toyList.add(newToy);
        System.out.println( materialsArray.toString());
        System.out.println("새로운 장난감이 추가되었습니다.");
    }
	
	public void removeStudent() {
		

		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String toyname = sc.nextLine();
		
		
		 Toy toyRemove = null;
		    for (Toy toy : toyList) {
		        if (toy.getToyname().equals(toyname)) {
		            toyRemove = toy;
		            break;
		        }
		    }
		    toyList.remove(toyRemove);  // 장난감 삭제
		    System.out.println(toyname + " 장난감이 삭제되었습니다.");
		    
	}
	
	public void searchYear() {
		
		toyList.sort(new Comparator<Toy>() {
		    @Override
		    public int compare(Toy toy1, Toy toy2) {
		        return toy1.getToyyear().compareTo(toy2.getToyyear());
		    }
		});
		 System.out.println("<장난감 제조일 순으로 조회>");

	        for (int i = 0; i < toyList.size(); i++) {
	            Toy toy = toyList.get(i);

	            System.out.println((i + 1) + ". 이름: " + toy.getToyname() +
	                    " / 가격: " + toy.getToyprice() +
	                    " / 색상: " + toy.getToycolor() +
	                    " / 사용가능연령: " + toy.getToyage() +
	                    " / 제조일: " + toy.getToyyear() +
	                    " / 재료: " + toy.getToymaterials());
	        }
		
	}
	public void searchAge() {
		toyList.sort(new Comparator<Toy>() {
		    @Override
		    public int compare(Toy toy1, Toy toy2) {
		        return toy1.getToyage() - (toy2.getToyage());
		    }
		});
		 System.out.println("<연력별로 사용 가능한 장난감>");

	        for (int i = 0; i < toyList.size(); i++) {
	            Toy toy = toyList.get(i);

	            System.out.println((i + 1) + ". 이름: " + toy.getToyname() +
	                    " / 가격: " + toy.getToyprice() +
	                    " / 색상: " + toy.getToycolor() +
	                    " / 사용가능연령: " + toy.getToyage() +
	                    " / 제조일: " + toy.getToyyear() +
	                    " / 재료: " + toy.getToymaterials());
	        }
	
		}
	
	public void updateToyMaterials() {
		
		
		
		System.out.println( "\n<재료 추가>" );
		System.out.println("---현재 등록된 재료---");

        for (Map.Entry<Integer, String> entry : addmaterials.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        
		System.out.println("---------------------------------");
		System.out.print("재료 고유번호(key) 입력 : ");
		Integer key = sc.nextInt();
		sc.nextLine();
		
		System.out.print("재료명 입력 : ");
		String value = sc.nextLine();
		
		if (addmaterials.containsKey(key)) {
		        
			System.out.print("이미 등록된 고유번호입니다. 덮어쓸까요? (y/n) : ");
			String str = sc.nextLine();

			if (str.equalsIgnoreCase("y")) {
				addmaterials.put(key, value);  // 덮어쓰기
				System.out.println("재료가 덮어쓰여졌습니다.");
			} else {
				System.out.println("덮어쓰지 않았습니다.");
		        }
			} else {
		        // 고유번호가 등록되어 있지 않으면 새로운 재료를 추가
		        addmaterials.put(key, value);
		        System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		    }

		}
	}


	

