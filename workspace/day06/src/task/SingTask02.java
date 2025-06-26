package task;

import java.util.Scanner;

//6일차 과제 3번 
public class SingTask02 {
	public static void main(String[] args) {
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)  
//		금액입력 : 1000 
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다 
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다 
		
		//로직구성
		//1) 입력클래스 import 
		Scanner sc = new Scanner(System.in);
		
		//2) int형 변수 선언(입력금액 => money) 
		int money = 0;
		
		//3) int형 상수 선언(곡당 금액 => songPrice, 음료 금액 => drinkPrice) 
		final int songPrice = 200, drinkPrice = 100;
		
		//4) 입력 메시지 출력, 입력금액 = nextInt()
		System.out.print("금액입력 : ");
		money = sc.nextInt();
		
		//5) 출력(부를 곡 수, 잔돈 => (money / songPrice), (money % songPrice) 
		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다\n", (money / songPrice), (money % songPrice));
		
		//6) 출력(음료 마실 경우 곡 수, 잔돈 => ((money - drinkPrice) / songPrice), (money - drinkPrice) % songPrice)
		System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다"
				, ((money - drinkPrice) / songPrice), ((money - drinkPrice) % songPrice));
		
		//7) sc.close();
		sc.close();
	
	
	}
}
