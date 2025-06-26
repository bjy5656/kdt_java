package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		Review m = new Review();
		
		System.out.println((int)'4');
		
		//동일한 작업을 수행하는 코드를 여러번 작성하는 대신 메소드로 정의하면 
		//코드의 가독성과 효율성이 향상된다 
		
		//동일한 로직을 여러번 작성 
//		System.out.println("총 합 : " + (5+10));
//		System.out.println("첫번째 수 : " + 5);
//		System.out.println("총 합 : " + (1 + 2));
//		System.out.println("총 합 : " + (10 + 29));
//		
//		MethodBasic01 m = new MethodBasic01();
//		m.printSum(10, 29);
//		m.printSum(5, 10);
		
//		
//		System.out.println("첫번째 직사각형의 면적 : " + m.calculateArea(5, 10));
//		System.out.println("두번째 직사각형의 면적 : " + m.calculateArea(500, 123));
		
//		System.out.println("메소드를 이용 25의 제곱 : " + m.calSquare(25));
//		System.out.println("메소드를 이용 3의 제곱 : " + m.calSquare(3));
		
		
//		int num = 10;
//		System.out.println("main 메소드에서의 num의 값 : " + num);
//		modifyNum(num);
//		System.out.println("main 메소드에서의 num의 값 : " + num);
	
//		m.add(10, 20);
//		m.add(30.5, 1.1);
		
//		System.out.println(m.add(10, 20));
//		System.out.println(m.add(1, 2, 3));
//		m.add(10.5, 3);
//		m.add(3.3, 4);
		
//		int result = m.add(10, 20);
//		System.out.println(result);
		
	}
	
//	void printSum(int num1, int num2) {
//		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
//		System.out.println("총 합 : " + num1 + num2);
//	}
	
	//직사각형의 넓이 구하는 메소드 
//	int calculateArea(int width, int height) {
//		return width * height;
	
	//거듭제곱을 구하는 메소드 
//	int calSquare(int num) {
//		return num * num * num; 
//	}
//	
//	static void modifyNum(int num) {
//		System.out.println("modifyNum 메소드에서의 num의 값 : " + num);
//		num = 20; 
//		System.out.println("modifyNum 메소드에서의 num의 값 : " + num);
//	}
//	
//	void add(int num1, int num2) {
//		System.out.println(num1 + num2);
//	}
//	void add(double num1, double num2) {
//		System.out.println(num1 + num2);
//	}
	
	
	//메소드 오버로딩 : 메소드 이름이 같고 리턴타입, 매개변수 개수, 매개변수 타입이 다른 메소드 작성 
//	int add(int num1, int num2) {
//		return num1 + num2;
//	
//	}
//	
//	//매개변수의 개수가 다른 add 메소드 
//	int add(int num1, int num2, int num3) {
//		return num1 + num2 + num3;
//	}
//	
//	//매개변수의 타입이 다른 add메소드 
//	void add(double num1, int num2) {
//		System.out.println(num1 + num2);
//	}
//	
//	//매개변수의 순서가 다른 add메소드 
//	void add(int num1, double num2) {
//		System.out.println(num1 + num2);
//	}
	
	//두 정수의 합을 구하는 메소드 
//	int add(int num1, int num2) {
//		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2 );
//		return num1 + num2; 
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
