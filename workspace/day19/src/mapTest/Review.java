package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList(); 
		System.out.println(al.toString());
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al); // [1,2,3]
		System.out.println(al.get(1));
		
		HashMap<String, Integer> map = new HashMap<>(); 
		System.out.println(map.toString());
		map.put("a", 1);
		map.put("b", 10);
		map.put("c", 3);
		System.out.println(map); // {key=value}
		System.out.println(map.get("b")); // 인덱스를 몰라도 key값으로 해당 value를 출력할 수 있다
		map.put("a", 10);
		System.out.println(map);
		map.put("d", 10);
		System.out.println(map);
		
		// put(key, value) 추가 
		// get(key) 해당 key의 value값 반환 
		// size() 해당 요소의 길이 반환 
		// keySet()
		// values()
		
		System.out.println(map.keySet());  //반환타입 Set 인터페이스 
		Set set = map.keySet();
		System.out.println(map.values());  // 반환타입 Collection 인터페이스 
		Collection co = map.values();
		System.out.println(co); // [10, 10, 3, 10]
		
	}
}
