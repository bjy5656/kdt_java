package classbasic02;
//11번 : Student 클래스 main 
public class StudentMain {
	public static void main(String[] args) {
		
//		String name = "짱구";
		
		Student st1 = new Student();
		System.out.println(st1); //classbasic02.Student@37a71e93
		
		st1.name = "홍길동";
		st1.age = 17;
		st1.gpa = 4.5;
		
		System.out.println("이름 : " + st1.name);
		System.out.println("나이 : " + st1.age);
		System.out.println("학점 : " + st1.gpa);
		
		
	}
}
