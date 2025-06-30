package mothodOverride01;
//6번 : 오버라이딩 

//부모클래스 Animal 
public class Animal {
	//필드 
	String name; 
	
	//메소드 
	void sound() {
		System.out.println(this.name + "이/가 소리를 냅니다");
	}
}
