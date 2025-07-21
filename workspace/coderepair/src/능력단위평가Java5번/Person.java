package 능력단위평가Java5번;

//(2)Person 클래스 정의 
public class Person {

	//필드 
	String name;

	//생성자 
	public Person(String name) {
		this.name = name;	
	}
	
	//메소드 - 이름 반환 
	//리턴타입 => String 
	//메소드명 => getName
	//매개변수 x
	//실행할문장 => 
	//return 객체의 이름
	String getName ( ) {
		return this.name;
	}
}
