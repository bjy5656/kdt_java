package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
//		int num = -8; 
//		System.out.println(num >> 1);
//		System.out.println(num >>> 1);
//		System.out.println(Integer.toBinaryString(-4));
//		System.out.println(Integer.toBinaryString(-4 >>> 1));
		
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고 
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력 
		
		//1) 입력클래스 import 
		//2) 정수형 변수 선언(입력숫자) 
		//3) 입력메시지 출력, 입력숫자에 입력메소드로 정수 입력받고 저장하기 
		//4) 조건문 (입력숫자가 1보다 크거나 같다 && 입려숫자가 10보다 작거나 같다) => 입력숫자 제곱 출력 
		//5) 그 외 경우 => 잘못 입력했습니다 출력 
		//6) 입력클래스 닫기 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0; 
//		
//		System.out.println("정수를 입력하세요");
//		num = sc.nextInt();
//		
//		if (num >= 1 && num <= 10) {
//			System.out.println("입력하신 수의 제곱 : " + num*num);
//		} else {
//			System.out.println("잘못 입력했습니다.");
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
			//8) 잘못 입력했습니다 출력 
		//9) sc.close(); 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0; 
//		System.out.println("1부터 10까지의 숫자만 입력하세요");
//		num = sc.nextInt();
//		if ( 1 <= num && num < 11) {
//			System.out.println(num*num);
//			System.out.println(num*2);
//		} else {
//			System.out.println("잘못 입력했습니다");
//		}
//		
//		//문자열끼리의 비교는 관계연산자(==)를 사용하지 않고 
//		//.equals() 메소드를 사용해서 비교한다!!
//		System.out.println("문자열1 읿력 : ");
//		String data1 = sc.nextLine();
//		System.out.println("문자열2 입력 : ");
//		String data2 = sc.nextLine();
//		System.out.println(data1 == data2);
//		System.out.println(data1.equals(data2));
//		if (data1.equals(data2)) {
//			System.out.println("두 문자열 같습니다");
//		} else {
//			System.out.println("두 문자열 같지 않습니다");
//		}
//		
//		sc.close();
		
		//금액과 곡 당 가격을 입력받아 부를 수 있는 곡 수의 잔돈 계산 
		//1) 입력클래스 import 
		//2) 정수형변수 4개 선언 
		//3) 입력메시지 출력 
		//4) 변수1 nextInt() 입력받아 저장 
		//5) 곡 당 가격 입력 메시지 출력 
		//6) 변수2 nextInt() 입력받아 저장 
		//7) if ~ else 문 
			//if문 조건식 변수1 < 변수2 
			//입력한 금액과 부족한 금액 
			//else문 
			//변수3 변수1 / 변수2
			//변수4 변수1 % 변수2 
			//곡 수, 잔돈 
		//8) 스캐너 닫기 
		
//		Scanner sc = new Scanner(System.in);
//		int money = 0, price = 0, song = 0, change = 0; 
//		System.out.println("금액 입력 : ");
//		money = sc.nextInt();
//		System.out.println("곡 당 가격 입력 : ");
//		price = sc.nextInt();
//		if (money < price) {
//			System.out.printf("입력한 금액은 %d원입니다. 한 곡당 가격은 %d 이고 %d원이 부족합니다."
//					, money, price, (price - money));
//		} else {
//			song = money / price; 
//			change = money % price;
//			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다"
//					, song, change);
//		}
//		sc.close(); 
		
		// 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원) 
		// 총 부른 곡 수에 따른 보너스 곡 지급 
		// 5곡을 부르면 1곡 추가 제공 
		
//		// 1) 입력클래스 import 
//		Scanner sc = new Scanner(System.in);
//		// 2) 정수형 상수 2개 선언, 정수형 6개 선언(금액입력, 노랙곡수, 잔돈, 음료마실경우노래곡수, 음료마실경우잔돈, 보너스곡)
//		final int PRICE = 200, PRICE_DRINK = 100; 
//		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0, bonus = 0; 
//		// 3)  입력 메시지 출력 
//		System.out.println("금액 입력 : ");
//		// 4) 금액입력 = 금액 입력 nextInt()
//		money = sc.nextInt();
//		// 5) 노래곡수 = 금액 / 상수1
		
		//for문만 사용 
		//1. 100부터 1까지 출력(tab키로 띄어쓰기) 
		//1) for문 초기식 i = 1, 조건식 i <= 100, 증감식 i++ 
		//2) 중괄호 출력(i와 tab) 
