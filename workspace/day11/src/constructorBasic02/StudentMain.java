package constructorBasic02;

class Student{
	//필드 
	String name;
	int age; 
	
	//기본생성자
	public Student() {
		System.out.println("기본 생성자가 호출되었습니다");
	}
	//매개변수 1개 있는 생성자

	public Student(String name) {
		this.name = name;
//		System.out.println("매개변수 1개인 생성자가 호출되었습니다");
		System.out.println(this);
		
	}
	
}




public class StudentMain {
		
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student("짱구");
		System.out.println(st2.name);
		System.out.println(st2);
		
		Student st3 = new Student("백정이");
		System.out.println(st3);
		System.out.println(st3.name);
		
		
	}
}
