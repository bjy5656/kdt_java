package day08_배열복습문제8번;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMinMax {
	public static void main(String[] args) {
		
//	8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
	//입력클래스 import 
	//int형 배열 변수 선언, 5칸 배열 생성 
	//입력메시지 출력 
	//for문 => int i = 0; i < 5; i++
	//	정수 입력받고 배열[i]에 대입
	//	버퍼 비우기 
	//Arrays.sort() 메소드로 정렬 
	//출력(최소값 : 처음값, 최대값 : 마지막값) 
	//입력클래스 종료
	
	Scanner sc = new Scanner(System.in);
	System.out.println("5개의 정수를 입력하세요");
	int[] numAr = new int[5];
	for(int i = 0; i < 5; i++) {
		numAr[i] = sc.nextInt();
		sc.nextLine();
	}
	Arrays.sort(numAr);
	System.out.println("최소값 : " + numAr[0] + ", 최대값 : " + numAr[4]);
		
	}
}
