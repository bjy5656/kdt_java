package methodTest;

import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		
		MethodTask02 mt = new MethodTask02();
		
		System.out.println("=====1번=====");
		System.out.println(mt.checkNum(5));
		
		System.out.println("=====2번=====");
		System.out.println(mt.getSum(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
		
		System.out.println("=====3번=====");
		System.out.println(mt.reverseStr("method"));
		
		System.out.println("=====4번=====");
		System.out.println(mt.contains(new int[] {8, 9, 10, 11, 12}, 10));
		
		System.out.println("=====5번=====");
		mt.printGugudan(5);
		
		System.out.println("=====6번=====");
		System.out.println(mt.compareLength("apple", "apple"));
		
		System.out.println("=====7번=====");
		System.out.println(mt.loginTry("id", "pw"));
		System.out.println(mt.loginTry("sefs", "pwefw"));
		
		
	}

	// 1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
	// 메소드명 : checkNum

	//로직구성
	//1) 리턴타입 => void
	//2) 메소드명 => checkNum 
	//3) 매개변수 => int형 1개 
	//4) 실행할문장 => 
	//	 삼항연산자 사용 => 입력정수 % 2 == 0 ? 짝수입니다 반환 : 홀수입니다 반환 
	//5) 리턴타입 수정 => String 
	
	String checkNum(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
	// 메소드명 : getSum

	//로직구성 
	//1)리턴타입 => void
	//2)메소드명 => getSum
	//3)매개변수 => int[] 1개 
	//4)실행할문장 => 
	//if문 => 배열길이 == 10 일때 실행 
	//	정수형 변수 선언(총합)
	//	for~each문 사용 
	//		총합 += 반복문변수;
	//	총합+"" 반환 
	//else문 
	//	"배열길이가 10이 아닙니다" 반환 
	//5)리턴타입 => String 
	
	String getSum(int[] numAr) {
		if(numAr.length == 10) {
			int sum = 0;
			for (int num : numAr) {
				sum += num;
			}
			return sum + "";
		}else {
			return "배열 길이가 10이 아닙니다";
		}
	}
	
	
	
	// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	// 메소드명 : reverseStr
	// hello => olleh

	//로직구성 
	//1)리턴타입 => void
	//2)메소드명 => reverseStr
	//3)매개변수 => String 1개  
	//4)실행할문장 => 
	//결과값 문자열 변수 선언, 기본값 대입 
	//for문 => int i=문자열길이-1; i>=0; i--
	//	결과값 문자열 += 문자열.charAt(i);
	//for문 종료
	//결과값 문자열 반환
	//5)리턴타입 => String 
	
	String reverseStr(String str) {
		String result = "";
		for(int i = str.length() -1; i >= 0; i--) {
			result  += str.charAt(i);
		}
		return result;
	}
	
	
	// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
	// 메소드명 : contains
	// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//      syso(메소드명(배열명, 10)) => true

	//로직구성
	//1)리턴타입 => void
	//2)메소드명 => contains
	//3)매개변수 => int[] 정수배열, int 찾을값
	//4)실행할문장 =>
	//boolean형 결과값 변수 선언, false 대입 
	//for~each문 => 반복문변수 : 정수배열 
	//	if문 => 찾을값 == 반복문변수 
	//		결과값 = true
	//for~each문 종료
	//결과값 반환 
	//5)리턴타입 => boolean
	
	boolean contains(int[] numAr, int num) {
		boolean result = false;
		for(int num2 : numAr) {
			if(num == num2) {
				result = true;
			}
		}
		return result;
	}
	
	// 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
	// 메소드명 : printGugudan
	// 3 x 1 = 3
	// ...
	// 3 x 19 = _

	//로직구성
	//1)리턴타입 => void
	//2)메소드명 => printGugudan
	//3)매개변수 => int 단수 
	//4)실행할문장 => 
	//for문 int i=1; i<=19; i++
	//	출력(단수 x i = 단수*i)
	//for문 종료 
	//5)리턴타입 없음 
	
	void printGugudan(int dan) {
		for(int i = 1; i <= 19; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
	}
	
	// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	// 메소드명 : compareLength

	//로직구성
	//1)리턴타입 => void
	//2)메소드명 => compareLength
	//3)매개변수 => String 2개(문자열1, 문자열2)
	//4)실행할문장 => 
	//삼항연산자 사용 => 문자열1길이 == 문자열2길이 참이면 같음 반환, 거짓이면 다름 반환 
	//5)리턴타입 => String 
	
	String compareLength(String str1, String str2) {
		return str1.length() == str2.length() ? "같음" : "다름";
	}
	
	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	// loginTry

	//로직구성 
	//1)리턴타입 => void
	//2)메소드명 => loginTry
	//3)매개변수 => String 2개(아이디, 비밀번호)
	//4)실행할문장 => 
	//졍수형 변수 선언(시도횟수), 0 대입 
	//문자열 변수 2개 선언(맞는아이디, 맞는비밀번호)
	//입력클래스 선언
	//while문 => 아이디와 비밀번호를 맞는아이디, 맞는비밀번호와 비교하여 하나라도 다르면 실행 
	//	시도횟수 ++
	//	if문 => 시도횟수 == 3이면 잠금되었습니다 문자열 반환 
	//	다시 입력하세요 출력 
	//	아이디와 비밀번호에 nextLine()으로 입력받고 대입 
	//while문 종료 
	//로그인되었습니다 반환 
	//5)리턴타입 => String 
	
	String loginTry(String id, String pw) {
		int count = 0;
		String correctId = "id", correctPw = "pw";
		Scanner sc = new Scanner(System.in);
		while(!id.equals(correctId) || !pw.equals(correctPw)) {
			count++;
			if(count == 3) {
				return "잠금되었습니다";
			}
			System.out.println("다시 입력하세요");
			System.out.println("아이디 : ");
			id = sc.nextLine();
			System.out.println("비밀번호 : ");
			pw = sc.nextLine();
		}
		return "로그인되었습니다";
	}
	
	//7번 로직구성 2 
	//main메소드 구성 =>
	//입력클래스 import
	//문자열 변수 2개 선언(맞는 아이디, 맞는 비밀번호) 
	//입력메시지 출력 
	//
	//1)리턴타입 => void 
	//2)메소드명 => loginTry 
	//3)매개변수 => 
	
	
	
	
	
	
	
}
