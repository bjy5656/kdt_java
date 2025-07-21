package 보충과제_백정이;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Q2 {
//	Q2. ArrayList<String>에 요소 10개를 추가하고 전체 요소를 순서대로 출력하기
	public static void main(String[] args) {
		//ArrayList<String> 객체 생성 
		//Random 객체 생성 
		//for int i = 1; i <= 10; i++
		//	ArrayList에 난수+"" 대입
		//Iterator 객체 생성, ArrayList 대입 
		//전체 요소 순서대로 출력 
		
		ArrayList<String> list = new ArrayList<>(); 
		Random r = new Random(); 
		for(int i = 1; i <= 10; i++) {
			list.add(r.nextInt(100) + "");
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
