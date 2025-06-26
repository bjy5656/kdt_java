package task;

import java.util.Scanner;

//6일차 과제 1~2번
public class SingTask01 {
	public static void main(String[] args) {
		
//		1) 한 곡당 금액도 입력받기 
//		금액입력 : 1000 
//		곡 당 가격 입력 : 300 
//		[출력] 
//		3곡을 부를 수 있으며 잔돈은 100원입니다 

//		//1번 로직구성 
//		//1) 입력클래스 import 
//		Scanner sc = new Scanner(System.in);
//		
//		//2) 정수형 변수 선언(money, songPrice), 
//		int money = 0, songPrice = 0; 
//		
//		//3) 금액 입력 메시지 출력, money에 nextInt()로 입력받고 대입 
//		System.out.print("금액입력 : ");
//		money = sc.nextInt();
//		
//		//4) 곡 당 가격 입력 메시지 출력, sonPrice에 nextInt()로 입력받고 대입 
//		System.out.print("곡 당 가격 입력 : ");
//		songPrice = sc.nextInt();
//		
//		//5) 출력(부를 곡 수(money / songPrice), 잔돈(money % songPrice)) 
//		System.out.println((money / songPrice) + "곡을 부를 수 있으며 잔돈은 " + 
//		(money % songPrice) + "원입니다");
//		
//		//6) sc.close();
//		sc.close();
		
		
//		2) 잔돈이 부족할 경우 안내하기 
//		금액입력 : 100 
//		곡 당 가격 입력 : 
//		[출력] 
//		입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력 
		
		//2번 로직구성 
		//1) 입력클래스 import 
		Scanner sc = new Scanner(System.in);
		
		//2) 정수형 변수 선언(money, songPrice), 
		int money = 0, songPrice = 0; 
		
		//3) 금액 입력 메시지 출력, money에 nextInt()로 입력받고 대입 
		System.out.print("금액입력 : ");
		money = sc.nextInt();
		
		//4) 곡 당 가격 입력 메시지 출력, sonPrice에 nextInt()로 입력받고 대입 
		System.out.print("곡 당 가격 입력 : ");
		songPrice = sc.nextInt();
		
		//5) if (입력금액이 곡 당 가격 이상) 출력(부를 곡 수, 잔돈 => (money / songPrice), (money % songPrice)) 
		if (money >= songPrice) {
			System.out.println((money / songPrice) + "곡을 부를 수 있으며 잔돈은 " + 
		(money % songPrice) + "원입니다");
		}
		
		//6) else 출력(입력금액, 곡 당 가격, 부족한 금액 =>money, songPrice, (songPrice - money))
		else {
			System.out.printf("입력한 금액은 %d원입니다. 곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다"
					, money, songPrice, (songPrice - money));
		}
		
		//6) sc.close();
		sc.close();
		
		
	}
}
