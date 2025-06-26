package oper;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class OperTask01 {
	public static void main(String[] args) {
		
		//사용자가 입력한 값 2개를 서로 비교하기(관계연산자 3개 확인)
		//nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		//변수 만들 때 의미있는 문자로 사용 
		//로직구성부터!
		
//		//1) 입력클래스 import 
//		Scanner sc = new Scanner(System.in);
//		
//		//2) 정수형 변수 2개 선언(first, second) 
//		int first, second;
//		
//		//3) 입력 메시지 출력 
//		System.out.println("두 개의 정수를 공백으로 구분해서 입력하세요.");
//		
//		//4) first = nextInt()
//		first = sc.nextInt();
//		
//		//5) second = nextInt() 
//		second = sc.nextInt();
//		
//		//6) syso(fitst > second)
//		System.out.println("첫번째 수가 두번째 수보다 크나요? : " + (first > second));
//		
//		//7) syso(first == second) 
//		System.out.println("첫번째 수와 두번째 수가 같나요? : " + (first == second));
//
//		//8) syso(first != second) 
//		System.out.println("첫번째 수와 두번째 수가 다르나요? : "+ (first != second));
//		
//		//9) 입력클래스 해제 
//		sc.close();
		
		//1) 입력클래스 import 
		//2) 정수형 변수 2개 선언
		//3) 입력 메시지 출력(숫자 2개를 입력(띄어쓰기로) : )
		//4) 변수 입력메소드사용(nextInt())
		//5) 출력(3개)
		//+) sc.close();
		
		Scanner sc = new Scanner(System.in);
//		int num1, num2; 
//		System.out.println("숫자 2개를 띄어쓰기로 구분하여 입력하세요 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
//		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
//		System.out.println(num1 + " > " + num2 + " || " + num1 + " == " + num2 + " : " + (num1 > num2 || num1 > num2));
		
		//정수 관계연산자 사용 
		double num3, num4; 
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
//		0.00000000000000000000000001
//		0.0000000000000000001
//		1.0E-26 < 1.0E-19 : true
//		1.0E-26 : 10의 -26제곱(소수점아래 26자리)
//		1.0E-19 : 10의 -19제곱(소수점아래 19자리)
		
	}
}
