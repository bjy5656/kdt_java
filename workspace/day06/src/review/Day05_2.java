package review;
//2번 : 과제 2번
import java.util.Scanner;

public class Day05_2 { //class 시작
	public static void main(String[] args) { //main 시작
		
	/*	2. 이름과 나이를 입력받아 내년 나이를 출력하기(nextInt() 사용금지)
		클래스명 : Day05_2

		[입출력예시]
		이름 : 홍길동
		나이 : 20
		홍길동님의 내년 나이는 21살입니다.
		만 나이는 19살입니다. */
		
		//1) 입력 클래스 import
		//2) 정수형 변수 1개 문자열 변수 1개 선언  
		//3) 입력 메시지  
		//4) 이름변수 = nextLine() 
		//5) 입력메시지 
		//6) 나이변수 = nextLine() 형변환
		//7) 출력 
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age; 
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println(name + "님의 내년 나이는 " + (age + 1) + "살 입니다.");
		System.out.println("만 나이는" + (age - 2) + "살 입니다."); 
		
		
	} //main 끝
} //class 끝 
