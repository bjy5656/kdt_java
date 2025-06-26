package homework08;

public class ArrayTask01 {	
	public static void main(String[] args) {
		
//		1. 100~1까지의 값을 배열에 넣고 출력
		
		//로직구성 
		//배열변수 선언, int형 100칸 배열 생성
		//for문 시작 => 배열에 값 저장 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	배열 인덱스 i 공간에 i+1 대입 
		//for문 종료 
		//for문 시작 => 배열 값 출력 
		//	초기식 i=0, 조건식 i<배여길이, 증감식 i++
		//	출력(배열 인덱스 i 값, 공백) 
		//for문 종료 
		
		int[] ar = new int[100];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1; 
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}
