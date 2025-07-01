package ex05_백정이;

import java.util.Scanner;

//(4)Main 클래스 작성 
public class Main {

	//로직구성
	//입력클래스 import 
	//입력메시지 출력(학생수 입력)
	//정수형 변수 선언(학생수), nextInt()로 입력받고 초기화 
	//학생수 크기의 배열 Student 타입 배열 생성 
	//nextLine()으로 버퍼 비우기 
	//for문 사용 => 초기식 int i = 1; 조건식 i <= 학생수; 증감식 i++
	//문자열 변수 선언(이름), 기본값으로 초기화 
	//Major 변수 선언(전공), null로 초기화
	//정수형 변수 3개 선언(Java점수, DBMS점수, HTML점수), 기본값으로 초기화 
	//	출력(i번째 학생 정보 입력)
	//	입력메시지 출력(이름 입력)
	//	nextLine으로 입력받고 이름 변수에 대입 
	//	입력메시지 출력(전공 입력) 
	//	nextLine으로 입력받고 전공 변수에 대입 
	//	입력메시지 출력(Java 점수 입력)
	//	nextInt로 입력받고 Java점수 변수에 대입 
	//	입력메시지 출력(DBMS 점수 입력)
	//	nextInt로 입력받고 DBMS점수 변수에 대입 
	//	입력메시지 출력(HTML 점수 입력)
	//	nextInt로 입력받고 HTML점수 변수에 대입 
	//	nextLine()으로 버퍼 비우기 
	//	Student 클래스의 객체 생성 => 생성자 호출하고 이름, 전공, 3과목 점수 대입
	//for문 종료
	//sc.close();
	//줄바꿈
	//for문 사용 => 초기식 int i = 1; 조건식 i <= 학생수; 증감식 i++
	//	출력(성적 출력)
	//	출력(이름님의 전공은 전공입니다.)
	//	출력(총점 : 총점)
	//	출력(평균 : 평균)
	//for문 종료 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명의 학생을 입력하시겠습니까? ");
		int student = sc.nextInt();
		Student[] studentArray = new Student[student];
		sc.nextLine();
		for(int i = 0; i < student; i++) {
			String name = "";
			Major major = null;
			int javaScore = 0, dbmsScore = 0, htmlScore = 0;
			System.out.print("\n\n[" + i + "번째 학생 정보 입력");
			System.out.print("\n이름 : ");
			name = sc.nextLine();
			System.out.print("\n전공(COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE) : ");
			major = Major.valueOf(sc.nextLine());
			System.out.print("\nJava 점수 : ");
			javaScore = sc.nextInt();
			System.out.print("\nDBMS 점수 : ");
			dbmsScore = sc.nextInt();
			System.out.print("\nHTML 점수 : ");
			htmlScore = sc.nextInt();
			sc.nextLine();
			studentArray[i] = new Student(name, major, javaScore, dbmsScore, htmlScore);
		}
		System.out.println();
		for(int i = 0; i < student; i++) {
			System.out.println("");
			System.out.println(i + 1 + "번째 학생");
			System.out.println("이름 : " + studentArray[i].name);
			System.out.println("전공 : " + studentArray[i].major.getName());
			System.out.println("총점 : " + studentArray[i].getTotalScore());
			System.out.println("평균 : " + studentArray[i].getAverageScore());
		}
		
	}
	
}
