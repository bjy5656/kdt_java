package day20_백정이;

import java.util.HashMap;
import java.util.Objects;
//학생클래스 작성
public class Student {
//	클래스명 : Student (toString 오버라이딩, equals 오버라이딩) 
//	필드 : private 접근제한자 
//	이름 
//	나이 
//	수학점수 
//	영어점수 
//	국어점수 
//
//	생성자 : 이름과 나이만 받는 생성자 
//	메소드 : 점수의 합을 구하고 반환하는 메소드(total) 
//		평균점수 구하는 메소드(printAvg) 
//		학생의 점수를 저장하여 반환하는 메소드(addScore)
	
	//필드(이름, 나이, 점수 3개 저장하는 HashMap)
	private String name; 
	private int age; 
	private HashMap<String, Integer> map = new HashMap<>();
	
	//매개변수 2개(이름, 나이) 생성자  
	Student(String name, int age){
		this.name = name; 
		this.age = age; 
	}
	
	//메소드
	//getter 메소드 => HashMap 객체 반환 
	public HashMap<String, Integer> getMap() {
		return map;
	}
	
	//점수의 합을 구하고 반환하는 메소드
	//리턴타입 => int
	//메소드명 => total
	//매개변수 => x
	//return addScore메소드 사용하여 구한 점수 3개의 합 
	int total() {
		return addScore("국어") + addScore("수학") + addScore("영어");
	}
	

	//평균점수 구하는 메소드
	//리턴타입 => void
	//메소드명 => printAvg
	//매개변수 => x
	//출력(학생)
	//출력( total() / 3.0 )
	void printAvg() {
		System.out.println(this);
		System.out.println("세 과목 점수의 평균은 " + total() / 3.0 + "입니다");
	}
	
	//학생의 점수를 저장하여 반환하는 메소드 
	//리턴타입 => void
	//메소드명 => addScore 
	//매개변수 => String 과목, int 점수
	//put(과목, 점수)
	public void addScore(String subject, int score) {
		map.put(subject, score);
	}
	//리턴타입 => int
	//메소드명 => addScore
	//매개변수 => String 과목
	//return get(과목)
	public int addScore(String subject) {
		return map.get(subject);
	}

	//toString 오버라이딩 => 객체의 이름 정보를 문자열로 반환
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	//equals 오버라이딩 => 이름을 기준으로 같은지 여부를 반환 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			String other = ((Student)obj).name;
			return this.name.equals(obj);
			
		}
			return false;
	}

	//hashCode 오버라이딩 => HashSet, HashMap, HashTable에서 완전한 비교를 위한 HashCode 재정의
	//						나이를 반환
	@Override
	public int hashCode() {
		return this.age;
	}
	
}
