package oper;

import java.util.Scanner;

//3번 : 관계연산자와 논리 연산자
public class OperTest01 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작
		
		System.out.println("=========관계 연산자========"); //메시지 출력 
		
		int num1 = 10, num2 = 20, num3 = 10; 
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2)); //10 > 20 => false 출력
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2)); //10 < 20 => true 출력
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2)); //10 >= 20 => false 출력
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2)); //10 <= 20 => true 출력
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2)); //10 == 20 => false 출력
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2)); //10 != 20 => true 출력
		System.out.println(num1 + " == " + num3 + " : " + (num1 == num3)); //10 == 10 => true 출력
		
//		System.out.println(10 >= 10); //10이 10보다 크거나 같으므로 true 출력 
		
		System.out.println("=========논리 연산자========"); //메시지 출력 
		System.out.println("and : 둘 다 참이면 참(&&)"); //메시지 출력 
		System.out.println(true && true);	//true, 둘다 참 => 참
		System.out.println(true && false);	//false, 하나만 참 => 거짓
		System.out.println(false && true);	//false, 하나만 참 => 거짓
		System.out.println(false && false);	//false, 둘다 거짓 => 거짓
		
		System.out.println("or : 둘 중 하나라도 참이면 참(||)"); //메시지 출력 
		System.out.println(true || true);	//true, 둘다 참 => 참 
		System.out.println(true || false);	//true, 하나만 참 => 참 
		System.out.println(false || true);	//true, 하나만 참 => 참 
		System.out.println(false || false);	//false, 둘다 거짓 => 거짓 
		
		System.out.println("not : 참이면 거짓, 거짓이면 참(!)"); //메시지 출력 
		System.out.println(!true);	//false, //참 -> 거짓 
		System.out.println(!false);	//true //거짓 -> 참 
		
	} //main 메소드 종료 
} //클래스 종료 
