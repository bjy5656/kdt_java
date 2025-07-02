package homework15_백정이;

public class Employee extends Person{	//Person 클래스 상속 

	//필드 
	
	//생성자 
	//부모 생성자 호출, 매개변수로 이름 전달
	public Employee(String name) {
		super(name);
	}	
	
	//메소드
	//getter 메소드를 호출하여 객체의 이름 변수 사용 
	@Override
	void introduce() {
		System.out.println("저의 이름은 " + getName() + "이고 회사원입니다");
	}
	
	//업무를 처리중입니다 출력
	//리턴타입 void, 매개변수 x 
	void work() {
		System.out.println("업무를 처리중입니다");
	}

	
}
