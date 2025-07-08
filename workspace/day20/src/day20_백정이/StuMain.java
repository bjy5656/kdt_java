package day20_백정이;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//메인클래스 작성
public class StuMain {
	public static void main(String[] args) {
		//입력클래스 import
		//ArrayList<학생> 객체 학생들 생성 
		//문자열 변수 2개 선언(이름, 과목)
		//int형 변수 2개 선언(나이, 점수)
		//int형 변수 선언(i : 인덱스)
		//try문
		//	while(true)
		//		입력메시지 출력(이름)
		//		이름 = 사용자입력이름
		//		입력메시지 출력(나이) 
		//		나이 = 사용자입력이름
		//		이름, 나이로 학생 객체 생성하고 학생들에 추가
		//		if문 => 학생수 > 7이면 실행
		//			OverSevenException 예외객체 생성
		//		while문 => 국어, 수학, 영어가 하나라도 없으면 반복
		//			입력메시지 출력(과목)
		//			과목 = 입력과목
		//			임력메시지 출력(점수)
		//			점수 = 입력점수 
		//			if문 => 점수가 0~100이 아니면 실행 
		//				학생들에서 i번 학생 빼기 
		//				OutBoundsException 예외객체 생성 
		//			i번 학생의 addScore()메소드 호출, 과목과 점수 대입
		//		i 1 증가 
		//catch문 (OverSevenException e)
		//  e.printStackTrace();
		//	출력(학생 입력을 그만 받겠습니다!)
		//Catch문 (OutBoundsException e) 
		//  e.printStackTrace();
		//Iterator 객체 생성
		//while문 => hasNext가 true일 때 실행 
		//	next()의 printAvg() 메소드 호출 
		//sc.close();
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		String name = "", subject = "";
		int age = 0, score = 0;
		int i = 0;
		try {
			while(true) {
				System.out.println("이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.println("나이를 입력하세요 : ");
				age = Integer.parseInt(sc.nextLine());
				students.add(new Student(name, age));
				if(students.size() > 7) {
					throw new OverSevenException();
				}
				while(!students.get(i).getMap().containsKey("국어") || !students.get(i).getMap().containsKey("수학") || !students.get(i).getMap().containsKey("영어")) {
					System.out.println("과목을 입력하세요 : ");
					subject = sc.nextLine();
					System.out.println("점수를 입력하세요 : ");
					score = Integer.parseInt(sc.nextLine());
					if(score < 0 || score > 100) {
						students.remove(i);
						throw new OutBoundsException();
					}
					students.get(i).addScore(subject, score);
				}
				i++;
			}
		}catch(OverSevenException e) {
			e.printStackTrace();
			System.out.println("학생 입력을 그만 받겠습니다!");
		}catch(OutBoundsException e) {
			e.printStackTrace();
			System.out.println("나머지 학생의 평균만 출력합니다.");
		}
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			iter.next().printAvg();
		}
		sc.close();
	}
	
	
}
