package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {
		
//		2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		
		//로직구성
		//배열변수 선언, int형 10칸 배열 생성
		//for문 시작 => 배열에 값 대입 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	배열 인덱스 i 공간에 i+1 대입 
		//for문 종료 
		//정수형 변수 선언(합계), 기본값 0 대입 
		//for문 시작 => 총합 구하기 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	합계 변수에 합계 값과 배열 인덱스 i 값 더하고 대입 
		//for문 종료 
		//출력(합계) 
		
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}
		int sum = 0; 
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println("배열의 값의 총합 : " + sum);
	}
}
