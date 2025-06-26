package task;

import java.util.Scanner;

//6일차 과제 3번 
public class SingTask03 {
	public static void main(String[] args) {
//		4) 총 부른 곡 수에 따른 보너스 곡 지급 
//		5곡을 부르면 1곡 추가 제공 
//		=> 별도 클래스 
		
		//로직구성 
		//1) 입력클래스 import 
		Scanner sc = new Scanner(System.in);
		
		//2) 변수 선언(금액 : money, 추가 곡수 : songAdd)
		int money = 0, songAdd = 0;
		
		//3) 상수 선언(곡당 금액 : songPrice) 
		int songPrice = 100; 
		
		//4) 입력 메시지 출력, money = nextInt()
		System.out.print("금액입력 : ");
		money = sc.nextInt();
		
		//5) 추가 곡수 계산 => songAdd = (money / songPrice) + (money / songPrice) / 5 
		songAdd = (money / songPrice) / 5;
		
		//6) 출력(00곡에서 00곡이 추가로 지급되어 00곡을 부를 수 있습니다 잔돈은 00원입니다
		//		 곡수, 추가 곡수, 총 곡수, 잔돈)
		System.out.printf("%d곡에서 %d곡이 추가로 지급되어 %d곡을 부를 수 있습니다 잔돈은 %d원입니다"
				, (money / songPrice), songAdd, ((money / songPrice) + songAdd), money % songPrice);
		
		//7) sc.close();
	}
}
