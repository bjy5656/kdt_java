package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
		
//		4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		
		//로직구성 
		//배열변수 선언, int형 8칸 배열 생성 
		//for문 => 배열에 값 대입 
		//	초기식 i=1, 조건식 i<배열길이, 증감식 i++ 
		//	배열 인덱스 i 공간에 i % 4 대입 
		//for문 종료 
		//for문 => 배열 값 출력 
		//	초기식 i=1, 조건식 i<배열길이, 증감식 i++ 
		//	출력(배열 인덱스 i 값, 공백) 
		//for문 종료 
		
		int[] ar = new int[8];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i % 4;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}
