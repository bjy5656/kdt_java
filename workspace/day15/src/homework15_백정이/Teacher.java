package homework15_백정이;

public class Teacher extends Person{	//Person 클래스 상속 

	//필드 
	
	//생성자 
	//부모 생성자 호출, 매개변수로 이름 전달
	public Teacher(String name) {
		super(name);
	}	
	
	//메소드 
	//부모의 introduce() 메소드 재정의 
	@Override
	void introduce() {
		System.out.println("저는 선생님입니다");
	}
	
	//가르칩니다 출력 메소드 작성 
	//리턴타입 void, 매개변수 x
	void teach() {
		System.out.println(getName() + "이 가르칩니다");
	}

	
}
