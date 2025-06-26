package iftest;

import java.util.Scanner;

//if문 : ifelse문 실습1
public class ifTask01 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작
		
//		//1. 사용자로부터 문자를 입력받아서 짝수인지 홀수인지 출력하기 
//		//로직구성 
//		//1) 입력클래스 import 
//		Scanner sc = new Scanner(System.in);
//		
//		//2) 입력 메시지 출력 
//		System.out.println("정수를 입력하세요.");
//		
//		//2) 정수형 변수 선언(num), nextInt()로 입력받기 
//		int num = sc.nextInt();
//		 
//		//3) if문 (num % 2 = 0) => 짝수 출력 
//		if(num % 2 == 0) {
//			System.out.println("입력하신 수는 짝수입니다.");
//		}
//		
//		//4) else문 => 홀수 출력 
//		else {
//			System.out.println("입력하신 수는 홀수입니다.");
//		}
//		
//		//5) sc.close();
//		sc.close();

		//1) 입력클래스 import 
		//2) 정수형 변수 선언 
		//3) 입력 메시지 출력 
		//4) 정수 입력메소드 사용 
		//5) 조건문(if~else)문 
			//if 조건식 산술연산자(%), 관계연산자(!=)
			//	출력메소드
			//else
			//	출력메소드
		//6) 스캐너 닫기 
		
		Scanner sc = new Scanner(System.in); //입력클래스 선언 
		int choice = 0; //int형 변수 choice 선언하고 기본값 0 대입 
		//자료형들의 기본값 
		//정수 0, 실수 0.0, 문자형 ' ', 문자열"" or null, 논리형 false 
		System.out.println("숫자 1개 입력 : "); //메시지 출력 
		choice = sc.nextInt(); //nextInt()로 숫자 1개 입력받고 choice에 대입 
		if(choice % 2 == 0) { //if문 시작부분, choice 2로 나눈 나머지가 0, 즉 짝수일 때 실행
			System.out.println("짝수입니다"); //짝수입니다 메시지 출력 
		}else { //else문 시작, choice 2로 나눈 나머지가 0이 아닌 경우 실행 
			System.out.println("홀수입니다"); //홀수입니다 메시지 출력 
		} //else문 종료부분
		
		//삼항연산자 
		System.out.println(choice % 2 != 1 ? "짝수입니다" : "홀수입니다"); 
		//choice를 2로 나눈 나머지가 1이 아니면 짝수입니다 출력, 그 외의 경우는 홀수입니다 출력, 음수 홀수를 넣으면 짝수입니다 출력됨 
		
		sc.close();
		//입력클래스 닫기 
	
	} //main 메소드 종료 
} //클래스 종료 
