package task01;

public class Person {
	
	//필드
	String name; 
	int age;
	
	//생성자
	public Person() {
		this("이름 없음", 0);
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 호출");
	} 
	

	//메소드
	void introduce() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	
	void sleep(int time) {
		System.out.println(this.name + "은 " + time + "시에 잠을 잡니다");
	}
	
	
}
