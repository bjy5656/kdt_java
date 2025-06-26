package review;

import java.util.Arrays;
import java.util.Iterator;

public class Review {
	public static void main(String[] args) {
////		//1부터 5까지의 값을 담은 배열 선언 
////		int[] ar1 = new int[5];
////		
////		//값을 대입하는 반복문 
////		for (int i = 0; i < ar1.length; i++) {
////			ar1[i] = i + 1; 
////		}
////		
////		//값을 출력하는 반복문 
////		for (int i = 0; i < ar1.length; i++) {
////			System.out.println(ar1[i]);
////		}
////		
////		//for~each문 
////		int sum = 0; 
////		for (int num : ar1) {
////			sum += num;
////			System.out.println(sum);
////		}
//		
////		int[] scores = {100, 88, 99};
////		//1) 총합구할 변수 선언 
////		//2) 총합 구하기(for~each문) 
////		//3) 평균 구하기 
////		//4) 출력 
////		
////		int sum = 0; 
////		for(int score : scores) {
////			sum += score;	
////		}
////		
////		double avg = sum / (double)scores.length;
////		
////		System.out.println("총합 : " + sum);
////		System.out.printf("평균 : %.2f", (double)avg);
//		
////		// 1차원 배열 
////		int[] number = { 5, 2, 6, 3, 1, 8 };
////		
////		//2차원 배열 
////		int[][] number2 = {{5,2,6}, {3,1,8}};
////		
////		System.out.println(number);
////		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number));
////		System.out.println(number2);
////		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number2));
////		System.out.println("2차원 배열 값 출력 : " + Arrays.deepToString(number2));
////		
////		System.out.println("\n정렬 전 number : " + Arrays.toString(number));
////		Arrays.sort(number);
////		System.out.println("정렬 후 number : " + Arrays.toString(number));
////		System.out.println("정렬 전 number2 : " + Arrays.deepToString(number2));
////		
//////		Arrays.sort(number2); 2차원배열은 정렬되지 않고 오류 발생함 
//////		2차원 배열의 내부 요소 정렬은 for문이나 수동정렬이 필요하다!!
////		for (int i = 0; i < number2.length; i++) {
////			Arrays.sort(number2[i]);
////		}
////		for (int[] row : number2) {
////			Arrays.sort(row);	
////		}
////		
////		System.out.println("정렬 후 number2 : " + Arrays.deepToString(number2)); 
//		
////		int[] number = {5, 2, 9, 1, 6};
////		
////		System.out.println("초기 배열 : " + Arrays.toString(number));
////		
////		for(int i = 0; i < number.length; i++) {
////			boolean swap = false; //교환 발생여부 
////			for (int j = 0; j < number.length - 1 - i; j++) {
////				if(number[j] > number[j+1]) {
////					// 두 요소 교환 (swap) 
////					int temp = number[j];
////					number[j] = number[j+1];
////					number[j+1] = temp; 
////					swap = true;
////				}
////			}
////			System.out.println((i+1) + "단계 : " + Arrays.toString(number));
////			// i = 0 => j = 0 < 4 true 
////			if(!swap) {
////				break; 
////			}
////		}
////		System.out.println("정렬완료 : " + Arrays.toString(number));
//		
////		int[] number = { 5, 2, 9, 1, 6 };
////		System.out.println("초기배열 : ");
////		
////		for(int num : number) {
////			System.out.println(num + " ");
////		}
////		System.out.println();
////		
////		for(int i = 1; i < number.length; i++) {
////			int key = number[i];
////			int j = i - 1; 
////			
////			//key보다 큰 값을 오른쪽으로 이동 
////			while( j >= 0 && number[j] > key) {
////				number[j+1] = number[j];
////				j--;
////			}
////			
////			number[j+1] = key; 
////			System.out.println(i+ "단계 : " + Arrays.toString(number));
////			
////		}
////		System.out.println("정렬번호 : " + Arrays.toString(number));
//		
////		int[] number = { 5, 2, 9, 1, 6 };
////		
////		System.out.println("초기 배열 : " + Arrays.toString(number));
////		
////		for(int i = 0; i < number.length - 1; i++) {
////			//최소값 저장할 변수 
////			int minIdx = 1; 
////			
////			//최소값 찾기 위한 for문 
////			for(int j = i + 1; j < number.length; j++) {
////				if(number[j] < number[minIdx]) {
////					minIdx = j; 
////				}
////			}
////			
////			//최소값과 현재 요소 교환 
////			int temp = number[minIdx];
////			number[minIdx] = number[i];
////			number[i] = temp; 
////			
////			System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
////			
////		}
////		System.out.println("정렬번호 : "+Arrays.toString(number));
//		
//		//2차원 배열 선언
////		int[][] ar1 = new int [3][2];
////		
////		System.out.println(ar1);
////		//[[I@6e2c634b : 2차원 배열 전체의 참조값(JVM에 의해 제공) 
////		
////		System.out.println(ar1[0]);
////		//[I@37a71e93 : 0행의 참조값 (1차원배열) 
////		//[0, 0]
////		
////		System.out.println(ar1[0][0]);
////		//0		1차원 배열의 첫번째 값(초기화된 기본값) 
////		
////		//2차원 배열 선언 
////		int[][] ar2 = {{10, 20, 30}, {40, 50, 60}};
////		System.out.println(ar2);
////		System.out.println(ar2[0]);
////		System.out.println(ar2[0][0]);
////		System.out.println(ar2[0][1]);
////		System.out.println(ar2[0][2]);
////		System.out.println(ar2[1][0]);
////		System.out.println(ar2[1][1]);
////		System.out.println(ar2[1][2]);
////		
////		System.out.println("2차원 배열(행) : " + ar2.length); //행의 길이 
////		System.out.println("2차원 배열(열) : " + ar2[0].length); //열의 길이 
////		
////		for(int i = 0; i < ar2.length; i++) {
////			System.out.println("ar2.length의 값(ar2의 행의 길이) : "  + ar2.length);
////			System.out.println("ar의 각 행 : " + i + "의 주소값 : "  + ar2[i]);
////			for(int j = 0; j < ar2[j].length; j++) { //열 반복 
////				System.out.println(i + "행 : " + ar2[i] + ", " + j + "열 : " + ar2[i][j]);
////			}
////		}
//		
////		int[][] ar1 = { {1, 2}, {3, 4}, {5, 6}, {7, 8}};
//		
////		System.out.println(ar1.length);	//행의 길이 
////		System.out.println(ar1[0]); //2차원 배열의 1행의 시작주소값
////		System.out.println(ar1[1]); //2차원 배열의 2행의 시작주소값
////		System.out.println(ar1[2]); //2차원 배열의 3행의 시작주소값
////		System.out.println(ar1[3]); //2차원 배열의 4행의 시작주소값
//////		System.out.println(ar1[4]); //2차원 배열의 5행의 시작주소값
////		
////		System.out.println(ar1[0][0]); //1 
////		System.out.println(ar1[0][1]); //2 
////		System.out.println(ar1[1][0]); //3 
////		System.out.println(ar1[1][1]); //4 
////		System.out.println(ar1[2][0]); //5 
////		System.out.println(ar1[2][1]); //6 
////		System.out.println(ar1[3][0]); //7 
//		
////		for (int i = 0; i < ar1.length; i++) {
////			//i는 행의 인덱스번호
////			System.out.println(i);
////			System.out.println(ar1[i]);
////			for (int j = 0; j < ar1[i].length; j++) {
////				System.out.println(ar1[i][j]);
////			}
////		}
////		
////		int[][] ar2 = {{1,2,3}, {4,5}, {6,7,8}};
////		
////		for (int i = 0; i < ar2.length; i++) {
////			for (int j = 0; j < ar2[i].length; j++) {
////				System.out.println(ar2[i][j]);
////			}
////			System.out.println();
////		}
////		
////		for (int[] data : ar2) {
////			for (int value : data) {
////				System.out.println(value);
////			}
////			System.out.println();
////		}
//		
//		//1 2 3 4
//		//5 6 7 8
//		//9 10 11 12
//		
//		//배열명 ar1 값 넣고 출력하기 
//		int[][] ar1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
//		
//		//행의 길이 : ar1.length
//		//열의 길이 : ar1[i].length 
//		
//		for (int i = 0; i < ar1.length; i++) {
//			for (int j = 0; j < ar1.length; j++) {
//				System.out.println(ar1[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		//2. 배열명 ar2 칸수만 선언 후 값 대입 후 출력 
//		int[][] ar2 = new int[3][4];
//		//ar2 크기만 지정된 2차원 배열 3개의 행과 4개의 열 
//		//이중 for문을 이용하여 1부터 갑 대입
//		
//		int value = 1; 
//		
//		for (int i = 0; i < ar2.length; i++) {
//			for (int j = 0; j < ar2.length; j++) {
//				System.out.println("i: " + i + ", j : " + j);
//				System.out.println(ar2[i][j]);
//				ar2[i][j] = value++;
//				System.out.println(ar2[i][j] + "\t");
//			}
//		}
//		
//		//메소드 호출 
		
		System.out.println("asbd".length());
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println('A'-'a');
		
		System.out.println(98 > 'A');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
