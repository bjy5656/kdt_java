package day07_실습문제3번;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAge {
	public static void main(String[] args) {
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//		0 ~ 12 : 어린이입니다
//		13 ~ 19 : 청소년입니다
//		20 이상 : 성인입니다
//		
//		나이입력 : 16
//		현재 나이는 16살이고 청소년입니다
		
		//입력클래스 import 
		//나이변수 선언 
		//입력메시지 출력
		//나이 = nextInt() 
		//try
		//	validate 메소드 호출, 나이 대입 
		//catch InputMismatchException2 
		//	printStackTrace
		//catch OutOfBoundsException 
		//	printStackTrace 
		//catch Exception 
		//	printStackTrace 
		//if age가 20 이상 
		//	출력(나이, 성인입니다) 
		//else if age가 13 이상
		//	출력(나이, 청소년입니다) 
		//else if age가 0 이상  
		//	출력(나이, 어린이입니다) 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력 : ");
		int age = sc.nextInt();
		try {
			validate(age);
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(OutOfBoundsException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		if(age >= 20) {
			System.out.println("현재 나이는 " + age+ " 살이고 성인입니다");
		}else if(age >= 13) {
			System.out.println("현재 나이는 " + age+ " 살이고 청소년입니다");
		}else if(age >= 0){
			System.out.println("현재 나이는 " + age+ " 살이고 어린이입니다");
		}
	}
	
	//입력값 확인, 예외 던지기 메소드 
	//리턴타입 => void
	//메소드명 validate 
	//매개변수 => int 나이 
	//if 나이 < 0 
	//	OutOfBoundsException 발생 
	//	
	
	static void validate(int age) throws OutOfBoundsException{
		if(age < 0) {
			throw new OutOfBoundsException();
		}
	}
}
