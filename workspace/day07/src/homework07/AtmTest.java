package homework07;

import java.util.Scanner;

//과제 6번 문제
public class AtmTest {
	public static void main(String[] args) {
		
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		   [조건]
//		   초기 잔액은 10000원으로 설정
//		   메뉴 선택에 따라 작업 수행
//		   종료시 프로그램 종료
//		   숫자(번호)로 입력받기
//
//		   String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
//		      + "\n1. 잔액조회"
//		      + "\n2. 입금"
//		      + "\n3. 출금"
//		      + "\n4. 종료"
//		      + "\n선택 : ";
//		      System.out.println(msg);
//		   그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//		   번호 입력시 해당 메시지만 출력
		
		//로직구성 
		//입력클래스 import 
		//정수형 변수 선언(잔액, 번호), 잔액 10000 대입 
		//문자열 변수 선언(입력메시지) 
		//while문 true일 때 반복
		//	입력메시지 변수 출력 
		//  번호 변수에 입력메소드로 정수 입력받고 대입 
		//  if문 번호<1 || 번호>4 참이면 실행 
		//   	출력(다시 선택하세요), continue
		//	if문 번호 == 1 참이면 실행 
		//   	출력(잔액)
		//	if문 번호 == 2 참이면 실행 
		//		입금금액 입력메시지 출력 
		//		정수형 변수 입금금액 선언하고 입력메소드로 입력받기 
		// 		잔액 += 입금금액
		// 	 	출력(입금금액, 잔액) 
		// 	while문 번호 == 3 참이면 반복
		//		출금금액 입력메시지 출력 
		// 		정수형 변수 출금금액 선언하고 입력메소드로 입력받기 
		//		if문 잔액 < 출금금액 참이면 실행
		//			출력(현재 잔액보다 많습니다), continue
		//		잔액 -= 출금금액
		//		출력(출금금액, 잔액)
		//		while문 탈출
		//	if문 번호 == 4 참이면 실행 
		//		while문 탈출 
		//while문 끝 
		//출력(종료메시지)
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int balance = 10000, num = 0;
		String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
			      + "\n1. 잔액조회"
			      + "\n2. 입금"
			      + "\n3. 출금"
			      + "\n4. 종료"
			      + "\n선택 : ";
		while(true) {
			System.out.println(msg);
			num = sc.nextInt();
			if (num < 1 || num > 4) {
				System.out.println("다시 선택하세요");
				continue;
			}
			if (num == 1) {
				System.out.printf("현재 잔액은 %d원입니다\n", balance);
			}
			if (num == 2) {
				System.out.println("입금할 금액을 입력하세요 : ");
				int depositAmount = sc.nextInt();
				balance += depositAmount;
				System.out.printf("%d원 입금되었습니다 잔액은 %d원입니다\n", depositAmount, balance);
			}
			while (num == 3) {
				System.out.println("출금할 금액을 입력하세요 : ");
				int withdrawalAmount = sc.nextInt();
				if (balance < withdrawalAmount) {
					System.out.println("현재 잔액보다 많습니다");
					continue;
				}
				balance -= withdrawalAmount;
				System.out.printf("%d원 출금되었습니다 잔액은 %d원입니다\n", withdrawalAmount, balance);
				break;
			}
			if (num == 4) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
