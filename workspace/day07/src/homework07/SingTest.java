package homework07;

import java.util.Scanner;

//과제 7번 문제 
public class SingTest {
	public static void main(String[] args) {
		
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
//
//		[입출력 예시]
//		곡 당 가격 입력: 300
//		금액 입력 (0 입력 시 종료): 1000
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//		음료를 마시고 싶으면 3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 구매하시겠습니까? (YES/NO): YES
//		음료를 구매하셨습니다.
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		금액 입력 (0 입력 시 종료): 900
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//		음료를 구매하시겠습니까? (YES/NO): YES
//		음료를 구매하셨습니다.
//		2곡을 부를 수 있으며 잔돈은 200원입니다
//		금액 입력 (0 입력 시 종료): 900
//		3곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//		음료를 구매하시겠습니까? (YES/NO): NO
//		음료를 구매하지 않았습니다.
//		금액 입력 (0 입력 시 종료): 0
//		프로그램을 종료합니다.
		
		//로직구성 
		//입력클래스 import 
		//정수형 변수 선언(금액, 곡당가격, 곡수, 잔돈, 보너스곡수)
		//문자열 변수 선언(대답)
		//정수형 상수 선언(음료가격)
		//입력메시지 출력(곡당가격)
		//곡당가격에 입력메소드로 문자열 입력받고 대입 
		//sc.nextLine();
		//while문 true일 때 반복
		//	입력메시지 출력(금액(0 입력시 종료))
		//	금액에 입력메소드로 정수 입력받고 대입
		//	sc.nextLine();
		// 	if문 금액==0 참이면 while문 탈출
		//	if문 금액<곡당가격 참이면 
		//		출력(노래를 부를 수 없습니다), continue
		//	보너스곡수 = (금액 / 곡당가격) / 5
		//	곡수 = 금액 / 곡당가격 + 보너스곡수 
		//	잔돈 = 금액 % 곡당가격
		//	출력(곡수, 잔돈) 
		//	보너스곡수 = ((금액-음료가격) / 곡당가격) / 5
		//	곡수 = (금액-음료가격) / 곡당가격 + 보너스곡수
		//	잔돈 = (금액-음료가격) % 곡당가격
		//	출력(곡수, 잔돈)
		//	while문 true일 때 반복 
		//		입력메시지 출력(음료 구매 여부) 
		//		대답에 입력메소드로 문자열 입력받고 대입 
		//		if문 대답 (YES이거나 NO) 아니면 실행 (.equals()메소드로 비교)
		//			출력(다시 입력하세요)
		//			continue 
		//		if문 대답 YES일 때 실행 (.equals()메소드로 비교)
		//			if문 (금액-음료가격)<곡당가격 참이면 실행
		//				출력(노래를 부를 수 없습니다), continue 
		//			출력(음료를 구매하셨습니다)
		//			출력(곡수, 잔돈)
		//		else문
		//			출력(음료를 구매하지 않았습니다)
		//		break
		//출력(프로그램 종료)
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int money = 0, price = 0, song = 0, change = 0, bonusSong = 0;
		String answer = "";
		final int DRINK_PRICE = 100;
		System.out.println("곡 당 가격 입력: ");
		price = sc.nextInt();
		sc.nextLine();
		while(true) {
			System.out.println("금액 입력 (0 입력 시 종료): ");
			money = sc.nextInt();
			sc.nextLine();
			if (money == 0) {
				break;
			}
			if (money < price) {
				System.out.println("노래를 부를 수 없습니다");
				continue;
			}
			bonusSong = (money / price) / 5;
			song = money / price + bonusSong;
			change = money % price;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다\n", song, change);
			bonusSong = ((money - DRINK_PRICE) / price) / 5;
			song = (money - DRINK_PRICE) / price + bonusSong;
			change = (money - DRINK_PRICE) % price;
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다\n", song, change);
			while(true) {
				System.out.println("음료를 구매하시겠습니까? (YES/NO): ");
				answer = sc.nextLine();
				if (!(answer.equals("YES") || answer.equals("NO"))) {
					System.out.println("다시 입력하세요");
					continue;
				}
				if (answer.equals("YES")) {
					if ((money - DRINK_PRICE) < price) {
						System.out.println("노래를 부를 수 없습니다");
						continue;
					}
					System.out.println("음료를 구매하셨습니다");
					System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다\n", song, change);
				}else {
					System.out.println("음료를 구매하지 않았습니다");
				}
				break;
				
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
