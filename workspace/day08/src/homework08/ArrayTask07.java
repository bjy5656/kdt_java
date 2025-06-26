package homework08;

public class ArrayTask07 {
	public static void main(String[] args) {
		
//		7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력
		
		//로직구성 
		//배열변수 선언, 문자형 26칸 배열 생성 
		//문자형 변수 2개 선언(대입할 문자1, 대입할 문자2), 각각 'a', 'B' 대입 
		//for문 => 배열에 값 대입 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i+=2
		//	배열 인덱스 i 공간에 문자1 대입 
		//	배열 인덱스 i+1 공간에 대입할 문자2 대입 
		//	문자1에 2 더하고 초기화 
		//	문자2에 2 더하고 초기화 
		//for문 종료 
		//for문 => 배열 값 출력 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++
		//	출력(배열의 인덱스 i 값) -> print()문으로 이어붙여서 출력
		//for문 종료 
		
		char[] ar = new char[26];
		char ch1 = 'a', ch2 = 'B';
		for (int i = 0; i < ar.length; i += 2) {
			ar[i] = ch1;
			ar[i + 1] = ch2;
			ch1 += 2;
			ch2 += 2;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
	}
}
