package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2 
public class ScannerTask02 {
	public static void main(String[] args) {
		
		//1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용해서 출력형태만들기)
		//입력 : 자바는 
		//입력2 : 객체지향 
		//입력3 : 언어입니다
		//출력 
		// 자바는 
		// 객체지향 
		// 언어입니다 
		
//		//1-로직 
//		//1) 입력클래스 선언 
//		Scanner sc = new Scanner(System.in);
		
//		//2) 입력클래스 import 
//		// ctrl + shift + o 
		
//		//3) 문자열 변수 선언(s1, s2, s3)
//		String s1, s2, s3; 
		
//		//4) 메시지 출력과 next()함수 사용 후 변수에 대입을 반복(입력 :, 입력2 :, 입력3 :) 
//		System.out.println("입력 :");
//		s1 = sc.next();
//		System.out.println("입력2 :");
//		s2 = sc.next();
//		System.out.println("입력3 :");
//		s3 = sc.next();
		
//		//5) 결과 출력 반복(s1, s2, s3) 
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
//		//6) 입력클래스 해제 
//		sc.close();
		
		
		//2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
//		출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것 
		
		//이름입력 : 홍길동 
		//나이입력 : 20 
		//취미입력 : 여행 
		//[출력]
		//홍길동은 20살이고 취미는 여행입니다. 
		//홍길동은 2026년에 21살입니다. 
		
		//2-로직 
		//1) 입력클래스 선언
		Scanner sc = new Scanner(System.in);
		
		//2) 입력클래스 import 
		// ctrl + shift + o 
		
		//3) 문자열 변수 선언(name, age, hobby)
		String name, age, hobby;
		
		//4) 메시지 출력과 입력메소드 사용 후 변수에 대입 반복(name과 hobby는 nextLine()사용 후 대입, age는 next() 사용 후 대입, 메시지 출력시 printf 사용)
		System.out.printf("이름입력 : \n");
		name = sc.nextLine();
		System.out.printf("나이입력 : \n");
		age = sc.next();
		System.out.printf("취미입력 : \n");
		sc.nextLine(); //버퍼를 비워준다.(엔터 지우기) 사전에 비우지 않으면 다음 nextLine()이 소모하고 종료되어버린다. 
		hobby = sc.nextLine();
		
		//5) "000은 00살이고 취미는 00입니다." 출력 
		System.out.printf("%s은 %s살이고 취미는 %s입니다.\n", name, age, hobby);

		//6) 정수형 변수 year 선언 후 2026 대입
		int year = 2026;
		
		//7) 정수형 변수 age2 선언 후 문자열 변수 age를 int로 형변환한 후 1 더하고 대입 
		int age2 = Integer.parseInt(age) + 1;
		
		//8) "000은 2026년에 00살입니다." 출력  
		System.out.printf("%s는 %d년에 %d살입니다.", name, year, age2);
		
		//8) 입력클래스 해제 
		sc.close();
	}
}
