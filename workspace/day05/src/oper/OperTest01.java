package oper;
//13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20; 
		double num3 = 5.5, num4 = 2.5;
		
//		System.out.println("========덧셈========");
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));
//		System.out.println(num1 + " + " + num4 + " = " + (num1 + num4));
//		
//		System.out.println("========뻴셈========");
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
//		System.out.println(num1 + " - " + num4 + " = " + (num1 - num4));
//
//		System.out.println("========곱셉========");
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
//		System.out.println(num1 + " * " + num4 + " = " + (num1 * num4));
//
//		System.out.println("========나눗셈========");
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
//		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4));
//	
//		System.out.println("========나머지========");
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
//		System.out.println(num1 + " % " + num4 + " = " + (num1 % num4));
	
		//복합대입연산자 
		int num = 10;
		System.out.println("num의 현재 값 : " + num);
		num = num + 5;
		System.out.println("num의 현재 값 : " + num);
		num = num + 15;
		System.out.println("num의 현재 값 : " + num);
		num += 5; //num = num + 5 
		System.out.println("num의 현재 값 : " + num);
		num -= 2.5;
		System.out.println("num의 현재 값 : " + num); //32, 실제 계산값은 32.5이지만(정수-실수) int형 변수에 저장해서 강제형변환됨 
		num *= 2;
		System.out.println("num의 현재 값 : " + num);
		
		

		
		
		
		
		
		
	}
}
