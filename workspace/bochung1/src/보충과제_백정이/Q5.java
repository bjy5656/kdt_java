package 보충과제_백정이;

import java.util.HashSet;
import java.util.Set;

public class Q5 {
//	Q5. Person 클래스를 상속하는 Employee 클래스를 만들고,
//	equals()에서 instanceof를 이용하여 두 객체가 이름과 나이가 같으면 같은 객체로 판단할 것,
//	Set<Person>에 Employee와 Person 객체를 넣어 비교 테스트 확인하기
	
	//Set<Person> 객체 people 생성 
	//people에 Person 객체 생성하고 대입(영훈, 20)
	//출력(people)
	//people에 Person 객체 생성하고 대입(영훈, 20)
	//출력(people)
	//people에 Employee 객체 생성하고 대입(영훈, 20)
	//출력(people) 
	//people에서 Person 객체 삭제
	//출력(people)
	//people에 Person 객체 생성하고 대입(영훈, 20) 
	//출력(people)
	public static void main(String[] args) {
		Set<Person> people = new HashSet<>();
		Person p1 = new Person("영훈", 20);
		people.add(p1);
		System.out.println(people);
		people.add(new Person("영훈", 20));
		System.out.println(people);
		Employee e1 = new Employee("영훈", 20);
		System.out.println(p1.equals(e1));
		people.add(e1);
		System.out.println(people);
		people.remove(p1);
		System.out.println(people);
		Person p2 = new Person("영훈", 20);
		System.out.println(e1.equals(p2));
		people.add(p2);
		System.out.println(people);
		//Person equals Employee -> true
		//Employee equals Person -> false 
		//그러나 set에 추가할 때에는 타입이 다르면 다른 객체로 인식한다 
		
		
	}
}