package homework15_백정이;

public class Student extends Person{	//Person 클래스 상속 
	
	//필드 
	boolean stu;
	
	//생성자 
	//부모 생성자 호출, 매개변수로 이름 전달
	//객체의 stu 변수 초기화 
	public Student(String name, boolean stu) {
		super(name);
		this.stu = stu;
	}

	//메소드 
	//부모의 introduce() 메소드 재정의 
	//getter 메소드를 호출하여 객체의 이름 변수 사용 
	@Override
	void introduce() {
		System.out.println(getName() + (stu?"은 학생입니다":"은 학생이 아닙니다"));
	}
	
	//공부합니다 출력 메소드 작성
	//리턴타입 void, 매개변수 x
	//getter 메소드를 호출하여 객체의 이름 변수 사용 
	void study() {
		System.out.println(getName() + (stu?"이 공부합니다":"이 공부하지 않습니다"));
	}
	
	
}
