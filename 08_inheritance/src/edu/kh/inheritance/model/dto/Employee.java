package edu.kh.inheritance.model.dto;

/*
 * Object
 *    ㄴ Person
 *    		ㄴ Employee
 * 
 * 
 * */

// final 클래스 : 상속불가(누군가의 부모가 될 수 없다)
// -> 제공되는 클래스 그대로 사용해야하는 경우
// ex) String 클래스
public /*final*/ class Employee extends Person{

	// 필드
	private String company; // 회사명

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, String nationality, String company) {
		
		super(name, age, nationality);
		this.company = company;
	}
	
	
	// Person으로 부터 상속받은 메소드 중
	// move() 메서드를 Employee에 맞게 재정의 (== 오버라이딩)
	
	// @Override 어노테이션 : 해당 메소드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역활
	// -> 컴파일러에게 문법체크를 하도록 알린다.
	// -> 부모에게 해당 메서드가 있는지 체크
	// -> 이름, 매개변수 , 타입과 개수가 일치하는 여부 검사
	
	@Override
	public void move() {
		// super. 참조변수 : 상속 관계에서 부모 객체를 가르키는 참조변수
		//super.move(str, num);
		// 쓰지 않아도 무방
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다.");
	}
	
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return super.toString() + " / "+ company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * - 메서드의 기능이 변하면 안되는 경우
	 * 
	 * */
	
	public final void onylEmployee() {
		System.out.println("final 메서드입니다.");
	}
	
	
	
	
}
