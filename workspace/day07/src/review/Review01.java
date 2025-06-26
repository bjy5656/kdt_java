package review;

import java.util.Scanner;

//3) 복습문제
public class Review01 {
	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고 
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기 
		
		//1) 입력클래스 import 
		//2) 정수형 변수 선언(입력숫자)
		//+) 입력 메시지 출력, 입력숫자에 입력메소드로 정수 입력받고 대입 
		//3) 조건문 (입력숫자가 1보다 크거나 같다와 10보다 작거나 같다가 모두 참인 경우) => 입력숫자 제곱 출력 
		//4) 그 외 경우 => 잘못 입력했습니다 출력 
		//5) 입력클래스 닫기 
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0; 
//		
//		System.out.println("정수를 입력하세요");
//		num = sc.nextInt();
//		
//		if (num >= 1 && num <= 10) {
//			System.out.println("입력하신 수의 제곱 : " + num*num);
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
//		
//		sc.close();
		
		
		//한글로만 로직구성
		//1) 입력클래스 import 
		//2) 정수형 변수 
		//3) 출력 메시지 
		//4) 변수 정수형 입력메소드 
		//5) if 조건식 1<= 변수 && 변수 <= 10, 0 < 변수 && 변수 < 11 
			//6) 변수 * 변수 
		//7) else 
			//8) 잘못입력했습니다 출력 
		//9) sc.close(); 
		
		Scanner sc = new Scanner(System.in);
//		int num = 0; 
//		System.out.println("1부터 10까지의 숫자만 입력하세요");
//		num = sc.nextInt();
//		if ( 1 <= num && num < 11) {
//			System.out.println(num * num);
//			System.out.println(num * 2);
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}

		 //문자열끼리의 비교는 관계연산자(==)를 사용하지 않고 
		//.equals() 메소드를 사용해서 비교한다!!
		System.out.println("문자열1 입력 : ");
		String data1 = sc.nextLine();
		System.out.println("문자열2 입력 : ");
		String data2 = sc.nextLine();
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		if (data1.equals(data2)) {
			System.out.println("두 문자열 같습니다");
		} else {
			System.out.println("두 문자열 같지 않습니다");
		}
		

	}
}