package homework08;

public class Gugudan03 {
	public static void main(String[] args) {
		
//		3) 3단씩 출력하기 Gugudan03
		
		//3번문제 로직구성 
		//가장 바깥 for문 시작 => 3단씩 증가 
		//	초기식 i = 1, 조건식 i <= 9, 증감식 i+=3
		//	for문 시작 => 몇 단인지 출력 
		//		초기식 j = i, 조건식 j <= i+2, j++
		//		출력(j단, tab, tab)
		//	for문 종료 
		//	출력(줄바꿈)
		//	바깥 for문 시작 => 행(곱하는 숫자 1씩 증가) 
		//		초기식 j = 1, 조건식 j <= 9, j++
		//		안쪽 for문 시작 => 열(단 1씩 증가) 
		//			초기식 k = i, 조건식 k <= i+2, 증감식 k++
		//			출력(99단 식 : k x j = j*k, tab)
		//		안쪽 for문 종료 
		//		출력(줄바꿈)
		//	바깥 for문 종료
		//	출력(줄바꿈)
		//가장 바깥 for문 종료
		
		for (int i = 1; i <= 9; i += 3) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(j + "단\t\t");
			}
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k <= i + 2; k++) {
					System.out.print(k + " X " + j + " = " + j*k +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
