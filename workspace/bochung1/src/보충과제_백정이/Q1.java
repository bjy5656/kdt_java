package 보충과제_백정이;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Q1 {
//	Q1. 사번(String)을 키로, Person 객체를 값으로 저장
//	이미 존재하는 사번이면 DuplicateKeyException발생
//	이름이 null이거나 나이가 0살이하이면 InvalidPersonException 발생
//	예외 발생시 어떤 예외가 발생했는지 메시지 출력과 등록된 전체 목록 같이 출력
	public static void main(String[] args) {
		
		//입력클래스 import 
		//HashMap<String, Person> 객체 생성 
		//입력 변수 선언(사번, 이름, 나이) 
		//while문 (true) 
		//	try 
		//		입력메시지 출력, 사번 입력받고 대입 
		//		if map에 사번 key가 이미 있다면 DuplicateException(메시지) 발생, 
		//		입력메시지 출력, 이름 입력받고 대입 
		//		if 이름이 null이면 InvalidPersonException(메시지) 발생, 
		//		입력메시지 출력, 나이 입력받고 대입 
		//		if 나이가 0살 이하이면 InvalidPersonException(메시지) 발생, 
		//	catch InputMismatchException | DuplicateKeyExeption | InvalidPersonException
		//		printStackTrace
		//		Iterator 객체 생성, map의 value들을 저장 
		//		전체 목록 출력 
		//		break
		//	catch RuntimException
		//		printStackTrace
		//		Iterator 객체 생성, map의 value들을 저장 
		//		전체 목록 출력 
		//		break
		//	map에 사람 객체 저장 
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<>();
		String employeeNumber = "";
		String name = "";
		int age = 0;
		while(true) {
			try {
				System.out.println("사번을 입력하세요 : ");
				employeeNumber = sc.nextLine();
				if(map.containsKey(employeeNumber)) {
					throw new DuplicateException("같은 사번이 이미 존재합니다!");
				}
				System.out.println("이름을 입력하세요 : ");
				name = sc.nextLine();
				if(name == null || name.trim().length() == 0) {
					throw new InvalidPersonException("이름이 한글자 이상 입력되지 않았습니다!");
				}
				System.out.println("나이를 입력하세요 : ");
				age = sc.nextInt();
				sc.nextLine();
				if(age <= 0) {
					throw new InvalidPersonException("나이가 0살 이하로 입력되었습니다!");
				}
			}catch(InputMismatchException | DuplicateException | InvalidPersonException e) {
				e.printStackTrace();
				Iterator<Person> iter = map.values().iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				break;
			}catch(RuntimeException e){
				e.printStackTrace();
				Iterator<Person> iter = map.values().iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				break;
			}
			map.put(employeeNumber, new Person(name, age));
		}
		
		
	}
	
	
	
	
	
}
