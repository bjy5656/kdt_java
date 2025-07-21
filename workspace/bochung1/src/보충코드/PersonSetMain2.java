package 보충코드;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PersonSetMain2 {
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		try {
//			registerPerson(null, 5, set);
//			registerPerson("신짱구", 0, set);
			registerPerson("신짱구", 5, set);
			registerPerson("신짱구", 5, set);
			
		} catch (InvalidDataException | DuplicateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//name => null , "" , " "  => true
	//name => " 홍길동 " => "홍길동"=>true
	//사용자 입력값 검증시에는 null과 공백을 함께 검사해야한다!!!
	public static void registerPerson(String name, int age, Set<Person> set) 
		throws InvalidDataException, DuplicateException
	{
		if(name == null || name.trim().isEmpty()) {
			throw new InvalidDataException("이름은 공백일 수 없습니다");
		}
		if(age <= 0) {
			throw new InvalidDataException("나이는 1살이상이어야합니다");
		}
		
		Person newPerson = new Person(name, age);
		
		if(set.contains(newPerson)) {
			throw new DuplicateException("이미 등록된 사용자입니다 : " + newPerson);
		}
		
		set.add(newPerson);
		System.out.println("등록 성공 : " + newPerson);
	}
}
