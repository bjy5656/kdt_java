package section06;

import java.util.Arrays;

//응용문제 4번
public class Practice04 {
	//마방진은 숫자가 배열되어 있으며, 가로의 합, 세로의 합, 대각선의 합이 모두 동일하게 설계되어 있습니다. 
	//2차원 배열을 이용해 마방진을 구현해 보세요. 
	//조건 : 배열은 5*5로 합니다. 
	//		시작 위치는 (0,2)입니다.
	//		마방진에 들어가는 숫자는 1부터 시작합니다.
	//		
	public static void main(String[] args) {
		
		//로직구성
		//정수형 2차원 배열 선언(마방진), 5*5칸 배열 생성
		//정수형 변수 3개 선언(행위치, 열위치, 대입할숫자), 각각 0, 2, 1 대입 
		//for문 => 초기식 int i = 1; 조건식 i <= 5; 증감식 i++
		//	for문 => 초기식 int j = 1; 조건식 j <= 4; 증감식 j++ 
		//		마방진[행위치][열위치]에 대입할숫자 대입
		//		삼항연산자 사용 => 행위치에 (행위치-1)가 음수이면 (행위치+4)를, 음수가 아니면 (행위치-1)를 대입
		//		삼항연산자 사용 => 열위치에 (열위치+1)가 4보다 크면 (열위치-4)를, 4 이하이면 (열위치+1)를 대입
		//		대입할숫자 1 증가
		//	for문 종료
		//	마방진[행위치][열위치]에 대입할숫자 대입 
		//	삼항연산자 사용 => 행위치에 (행위치+1)가 4보다 크면 (행위치-4)를, 4 이하이면 (행위치+1)를 대입
		//	대입할숫자 1 증가 
		//for문 종료 
		//for-each문 => int[] 행배열 : 2차원 배열
		//	for-each문 => int 반복문변수 : 행배열
		//		출력(반복문변수 + tab)
		//	for-each문 종료
		//	줄바꿈
		//for-each문 종료
		
		int[][] magicSquare = new int[5][5];
		int row = 0, column = 2, num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 4; j++) {
				magicSquare[row][column] = num;
				row = row - 1 < 0 ? row + 4 : row - 1;
				column = column + 1 > 4 ? column - 4 : column + 1;
				num++;
			}
			magicSquare[row][column] = num;
			row = row + 1 > 4 ? row - 4 : row + 1;
			num++;
		}
		for(int[] rowArray : magicSquare) {
			for(int number : rowArray) {
				System.out.print(number + "\t");
			}
			System.out.println();
		}

//		char c = 65535; 
//		short b = 65535;
//		System.out.println(c);
//		System.out.println();
//		char a = 0;
//		int b = 0;

		
	}
	

	
}
