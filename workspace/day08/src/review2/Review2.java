package review2;

import java.util.Iterator;

public class Review2 {
	public static void main(String[] args) {
		
//		//이스케이프문자는 문자열 안에서 \를 이용해 작성한다 
//		// "\n" "\t" "\'" "\"" "\\" 를 표현한다 
//		
//		//줄바꿈 : \n 
//		System.out.println("안녕하세요. \n4일차 수업중입니다. \n");
//		System.out.println("지금은 \n이스케이프 문자 \n배우는 중입니다.");
//		
//		//탭 간격 : \t
//		System.out.println("이름 : 백정이, 나이 : 26살");
//		System.out.println("이름 : 백정이\t, 나이 : 26살");
//		System.out.println("자바는 정말 재미있다. 자바 2일차!");
//		System.out.println("자바는 정말 재미있다.\t\t 자바 2일차!");
//		
//		//문자열 안에서 작은따옴표, 큰따옴표 표현 : \', \"
//		System.out.println("오늘 날시는 \"흐림\" 입니다.");
//		System.out.println("오늘 날씨는 '비'가 압니다.");
//		
//		//역슬래쉬 : \\;
//		System.out.println("워크스페이스 경로는 D:\\web_0900_bjy입니다.");
		
		//복합사용 
//		System.out.println("문자열 안에서 다양한 제어문자를 표현할 수 있다."
//				+ "\n\"\\n\"를 쓰면 줄바꿈이다." + "\n\t\'\\t\'을 쓰면 탭키가 적용된다");
		
//		//println() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈한다 
//		System.out.println("\"println()\" 는 출력메소드이다. ");
//		System.out.println("\n자동으로 줄바꿈된다\n");
//		
//		//print() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바굼 되지 않는다 
//		System.out.print("\'print()\'도 출력메소드이다.");
//		System.out.print("자동으로 줄바꿈되지 않는다.");
//		
//		System.out.println("java 수업중입니다");
//		System.out.println("지금은 3시 11분입니다.");
		
//		String name = "백정이";
//		int age = 26;
//		System.out.println("제 이름은 백정이이고, 나이는 26살입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
//		System.out.printf("제 이름은 %s이고, 나이는 %d살입니다.", name, age);
		
//		//실수형 
//		System.out.printf("\n실수형 : %f\n", 3.123456);
//		//float 타입 => 소수점이하 6자리까지 정화하게 나옴, 7자리 이상이면 7번재 자리에서 반올림, %f를 섰으므로 float로 적용됨 
//		//double 타입 => 소수점이하 15자리까지 
//		System.out.printf("\n실수형 2자리까지 표현 : %.2f\n", 3.12345);
//		
//		//문자형 
//		System.out.printf("\n문자형 : %c", 'a');
//		
//		//문자열 
//		System.out.printf("\n문자열 : %s\n", "hello");
//		String data = "hello, java";
//		System.out.println(data);
//		System.out.printf("문자열 : %.5s", data);
//		
//		//논리형(형식지정자 x) 
//		System.out.printf("\n논리형 : %s", true);
//		System.out.printf("\n논리형 : %.1s", true);
		
		//기본 형식지정자 
//		System.out.printf("이름 : %s, 나이 : %d\n", "김영선", 20);
//		System.out.printf("%d.%.2f 날씨 : %s\n", 2025, 6.16, "흐림");
//		System.out.printf("%s %c", true"%10s\n, 'a');
		
//		//자리수를 지정한 출력 
//		System.out.println("===============");
//		
//		// %[왼쪽 - or 0][n][.m] 서식문자 
//		String subject = "java";
//		System.out.printf("%10s\n", subject); // 10자리 기준 오른쪽 정렬 
//		System.out.printf("%-10s\n", subject); // 10자리 기준 왼쪽 정렬 
//		System.out.printf("%10s %05d\n", subject, 500);
//		System.out.printf("%5s", "백정이");
		
//		//상품명과 가격정렬 
//		System.out.println("\n\n============메뉴============");
//		System.out.printf("%-5s\t\t%5d원", "꼬북칩", 2500);
//		System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 300);
//		System.out.printf("\n%-5s\t\t%5d", "껌", 800);
		
//		System.out.println("=============");
//		//기본 형식지정자 
//		
////		System.out.printf("이름 : %s, 나이 : %d\n", "백정이", 25);
////		System.out.printf("%d.%.2f 날씨 : %s\n", 2025, 6.16, "흐림");
////		System.out.printf("%s %c", true, 'a');
//		
//		int iVal = 100; 
//		long result1 = iVal;
//		System.out.println(iVal);
//		System.out.println(result1);
//		
////		long lval = 100;
//		
//		// int(4byte) -> float(4byte)
//		float result2 = iVal;
//		System.out.println(result2);
//		
//		// int(4byte) -> double(8byte)
//		double result3 = iVal;
//		System.out.println(result3);
//		
//		//double(8byte) -> long(8byte)
////		long result4 = (long)result3;
//		// result3은 100.0 실수 타입으로 정수형 변수에 담길 경우 손실이 발생하므로 자동형변환 불가 
//		
//		//float(4byte) -> double(8byte)
//		double result4 = result2; 
////		float result5 = result3;
//		// double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문 
//		// double 타입 : 소수점 이하 15자리까지, float 타입 : 소수점 이하 6자리까지 
		
		
		
//		// 2) 연산시 자동 형변환 
//		// 정수와 실수의 연산 
//		int iVal2 = 10; 
//		double dVal2 = 3.14; 
//		System.out.println(iVal2 + dVal2);
//		double result6 = iVal2 + dVal2; 
//		System.out.println(result6);
//		
//		// 3) 문자형에서 정수형으로 변환 
//		char letter = 'a';
//		int ascii = letter;
//		System.out.println(letter);
//		System.out.println(ascii);
		
		//문자형 변수 테스트(형변환, 값 대입) 
//		char[] ar = new char[5];
//		short num = 1;
//		char alpha = 'a';
//		double num2 = 1.55;
//		short alpha2;
//		alpha2 = alpha + 'a';
//		alpha2 = 655;
//		alpha = num; //대입 불가 
//		alpha += 1.1;
//		alpha += num2;
//		System.out.println(alpha);
//		
//		alpha += num;
//		ar[0] = 'a' + 1;
//		ar[0] = 'a' + 1;
//		ar[0] = 'a' + ()num; //대입 불가 
//		ar[0] = alpha++;
//		ar[0] += 1;
//		
//		int[] ar2 = new int[5];
//		ar2[0] = alpha + 1; //대입 가능 
//		
//		System.out.println("rm");
//		System.out.println("1");
//		System.out.println("1");
//		System.out.println("1");
		
		
//		System.out.println();
//		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
