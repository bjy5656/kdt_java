package 보충과제_백정이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q7 {
//	Q7. 등록된 Person 객체들을 점수별로 그룹화하여 Map<Integer, List<Person>> 구조로 구성하고
//	점수는 외부에서 입력받되, 숫자가 아닐 경우 예외를 발생시켜 처리한다.
//	단, 출력은 점수 기준 오름차순 정렬로 할 것
	
public static void main(String[] args) {
		
		//입력클래스 import 
		//Map<Integer, List<Person>> 객체 people 생성 
		//입력 변수 선언(이름, 나이, 점수, 입력문자) 
		//while(true) 
		//	입력메시지 출력, 입력 변수에 대입 반복 (예외 처리)
		//	if 점수가 이미 있으면 실행 
		//		점수에 해당하는 List<Person>에 Person 객체 생성하여 추가
		//	else 
		//		점수를 키로, 새 List<Person>을 값으로 추가
		//		점수에 해당하는 List<Person>에 Person 객체 생성하여 추가 
		//	입력메시지 출력(반복 여부 확인)
		//	y/Y가 아니면 탈출 
		//점수 개수 크기를 갖는 int[] 배열 생성
		//Iterator<Integer> 객체 생성, people의 점수를 대입 
		//int형 변수 선언(인덱스 i)
		//while 점수 개수만큼 반복
		//	배열[i] = 점수
		//배열을 오름차순으로 정렬 
		//for 배열 크기만큼 반복 
		//	출력(반복문 변수에 해당하는 List<Person>)
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, List<Person>> people = new HashMap<>();
		String name = "";
		int age = 0;
		int score = 0;
		String answer = "";
		while(true) {
			try {
				System.out.println("이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.println("나이를 입력하세요 : ");
				age = sc.nextInt();
				System.out.println("점수를 입력하세요 : ");
				score = sc.nextInt();
				sc.nextLine();
				checkValid(name, age, score);
			} catch (InvalidPersonException | InputMismatchException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			if(people.containsKey(score)) {
				people.get(score).add(new Person(name, age, score));
			}else {
				people.put(score, new ArrayList<>());
				people.get(score).add(new Person(name, age, score));
			}
			System.out.println("반복하시겠습니까? y/Y : 반복, 다른 입력 : 반복하지 않음");
			answer = sc.nextLine();
			if(!(answer.equals("y") || answer.equals("Y"))){
				break;
			}
		}
		System.out.println("종료되었습니다");
		int[] ar = new int[people.size()];
		Iterator<Integer> iter = people.keySet().iterator();
		int i = 0;
		while(iter.hasNext()) {
			ar[i] = iter.next();
			i++;
		}
		Arrays.sort(ar);
		for(int score2 : ar) {
			System.out.println(score2 + "점 : ");
			System.out.println(people.get(score2));
		}
	}
	public static void checkValid(String name, int age, int score) throws InvalidPersonException{
		if(name == null || name.trim().length() == 0) {
			throw new InvalidPersonException("이름이 한글자 이상 입력되지 않았습니다!");
		}
		if(age <= 0) {
			throw new InvalidPersonException("나이가 0살 이하로 입력되었습니다!");
		}
		if(score < 0 || score > 100) {
			throw new InvalidPersonException("점수가 범위를 벗어났습니다!");
		}
	}
}
