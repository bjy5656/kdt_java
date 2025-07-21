package 능력단위평가Java5번;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//(4)Main 클래스 작성 
public class Main {

	//확장된 코드 
	//Student 클래스 
	//학번 필드를 추가 
	//toString 메소드 오버라이딩 -> 학생의 성적 정보를 문자열로 반환 
	//equals 메소드 오버라이딩 -> 학생의 학번과 이름이 같으면 같은 객체인 것으로 판단 
	//hashCode 메소드 오버라이딩 -> 학생의 학번을 반환 
	
	//Main 클래스 
	//입력클래스 import 
	//학생을 저장할 HashMap 객체 생성
	//학생 정보 변수 선언
	//int형 변수 선언(입력번호)
	//while문(입력번호가 0이 아니면 반복)
	//메뉴 출력 -> 성적 정보를 등록할 것인지 조회할 것인지 선택하도록 함  
	//번호 입력받기
	//1. 학생 정보 등록 
	//	입력메시지 출력, 입력받고 변수에 대입
	//	학생 객체 생성
	//	if containsKey(학번)이 true라면 실행 
	//		if map 의 학번 자리에 학번은 같지만 이름이 다른 학생이 있다면(equals -> false) 갱신할 것인지 묻기 
	//			if 예 이면 학생 객체 등록
	//		else 
	//			학생 객체 등록 
	//	else
	//		학생 객체 등록 
	//2. 성적 정보 조회 
	//	학번 입력받기 
	//	학번으로 map의 학생에 접근하여 학생 정보 출력
	//0. 종료
	//	출력(종료되었습니다) 
	//while문 종료
	//sc.close()
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Student> students = new HashMap<>();
		String name = "";
		Major major = null;
		int studentNumber = 0, javaScore = 0, dbmsScore = 0, htmlScore = 0;
		int num = 3;
		while(num != 0) {
			System.out.println("성적 정보를 등록하시겠습니까? 조회하시겠습니까?\n"
					+ "1. 성적 정보 등록\n2. 성적 정보 조회\n0. 종료");
			num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1:
					System.out.println("학번 : ");
					studentNumber = sc.nextInt();
					sc.nextLine();
					System.out.println("이름 : ");
					name = sc.nextLine();
					System.out.println("전공(COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE) : ");
					major = Major.valueOf(sc.nextLine());
					System.out.println("Java 점수 : ");
					javaScore = sc.nextInt();
					sc.nextLine();
					System.out.println("DBMS 점수 : ");
					dbmsScore = sc.nextInt();
					sc.nextLine();
					System.out.println("HTML 점수 : ");
					htmlScore = sc.nextInt();
					sc.nextLine();
					Student student = new Student(studentNumber, name, major, javaScore, dbmsScore, htmlScore);
					if(students.containsKey(studentNumber)) {
						if(!students.get(studentNumber).equals(student)) {
							System.out.println("기존 이름과 다릅니다! 갱신하시겠습니까? (y/Y : 갱신, 다른 입력 : 취소)");
							String answer = sc.nextLine();
							if(answer.equals("y") || answer.equals("Y")) {
								students.put(studentNumber, student);
							}
						}else {
							students.put(studentNumber, student);
						}
					}else {
						students.put(studentNumber, student);
					}
					break;
				case 2:
					System.out.println("학번을 입력하세요 : ");
					studentNumber = sc.nextInt();
					System.out.println(students.get(studentNumber));
					break;
				case 0:
					System.out.println("종료되었습니다");
			}
		
		}
		sc.close();
		
	}
	
}
