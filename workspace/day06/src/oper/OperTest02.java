package oper;

import java.util.Scanner;

//5번 : 삼항연산자
public class OperTest02 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작
		
		//조건식 > 참일때의값 : 거짓일때의값;
		//조건식은 반드시 boolean 결과를 반환해야한다(true, false) 
		//삼항 연산자는 값을 반환하기 때문에 변수에 저장하거나 바로 출력할 수 있다
		
		System.out.println(true ? "참입니다" : "거짓입니다"); //true이므로 첫번째값 출력
		System.out.println(false ? "참입니다" : "거짓입니다"); //flase이므로 두번째값 출력 
							//true
		System.out.println(10 > 5 ? "10이 더 큰수입니다" : "10이 큰수가 아닙니다"); //true이므로 첫번째값 출력 
		System.out.println(10 > 5 && 10 == 5 ? "true입니다" : "false입니다"); //true && false => false이므로 두번째값 출력 
		
		int number = 1 < 2 ? 1 : -1; //int형 변수 num 선언, 1<2 => true => 1 대입 
		System.out.println(number); //number 값 1 출력 
		
		//정수 2개를 입력받아서 큰 수 구하기 
		//입력클래스 import 
		//입력메시지 출력
		//정수형 변수 2개 선언 
		//문자열 변수 1개 선언, 삼항연산자 대입  
		//출력 
		//sc.close();
		
		Scanner sc = new Scanner(System.in); //입력클래스 선언 
		System.out.println("비교할 두 숫자를 입력하세요"); //메시지 출력 
		int num1 = sc.nextInt(); //첫번째 숫자 입력받고 int형 num1에 저장
		int num2 = sc.nextInt(); //두번째 숫자 입력받고 int형 num2에 저장 
		String result = num1 <= num2 ? num2 + "가 큽니다" : num2 + "가 크지 않습니다"; //num1가 num2보다 작거나 같으면 num2가 큽니다 출력, 그렇지 않으면 num2가 크지 않습니다 문자형 result에 저장 
		System.out.println(num1 + "과 " + num2 + "비교 결과는 " + result); //비교결과(result) 출력 
	} //main 끝
} //클래스 종료 