//		for(int i = 1; i <= 100; i++) {
//			System.out.print(i + "\t");
//		}
//		
//		System.out.println();
//		//2. 구구단 3단만 출력 
//		//1) for문 초기식 i = 3, 조건식 i <= 100, 증감식 i+=3 
//		//2) 중괄호 출력(i와 tab) 
//		int dan = 3; 
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " x " + i + " = " + dan * i);
//		}
//		
//		System.out.println();
//		//3. A ~ F 출력 (초기식 char i = 'A')
//		//1) for문 초기식 char i = 'A', 조건식 i <= 'F'; i = i++
//		//2) 중괄호 출력(문자형 i와 tab) 
//		for(char i = 'A'; i <= 'F'; i = i++) {
//			System.out.println(i + "\t");
//		}
		
//		System.out.println();
//		//5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
//		//1)  문자형 변수 소문자, 대문자 선언 
//		//2) for문 초기식 int i = 0, 조건식 i < 26, 증감식 i+=2 
//		//3) 중괄호 출력(문자형으로 소문자+i, 대문자+i)
//		char lower = 'a', upper = 'B';
//		for (int i = 0; i < 26; i += 2) {
//			System.out.printf("%c%c", (char)(lower+i), (char)(upper+i));
//		}
		
		//
		
		//별찍기 (전체 칸 수가 정해져있을 경우) 
		//5번째 *출력
		//4, 5, 6 번째 *출력
		//3, 4, 5, 6, 7 번째 *출력
		//...
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 9; j++) {
//				int range = 9/2 +1;
//				if (j > range - i && j < range + i ) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();				
//		}

//		for (int i = 0; i < 3; i++) { // 바깥 for문 //행 
//			System.out.print(i);
//			for (int j = 0; j < 3; j++) { // 안쪽 for문 //열
////				System.out.println("i : " + i + ", j : " + j);
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		1. 바깥 for문 시작 
//		1-1 초기식 i를 1로 초기화
//			조건식 i < 3 조건을 검사 => 1 < 3 true이면 바같 for문 중괄호 영역안으로 들어간다 
//		2. 안쪽 for문 시작 
//		2-1. 초기식 j를 1로 초기화 
//			조건식 j < 3 조건을 검사 => 1 < 3 true이면 안쪽 for문 중괄호 영역안으로 들어간다 
//		2-2. 출력메소드 System.out.println("i : " + i + ", j : " + j); 
//			출력결과	=> i : 1, j : 1 
//		3. 안쪽 for 계속 진행 
//		3-1. 증감식으로 이동 j가 1증가(j++)	현재 j의 값 : 2 
//		3-2. 조건식 	j < 3 조건 검사 => 2 < 3 true이면 안쪽 for문 중괄호 영역안으로 들어간다 
//		3-3. 출력메소드 System.out.println("i : " + i + ", j : " + j);
//			출력결과 => i  1, j : 2
//		4. 안쪽 for문 계속 진행 
//		4-1. 증감식으로 이동 j가 1 증가(j++) 현재 j의 값 : 3 
//		4-2. 조건식	j < 3 조건 검사 => 3 < 3 false 이면 안쪽 for 중괄호 영역 밖으로 이동 
//		4-3. 안쪽 for문 중롹호 밖, 바깥쪽 for문 중괄호 안의 내용이 있다면 해당 내용을 실행한다 
//		5. 바같쪽 for문 계속 진행 
//		5-1. 증감식이동 	i가 증가(i++)		현재 i값 : 2 
//		5-2. 조건식	i < 3조건 검사 => 2 < 3 바깥쪽 for문 중괄호 영역안으로 들어간다 
//		6. 안쪽 for문 시작 
//		2~5계속 반복 
//		+) 바같쪽 for문의 증감식으로 이동 후 조건식을 확인 시 false가 나오면 바깥 for문의 중괄호 영역 밖으로 이동한다 
		
//		System.out.println();
//		
//		for (int i = 0; i < 4; i++) { // 바깥 for문 //행 
//			System.out.println(i);
//			for (int j = 1; j < 5; j++) { // 안쪽 for문 //열
//				System.out.print("i : " + i + ", j : " + j);
//				System.out.print(i + j);
//			}
//			System.out.println(); // 바깥 for문 위치 
//		}
		
		//2행 3열 출력하기 
		
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= i; j++) {
////				System.out.print("i = " + i + ", j = " + j + " ");
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//사용자로부터 행과 열을 입력하여 출력하기 
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("행과 열을 입력하세요 : ");
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		for(int i = 1; i <= row; i++) {
//			for(int j = 1; j <= col; j++) {
////				System.out.print("i: " + i + ", j: " +_j + " ");
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
}
