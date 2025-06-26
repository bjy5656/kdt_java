package oper;
// 14번 : 증감연산자
public class OperTest02 {
	public static void main(String[] args) {
		
		int num = 1; 
		System.out.println("num의 값 : "+num); //1
		System.out.println("num + 10의 값 : " + (num + 10));
		
		System.out.println("\n========증감연산자(전위형)========");
		System.out.println("기존 num의 값 : " + num); //1
		System.out.println("전위증감연산자를 사용한 num의 값 : " + ++num); //2
		System.out.println("현재 num의 값 : " + num); //2
		
		System.out.println("\n========증감연산자(후위형)========");
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2); //1
		System.out.println("후위증감연산자를 사용한 num2의 값 : " + num2++); //1
		System.out.println("현재 num2의 값 : " + num2); //2
		
		System.out.println();
		int num3 = 7, num4 = 7; 
		int result1 = 0, result2 = 0; 
		
		result1 = --num3 + 4;
		System.out.println(result1);
		
//		result2 = num4++ - 4;
		result2 = (num4++) - 4;  // 7 - 4 대입 
		System.out.println(result2); 
		System.out.println(num4); //8
		
	}
}
