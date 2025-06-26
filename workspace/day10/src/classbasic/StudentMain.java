package classbasic;
//10-2번 : Student 클래스의ㅡ 객체를 만들 클래스 
public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student();
		System.out.println(st2);
	
		//객체명.필드명 = 값;
		st1.name = "백정이";
//		System.out.println(st1.name);
//		System.out.println(st1.math);
//		System.out.println(st2.name);
//		System.out.println(st2.avg);
		st1.kor = 100;
		st1.eng = 100;
		st1.math = 100; 
		
		//매개변수 x, 리턴값 o => syso(객체명.메소드명());
		System.out.println(st1.getTotal());
		st1.avg = st1.getTotal() / 3.0;
		System.out.println("평균점수 : " + st1.avg);
		
		//st2 객체의 국어점수 100점, 영어점수 50점, 수학점수 77점 
		//메소드 호출하여 000님의 평균점수는 소수점한자리까지 출력하기 
		//로직구성
		//st2객체의 국어점수 초기화
		//st2객체의 영어점수 초기화 
		//st2객체의 수학점수 초기화 
		//st2객체의 이름 초기화 
		//st2객체의 평균점수를 st2객체의 getTotal() 메소드를 이용하여 초기화하기 
		//st2객체의 이름과 평균점수 출력 
		st2.kor = 100;
		st2.eng = 50;
		st2.math = 77;
		st2.name = "백정이";
		st2.avg = st2.getTotal() / 3.0;
		System.out.printf("%s님의 평균점수는 : %.1f", st2.name, st2.avg);
		
				
				
				
				
				
	}
}
