package homework15_백정이;

public class Person {	//부모 클래스 

	// 필드
	private String name;
	private int age;
	private String birthDate;

	// 생성자
	//생성자 호출시 이름 변수 초기화 
	public Person(String name) {
		this.name = name;
	}

	//getter, setter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//메소드
	//이름, 나이 출력 메소드 작성
	//리턴타입 void, 매개변수 x
	//getter메소드를 사용하여 객체의 이름과 나이 변수 사용 
	void introduce() {
		System.out.println(getName() + ", " + getAge() + "세 입니다");
	}

}
