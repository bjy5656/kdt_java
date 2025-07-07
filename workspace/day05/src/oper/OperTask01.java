package oper;

import java.util.Scanner;

//13번 : 산술연산자 응용
public class OperTask01 {
	public static void main(String[] args) {
		//코인노래방 프로그램
		//사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력 
		//금액입력 :	1000 
		//[출력] 
		//3곡을 부를 수 있으며 잔돈은 100원입니다
		
//		//로직구성 
//		//1) Scanner 클래스 선언, import
//		Scanner sc = new Scanner(System.in);
//		
//		//2) 변수 선언(int amount, int count, int rest)
//		int amount, count, rest; 
//		
//		//3) 메시지 출력(금액입력)
//		System.out.println("금액입력 : ");
//		
//		//4) nextInt()함수로 입력받고 amount 변수에 대입
//		amount = sc.nextInt();
//		
//		//5) count = amount / 300
//		count = amount / 300; 
//		
//		//6) rest = amount % 300 
//		rest = amount % 300; 
//		
//		//7) 결과출력
//		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.", count, rest);
//		
//		//8) Scanner 닫기 
//		sc.close();
		
		//1) 입력클래스 import 
		//2) 금액을 입력하세요 메시지 출력 
		//3) 정수형 변수1 = 입력메소드(nextInt())\
		//4) 상수 = 300 
		//4) 정수형 변수2 = 변수1 / 상수명 
		//6) 정수형 변수3 = 변수1 % 상수명 
		//7) 출력 
		//8) Scanner 해제
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
//		System.out.println(money);
		final int PRICE = 300; 
		int song = money / PRICE;
		int change = money % PRICE;
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다.");
		sc.close();
		
	}
}
