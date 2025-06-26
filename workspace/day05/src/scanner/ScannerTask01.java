package scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTask01 {
	public static void main(String[] args) {
		//1. 본인의 이름과 성별을 입력받고 출력하기 
		//입력 예> 이름 입력 : 
		//입력 예> 성별 입력 :
		//출력 예> 이름은 000이고 00입니다. 
		
		//로직구성
		//1) Scanner 클래스 선언 
		Scanner sc = new Scanner(System.in);
		
		//2) Scanner 클래스 import 
		//ctrl + shift + o
		
		//3) 메시지 출력 (이름 입력 :)
		System.out.println("이름 입력 :");
		
		//4) 문자열 변수 선언(name), 입력메소드(.next()) 사용
		String name = sc.next();
		
		//5) 메시지 출력 (성별 입력 :)
		System.out.println("성별 입력 :");
		
		//6) 문자열 변수 선언(gender), 입력메소드(.next()) 사용 
		char gender = sc.next().charAt(0);
		
		//7) 결과 출력 (이름과 성별)
		System.out.printf("이름은 %s이고 %s자입니다.", name, gender);
		
		//8) Scanner 클래스 해제 
		sc.close();
		
		
//		//로직구성2
//		//1) 입력클래스 선언
//		Scanner sc = new Scanner(System.in);
//		//2) 이름과 성별 입력 메시지 출력 
//		System.out.println("이름과 성별을 띄어쓰기로 입력하세요 : ");
//		//3) 문자열 변수(name, gender) 선언 
//		String name, gender;
//		//4) 변수에 입력 메소드 사용(next())
//		name = sc.next();
//		gender = sc.next();
//		//5) 결과 출력 
//		System.out.printf("이름은 %s이고, 성별은 %s입니다.", name, gender);
//		//6) 입력클래스 해제 
//		sc.close();
	}
}
