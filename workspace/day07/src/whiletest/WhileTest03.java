package whiletest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작 
		
		//2개의 정수를 입력받아서 두 정수의 합을 출력 
		//0을 입력하면 종료, 1을 입력하면 계속 반복 
		//while문 사용 
		//기타 제어문 사용 
		
		//1) 정수형 변수 2개 선언(두정수 합 구할 변수, 종료/반복 입력받을 변수), 입력클래스 import 
		//2) 반복문 while 무한반복(true)
		//3) while 중괄호 영역 
		//		3-1) 입력메시지출력 
		//		3-2) 변수 2개 선언 입력메소드 입력받기 
		//		3-3) 두 정수 합 구할변수 덧셈연산
		//		3-4) 두정수의 합 출력 
		//		3-5) 종료/계속할 지 출력 메시지 
		//		3-6) 종료/반복 입력받기 
		//		4) 조건문 if 종료라면 == 0 {
		//		4-1)	종료 메시지 출력 
		//		4-2)	break; }
		//		5) 조건문 if 계속이라면 == 1 {
		// 		5-1) 	계속 진행합니다 메시지 출력 
		//		5-2)	continue; }
		//		5-3)	프로그램 출력
		
		// }
		//반복문을 종료합니다
		//sc.close();
		
		int result = 0, choice = 0; //int형 변수 정수합, 반복여부 선언, 기본값 대입
		Scanner sc = new Scanner(System.in); //입력클래스 선언
		while(true) { //while문 시작, true일 때 반복
			System.out.println("두 정수를 입력하세요. : "); //입력메시지 출력
			int num1 = sc.nextInt(); //num1에 입력메소드로 정수 입력받고 대입
			int num2 = sc.nextInt(); //num2에 입력메소드로 정수 입력받고 대입 
			result = num1 + num2; //정수합 구하고 변수에 대입 
			System.out.println(num1 + " + " + num2 + " = " + result); //num1, num2, 정수합 출력
			System.out.println("1을 입력하시면 반복, 0을 입력하시면 종료합니다."); //안내메시지 출력 
			choice = sc.nextInt(); //반복여부 변수에 입력메소드로 정수 0/1 입력받고 대입 
			if (choice == 0) { //if문 시작부분, 반복하지 않을 때 실행
				System.out.println("종료합니다."); //종료합니다 출력 
				break; //while문 탈출
			} //if문 종료부분
			if (choice == 1) { //if문 시작부분, 반복할 때 실행 
				System.out.println("계속 진행합니다."); //진행합니다 출력 
				continue; //나머지 while문 실행하지 않고 while문 조건식으로 이동 
			} //if문 종료부분
			System.out.println("프로그램 출력"); //메시지 출력 
		} //while문 종료부분 
		System.out.println("반복문을 종료합니다."); //while문 종료 메시지 출력 
		sc.close(); //입력클래스 닫기 
		
		
		
		
	} //main 메소드 종료
} //클래스 종료 
