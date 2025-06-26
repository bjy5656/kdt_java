package homework08;

public class ArrayTask05 {
	public static void main(String[] args) {
		
//		5. A ~ F까지를 배열에 값을 넣고 출력
		
		//로직구성
		//배열변수 선언, 문자형 6칸 배열 생성
		//문자형 변수 선언(배열에 대입할 문자), 'A' 대입 
		//for문 => 배열에 값 대입 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	배열 인덱스 i 공간에 (대입할 문자)++ 대입 
		//for문 종료 
		//for문 => 배열 값 출력 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	출력(배열의 인덱스 i 값)
		//for문 종료 
		
		char[] ar = new char[6];
		char ch = 'A';
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ch++;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("배열의 인덱스 %d의 값 : %c\n", i, ar[i]);
		}
	}
}
