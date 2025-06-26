package oper;

import java.util.Scanner;

//6번 : 삼항연산자 실습1
public class OperTask02 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작 
		
//		//두 수를 입력받아 비교 
//		//크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성 
//		
//		//1) 입력클래스 import 
		Scanner sc = new Scanner(System.in); //입력클래스 선언
		
//		//2) 입력 메시지 출력 
//		System.out.println("첫 번째 정수를 입력하세요"); 
//		
//		//3) 변수 선언, 입력메소드 사용 
//		int num1 = sc.nextInt(); //int num1 변수 선언하고 nextInt()로 정수 입력받기 
//		
//		//4) 입력메시지 출력 
//		System.out.println("첫 번째 정수를 입력하세요"); //메시지 출력 
//		
//		//5) 변수 선언, 입력메소드 사용 
//		int num2 = sc.nextInt(); //int num2 변수 선언하고 nextInt()로 정수 입력받기 
//		
//		//6) 삼항연산자 사용하여 출력 => 크다/작다/같다가 출력되어야함 
//		System.out.println("비교 결과는 첫 번째 정수 기준 : " + 
//		(num1 > num2 ? "크다" : (num1 == num2 ? "같다" : "작다"))); // num1>num2 true이면 "크다" false이면 다음 삼항연산자로 
		                                                         // => num1==num2 true이면 "같다" false이면 "작다"
		
//		sc.close();
		
		//2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기 
		//짝수입니다 or 짝수가 아닙니다로 출력할 것 
		
		//1) 입력클래스 import 
		//2) 입력메시지 출력 
		System.out.println("정수 하나를 입력하세요."); //메시지 출력
		//3) 변수 선언, 입력메소드 사용 
		int num = sc.nextInt(); //int 변수 num 선언하고 nextInt()로 정수 입력받고 대입 
		//4) 삼항연산자 사용하여 출력 => 짝수 or 짝수 아님 출력 
		System.out.println("입력하신 수는 " +
		(num % 2 == 0 ? "짝수입니다." : "짝수가 아닙니다.")); //num 2로 나눈 나머지 0 ture이면 짝수, false이면 짝수 아님 
		
		sc.close(); //입력클래스 닫기 
		
//		Scanner sc = new Scanner(System.in); //입력클래스 선언 
//		System.out.println("크기 비교할 숫자 1 입력 : ");
//		int num1 = sc.nextInt(); //int 변수 num1 선언후 nextInt()로 정수 입력받고 대입 
//		System.out.println("크기 비교할 숫자 2 입력 : "); //메시지 출력
//		int num2 = sc.nextInt(); //int 변수 num2 선언후 nextInt()로 정수 입력받고 대입 
//		String result = num1 > num2 ? num1 + "" : (num1 == num2) ? "같은 수" : num2 + ""; //result에 num1 이 num2보다 크면 num1값 문자열로 저장, 그렇지 않으면 다음 삼항연산자 연산
		                                                                                //num1 num2와 같으면 같은 수 저장, 그렇지 않으면 num2값 문자열로 저장 
//		System.out.println(result); //result 값 출력 
		
//		//1) 입력클래스 import 
//		//2) 정수형 변수 1개(입력메소드), 문자열변수 1개(삼항연산자, 나머지연산자) 
//		//3) 출력 
//		System.out.println("숫자 1개 입력 : "); //숫자 입력 메시지 출력 
//		int number = sc.nextInt(); //int 변수 number 선언하고 nextInt()로 정수 입력받고 대입 
//		String result1 = (number % 2 == 0) ? "짝수입니다" : "짝수가 아님니다"; //result1에 number값 2로 나눈 나머지 0 true이면 짝수입니다 저장, false이면 짝수가 아닙니다 저장 
//		System.out.println("입력한 숫자는 " + number + "는 " + result1); //number 값, result1 값 출력 
//		
//		sc.close(); //입력클래스 닫기 
		
	} //main 메소드 종료 
} //클래스 종료 
