package homework07;

import java.util.Scanner;

//과제 1~5번 문제 
public class Review01 {
	public static void main(String[] args) {
		
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		
		//로직구성
		//입력클래스 import 
		//정수형 변수 선언 
		//입력메시지 출력 
		//변수에 입력메소드로 정수 입력받고 대입 
		//출력(삼항연산자 정수 % 2 == 0 참이면 짝수, 거짓이면 홀수) 
		//sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0; 
//		System.out.println("정수 하나를 입력하세요 : ");
//		num = sc.nextInt();
//		System.out.println("입력하신 수는 " + (num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
//		sc.close();
		
		
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		
		//로직구성 
		//입력클래스 import 
		//정수형 변수 선언 
		//입력메시지 출력 
		//변수에 입력메소드로 정수 입력받고 대입 
		//if문 변수 > 0 참이면 출력(양수)
		//else if문 변수 == 0 참이면 출력(0)
		//else 출력(음수) 
		//sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0; 
//		System.out.println("정수 하나를 입력하세요 : ");
//		num = sc.nextInt();
//		if (num > 0) {
//			System.out.println("입력하신 수는 양수입니다");
//		} else if (num == 0) {
//			System.out.println("입력하신 수는 0입니다");
//		} else {
//			System.out.println("입력하신 수는 음수입니다");
//		}
//		sc.close();
		
		
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//		0 ~ 12   : 어린이입니다
//		13 ~ 19 : 청소년입니다
//		20 이상 : 성인입니다
//
//		나이입력 : 16
//		현재 나이는 16살이고 청소년입니다
		
		//로직구성
		//입력클래스 import 
		//정수형 변수 선언(나이), 문자열 변수 선언(답) 
		//do문 시작 { 입력메시지 출력 
		//나이에 입력메소드로 정수 입력받고 대입 
		//if문 나이>=0 && 나이<13 참이면 답 = 어린이입니다
		//else if문 나이>=13 && 나이<20 참이면 답 = 청소년입니다
		//else if문 나이>=20 참이면 성인입니다 
		//} while문 나이 < 0 참이면 반복 
		//출력(나이, 답) 
		//sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		int age = 0;
//		String result = "";
//		do {
//			System.out.println("나이입력 : ");
//			age = sc.nextInt();
//			if (age >= 0 && age < 13) {
//				result = "어린이";
//			}else if (age >= 13 && age < 20) {
//				result = "청소년";
//			}else if (age >= 20) {
//				result = "성인";
//			} 
//		} while (age < 0);
//		System.out.printf("현재 나이는 %d살이고 %s입니다", age, result);
//		sc.close();
		
		
//		4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
//		   단, 세 개의 정수는 모두 다른 숫자이어야한다(중복값 X)
//		   
//		   숫자 3개 입력 :  5 1 9
//		   정렬된 숫자 : 9 5 1
		
		//로직구성 
		//입력클래스 import 
		//정수형 변수 6개 선언(정수1, 정수2, 정수3, 큰수, 중간수, 작은수) 
		//while문 true일 때 반복  
		//	입력메시지 출력 
		//	입력메소드로 정수1, 정수2, 정수3 입력받고 대입 
		//	if문 정수1==정수2 || 정수1==정수3 || 정수2==정수3 참이면 실행
		//		출력(중복값을 입력하면 안 됩니다), continue
		//	break
		//if문 정수1 > 정수2 > 정수3 참이면 큰수:정수1, 중간수:정수2, 작은수:정수3
		//else if문 정수1 > 정수3 > 정수2 참이면 큰수:정수1, 중간수:정수3, 작은수:정수3
		//else if문 정수2 > 정수3 > 정수1 참이면 큰수:정수2, 중간수:정수3, 작은수:정수1
		//else if문 정수2 > 정수1 > 정수3 참이면 큰수:정수2, 중간수:정수1, 작은수:정수3
		//else if문 정수3 > 정수1 > 정수2 참이면 큰수:정수3, 중간수:정수1, 작은수:정수2
		//else문 큰수:정수3, 중간수:정수2, 작은수:정수1
		//출력(큰수, 중간수, 작은수)
		//sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0, big = 0, middle = 0, small = 0;
//		while(true) {
//			System.out.println("숫자 3개 입력 : ");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			num3 = sc.nextInt();
//			if (num1 == num2 || num1 == num3 || num2 == num3) {
//				System.out.println("중복값을 입력하면 안 됩니다");
//				continue;
//			}
//			break;
//		}
//		if (num1 > num2 && num2 > num3) {
//			big = num1; middle = num2; small = num3;
//		}else if (num1 > num3 && num3 > num2) {
//			big = num1; middle = num3; small = num2;
//		}else if (num2 > num3 && num3 > num1) {
//			big = num2; middle = num3; small = num1;
//		}else if (num2 > num1 && num1 > num3) {
//			big = num2; middle = num1; small = num3;
//		}else if (num3 > num1 && num1 > num2) {
//			big = num3; middle = num1; small = num2;
//		}else {
//			big = num3; middle = num2; small = num1;
//		}
//		System.out.printf("정렬된 숫자 : %d %d %d", big, middle, small);
//		sc.close();
		
		
//		5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		
		//로직구성 
		//입력클래스 import 
		//문자열 변수 선언 
		//while문 true일 때 반복 
		//	입력메시지 출력 
		//	문자열 변수에 입력메소드로 문자열 입력받고 대입 
		//	if문 문자열이 "X"와 다르면 실행(.equals() 메소드로 비교)
		//		while문 탈출	
		//	출력(문자열)
		//출력(종료메시지)
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		while(true) {
			System.out.println("문자열을 입력하세요 : ");
			answer = sc.nextLine();
			if(answer.equals("X")) {
				break;
			}
			System.out.println("입력하신 문자열 : " + answer);
		}
		System.out.println("종료되었습니다.");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
