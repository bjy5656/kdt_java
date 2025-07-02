package section05;

import java.util.Scanner;

//응용문제 5번
public class Practice05 {
	//다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성해 보세요.
	public static void main(String[] args) {
		
		//로직구성 
		//정수형 변수 선언(높이), 기본값 대입 
		//입력클래스 선언 
		//입력메시지 출력 
		//높이에 nextInt로 정수 입력받고 대입 
		//for문 => 초기식 int i = 1; 조건식 i <= 높이; 증감식 i++
		//	for문 => 초기식 int j = 1; 조건식 j <= 높이; 증감식 j++
		//	for문 => 초기식 int j = 1; 조건식 j <= i*2-1; 증감식 j++
		//		출력(삼항연산자 이용 => 홀수이면 *, 짝수이면 공백)
		//	줄바꿈
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int level = 0; 
		System.out.println("높이를 입력하세요");
		level = sc.nextInt();
		for(int i = 1; i <= level; i++) {
			
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print(j % 2 == 1?"*":" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
