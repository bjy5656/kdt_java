package homework08;

import java.util.Scanner;

public class ArrayTask08 {
	public static void main(String[] args) {
		
//		8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
		
		//로직구성 
		//입력클래스 import 
		//배열변수 선언, 정수형 5칸 배열 생성 
		//정수형 변수 2개 선언(최대값, 최소값), 기본값 0 대입 
		//입력메시지 출력(정수 5개 띄어쓰기로 구분하여 입력)
		//for문 => 정수 입력받기 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	배열 인덱스 i 공간에 nextInt()로 입력받은 정수 대입 
		//for문 종료 
		//바깥 for문 => 인덱스 i의 값과 배열의 모든 값을 비교하는 것을 반복(기준이 되는 인덱스 변경) 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	정수형 변수 2개 선언(이상인횟수, 이하인횟수), 기본값 0 대입 
		//	안쪽 for문 => 인덱스 i의 값과 배열의 나머지 값을 비교하는 것을 반복(배열의 모든 값과 차례대로 비교) 
		//		초기식 j=0, 조건식 j<배열길이, 증감식 j++
		//		if문 => 인덱스 i의 값이 인덱스 j의 값 이상이면 실행, 이상인횟수 1증가 
		//		if문 => 인덱스 i의 값이 인덱스 j의 값 이하이면 실행, 이하인횟수 1증가 
		//	안쪽 for문 종료 
		//	if문 => 	이상인횟수 == 5이면 실행, 최대값에 인덱스 i의 값 대입 
		//	if문 =>	이하인횟수 == 5이면 실행, 최소값에 인덱스 i의 값 대입 
		//바깥 for문 종료 
		//출력(최대값, 최소값) 
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		int max = 0, min = 0; 
		System.out.println("정수 5개를 띄어쓰기로 구분하여 입력하세요 : ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			int countLarger = 0, countSmaller = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] >= ar[j]) {
					countLarger++;
				}
				if (ar[i] <= ar[j]) {
					countSmaller++;
				}
			}
			if (countLarger == 5) {
				max = ar[i];
			}
			if (countSmaller == 5) {
				min = ar[i];
			}
		}
		System.out.println("최대값은 : " + max + ", 최소값은 : " + min + " 입니다.");
		sc.close();
	}	
}
