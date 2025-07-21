package 보충과제_백정이;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q3 {
//	Q3. 이름을 key, 점수를 value로 갖는 Map<String, Integer>를 만들고, 점수가 60점 미만인 학생만 필터링하여 출력하는 코드를 작성하기
	public static void main(String[] args) {
		
		//Map<String, Integer> 객체 students 생성 
		//이름과 점수 대입 
		//Iterator 객체 생성, students의 이름 대입 
		//요소마다 반복 
		//	if 점수가 60 미만이면 이름 출력
		
		Map<String, Integer> students = new HashMap<>(); 
		students.put("민수", 90);
		students.put("은수", 50);
		students.put("철수", 70);
		students.put("지수", 50);
		Iterator<String> iter = students.keySet().iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if(students.get(name) < 60) {
				System.out.println(name);
			}
		}
	}	
}
