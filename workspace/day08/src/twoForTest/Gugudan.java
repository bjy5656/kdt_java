package twoForTest;

public class Gugudan {
	public static void main(String[] args) {
		
		
//		1) 단별로 세로로 출력하기
//		2단
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		2 x 9 = 18
//	
//		3단
//		3 x 1 = 3
//		3 x 2 = 6
//		...
//		3 x 9 = 27
//	
//		...
//	
//		9단
//		9 x 1 = 9
//		...
//		9 x 9 = 81
//	
//		2) 단별로 가로로 출력하기
//		2단      3단      4단      5단      6단      7단      8단      9단
//		2 x 1 = 2   3 x 1 = 3   4 x 1 = 4   5 x 1 = 5   6 x 1 = 6   7 x 1 = 7   8 x 1 = 8   9 x 1 = 9
//		2 x 2 = 4   3 x 2 = 6   4 x 2 = 8   5 x 2 = 10   6 x 2 = 12   7 x 2 = 14   8 x 2 = 16   9 x 2 = 18
//		...
//		2 x 9 = 18   3 x 9 = 27   4 x 9 = 36   5 x 9 = 45   6 x 9 = 54   7 x 9 = 63   8 x 9 = 72   9 x 9 = 81
		
//		//로직구성
//		바깥 for문 초기식, 조건식, 증감식 
//		안쪽 for문 초기식, 조건식, 증감식 
//		각 중괄호 영역 안에서의 출력문이 어떻게 될지 작성 
		
		//1번문제 로직구성
		//바깥 for문 시작 => 행(단 1씩 증가)
		//	초기식 i = 1, 조건식 i <= 9, 증감식 i++\
		//	출력(i단)
		//	안쪽 for문 시작 => 열(곱하는 숫자 증가)
		//		초기식 j = 1, 조건식 j <= 9, 증감식 j++ 
		//		출력(99단 식 : i x j = i*j, 줄바꿈)
		//	안쪽 for문 종료 
		//	출력(줄바꿈)
		//바깥 for문 종료 
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		
	
		//2번문제 로직구성 
		//for문 시작 => 몇 단인지 출력 
		//	초기식 i = 1, 조건식 i <= 9, i++ 
		//	출력(i단, tab)
		//for문 종료 
		//출력(줄바꿈)
		//바깥 for문 시작 => 행(곱하는 숫자 1씩 증가) 
		//	초기식 i = 1, 조건식 i <= 9, i++
		//	안쪽 for문 시작 => 열(단 1씩 증가) 
		//		초기식 j = 1, 조건식 j <= 9, 증감식 j++
		//		출력(99단 식 : j x i = i*j, tab)
		//	안쪽 for문 종료 
		//	출력(줄바꿈)
		//바깥 for문 종료 
		
//		for (int i = 1; i <= 9; i++) {
//			System.out.print(i + "단\t\t");
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(j + " X " + i + " = " + i*j +"\t");
//			}
//			System.out.println();
//		}
		
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
		
		
//		4) while문만 이용 구구단 출력(단별로 가로로 출력하기) 
		
		//4번문제 로직구성
		//정수형 변수 i와 j 선언, 1 대입 
		//while문 i <= 9 참이면 반복 
		//	출력(i단, tab, tab)
		//while문 종료 
		//출력(줄바꿈)
		//while문 i <= 9 참이면 반복 
		//	while문 j <= 9 참이면 반복 
		//		출력(99단 식 : j X i = i*j)
		//		j 1 증가 
		//	while문 종료 
		//	출력(줄바꿈)
		//	i 1 증가 
		//while문 종료 
		
		int i = 1;  
		while (i <= 9) {
			System.out.print(i+"단\t\t");
			i++;
		}
		i = 1;
		System.out.println();
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d x %d = %d\t", j, i, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
