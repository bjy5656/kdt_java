package 보충과제_백정이;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q6 {
//	Q6. 이름 중복 여부는 허용하되, 나이까지 같으면 중복으로 간주하는 정책으로 Person 객체를 HashMap<String, Set<Person>>에 저장하기
//	단, 예외 발생 없이 잘 동작하도록 설계할 것
	public static void main(String[] args) {
		System.out.println((int)'0');
		System.out.println((int)'9');
		
		//입력클래스 import 
		//HashMap<String, Set<Person>> 객체 people 생성 
		//입력 변수 선언(이름, 나이, 입력문자) 
		//while(true) 
		//	입력메시지 출력, 입력 변수에 대입 반복 (예외 처리)
		//	if 이름이 이미 있고 나이가 다르면 
		//		이름에 해당하는 Set<Person>에 Person 객체 생성하여 추가 
		//	else if 이름이 없으면
		//		Person 객체 생성하여 추가한 Set<Person> 객체 생성하여 people에 추가
		//	입력메시지 출력(반복 여부 확인)
		//	y/Y가 아니면 탈출 
		//people의 value 모두 출력 
		Scanner sc = new Scanner(System.in);
		HashMap<String, Set<Person>> people = new HashMap<>();
		String name = "";
		int age = 0;
		String answer = "";
		while(true) {
			try {
				System.out.println("이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.println("나이를 입력하세요 : ");
				age = sc.nextInt();
				sc.nextLine();
				checkValid(name, age);
			} catch (InvalidPersonException | InputMismatchException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			if(people.containsKey(name) && !people.get(name).contains(new Person(name, age))) {
				people.get(name).add(new Person(name, age));
			}else if(!people.containsKey(name)){
				people.put(name, new HashSet<>());
				people.get(name).add(new Person(name, age));
			}
			System.out.println("반복하시겠습니까? y/Y : 반복, 다른 입력 : 반복하지 않음");
			answer = sc.nextLine();
			if(!(answer.equals("y") || answer.equals("Y"))){
				break;
			}
		}
		System.out.println("종료되었습니다");
		Iterator<Set<Person>> iter = people.values().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void checkValid(String name, int age) throws InvalidPersonException{
		if(name == null || name.trim().length() == 0) {
			throw new InvalidPersonException("이름이 한글자 이상 입력되지 않았습니다!");
		}
		if(age <= 0) {
			throw new InvalidPersonException("나이가 0살 이하로 입력되었습니다!");
		}
	}
}
