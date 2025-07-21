package 멘토씨리즈Java06_응용문제3번;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import day07_실습문제3번.OutOfBoundsException;

public class TenCard {
	public static void main(String[] args) {
//		3. 철수는 동생과 카드 게임을 했습니다. 카드 게임에 사용된 카드는 중복되는 숫자 없이 총 
//		10장입니다. 배열과 랜덤 함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요. 
//		카드에 적힌 숫자는 1부터 100이며, 카드는 섞여있으므로 순서는 상관없습니다.
		
		//입력클래스 import 
		//int형 변수 선언(범위, 뽑을카드개수) 
		//while문 => 범위가 양수가 아니면 반복 
		//	입력메시지 출력
		//	try
		//		범위 = nextInt()
		//		if 범위 <= 0 => 예외 강제발생 
		//	catch InputMismatchException 
		//		printStackTrace
		//	catch OutOfBoundsException 
		//		printStackTrace
		//	catch RuntimeException
		//		printStackTrace
		//	try
		//	nextLine()
		//while문 => 뽑을카드개수가 양수가 아니면 반복
		//	입력메시지 출력
		//	try
		//		뽑을카드개수 = nextInt()
		//		if 뽑을카드개수 <= 0 => 예외 강제발생 
		//	catch InputMismatchException 
		//		printStackTrace
		//	catch OutOfBoundsException 
		//		printStackTrace
		//	catch RuntimeException
		//		printStackTrace
		//	nextLine()
		//printTenNum 메소드 호출, 범위, 뽑을카드수 대입
		Scanner sc = new Scanner(System.in);
		int range = 0, number = 0; 
		System.out.println("범위와 뽑을카드수를 입력하면 중복 없이 숫자를 뽑겠습니다");
		while(!(range > 0)) {
			System.out.println("범위 입력 : ");
			try {
				range = sc.nextInt();
				if(range <= 0) {
					throw new OutOfBoundsException();
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} catch (OutOfBoundsException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			sc.nextLine();
		}
		while(!(number > 0)) {
			System.out.println("뽑을 카드 개수 입력 : ");
			try {
				number = sc.nextInt();
				if(number <= 0) {
					throw new OutOfBoundsException();
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} catch (OutOfBoundsException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			sc.nextLine();
		}
		TenCard.printTenNum(range, number);
	}
	
	//범위와 뽑을 개수를 입력하면 카드를 출력하는 메소드 
	//리턴타입 => void 
	//메소드명 => printTenNum
	//매개변수 => int 범위, int 뽑을 카드수
	//HashSet<Integer> 객체 생성(뽑은카드)
	//Random 객체 생성 
	//while(뽑은카드개수 < 뽑을카드개수)
	//	뽑은카드에 랜덤객체.nextInt(범위)+1 추가 
	//문자열 변수 str에 뽑은카드.toString() 저장 
	//출력(뽑은 카드는 str([]제거)입니다)
	static void printTenNum(int range, int number) {
		HashSet<Integer> cards = new HashSet<>();
		Random r = new Random();
		while(cards.size() < number) {
			cards.add(r.nextInt(range)+1);
		}
		String str = cards.toString();
		System.out.println("뽑은 카드는 " + str.substring(1, str.length()-1) + "입니다");
	}
}
