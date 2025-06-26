package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		
//		3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		
		//로직구성
		//입력클래스 import
		//배열변수 선언, int형 3칸 배열 생성
		//정수형 변수 선언(합계), 기본값 0 대입 
		//입력메시지 출력(띄어쓰기로 구분하여 점수 3개 입력)  
		//for문 시작 => 배열의 저장공간에 정수 입력받아 저장하기 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++ 
		//	배열의 인덱스 i 공간에 nextInt()로 정수 3개 입력받고 정수 하나씩 대입 
		//for문 종료 
		//for문 시작 => 배열의 값 합계 구하기 
		//	초기식 i=0, 조건식 i<배열길이, 증감식 i++ 
		//	합계 변수에 합계 값과 배열 인덱스 i 값 더하고 대입 
		//for문 종료 
		//출력(double형 합계 / 배열길이) 
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		int sum = 0;
		System.out.println("점수 3개를 띄어쓰기로 구분하여 입력하세요 : ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for ( int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.printf("평균 점수는 : %f\n", (double)sum / ar.length);
		
		System.out.println((double)sum / ar.length);
		sc.close();

		
		
		
	}
}
