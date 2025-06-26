package scanner;

import java.util.Scanner;

//7번 : 입력클래스, 입력메소드 연습
public class ScannerTest03 {
	public static void main(String[] args) {
		//1. 사용자로부터 입력받아 주소를 출력하기 
		//1) 입력 클래스 선언 => 빨간 밑줄
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import
		// ctrl + shift + o
		
		//3) 문자열 변수 선언 
		String address;
		
		//+) 출력 메시지
		System.out.println("주소를 입력하세요.");
		
		//4) 입력메소드 사용 
		address = "서울시 강남구 역삼동";
		address = sc.nextLine();
		
		//5) 결과 출력
		System.out.println("주소는 " + address + "입니다.");
		System.out.printf("주소는 %s입니다.", address);
		
		//6) 입력클래스 해제
		sc.close();
		
	}
}
