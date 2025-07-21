package 보충과제_백정이;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
//	Q4. 나이가 0 이하일 경우 예외를 발생시키는 checkAge(int age) 메서드를 작성하고, throws와 try-catch를 사용하여 처리하는 코드를 완성하기
	public static void checkAge(int age) throws InvalidPersonException{
		if(age <= 0) {
			throw new InvalidPersonException("나이가 0 이하입니다!");
		}
	}
	public static void main(String[] args) {
		//입력클래스 import 
		//변수 선언(나이)
		//입력메시지 출력 
		//try
		//	나이 = 입력 나이 
		//	checkAge(나이) 
		//catch InvalidPersonException | InputMismatchException
		//	printStackTrace
		//catch RuntimeException 
		//	printStackTrace
		
		Scanner sc = new Scanner(System.in); 
		int age = 0;
		System.out.println("나이를 입력하세요 : ");
		try {
			age = sc.nextInt();
			sc.nextLine();
			checkAge(age);
		}catch(InvalidPersonException | InputMismatchException e) {
			e.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
}
