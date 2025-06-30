package gameTask;

import java.util.Scanner;

//game - Main 클래스 
public class Main {
	public static void main(String[] args) {
		//마법사, 전사, 로그 객체 생성 
		Wizard wizard = new Wizard();
//		Worrior worrior = new Worrior(); 
//		Rogue rogue = new rogue(); 
		
		//입력클래스 import 
		Scanner sc = new Scanner(System.in);
		//입력 메시지 출력
		System.out.println("캐릭터를 선택하십시오. : \n1. 마법사\n2. 전사\n3. 로그");
		//정수형 변수 선언(캐릭터번호), 기본값 0 대입 
		int characterNum = 0; 
		//사용자가 입력 캐릭터 번호를 변수에 대입 
		characterNum = sc.nextInt(); 
		//사용자 입력 번호에 따라 객체 결정 
		
		
		//정수형 변수 선언(선택번호), 기본값 0 대입
		int menuNum = 0; 
		//선택한 캐릭터로 반복적으로 메뉴 실행
		while(true) {
			//메뉴 출력(기본공격, 스킬공격, 특수공격, 종료)
			System.out.println("1. 기본공격\n2. 스킬공격\n3. 특수공격\n4. 종료");
			//선택번호에 사용자에게 번호 입력받고 대입 
			menuNum = sc.nextInt();
			if(menuNum < 1 || menuNum > 4) {
				System.out.println("번호를 잘못 입력하셨습니다");
				continue; 
			}else if(menuNum == 1) {
//				normalAttack();
			}
			
		}
		
	}
}
