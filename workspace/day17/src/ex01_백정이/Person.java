package ex01_백정이;

public abstract class Person {
	//필드 
	private String name; 
	private int age; 
	
	//생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드 
	public String getName() {
		return name;
	}

	public abstract void socre();
	
	
	
}
