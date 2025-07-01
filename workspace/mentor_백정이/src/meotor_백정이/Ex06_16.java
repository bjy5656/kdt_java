package meotor_백정이;

import java.util.Scanner;

public class Ex06_16 {
	public static void main(String[] args) {

		//예제 6-16. 2차원 배열을 활용한 로또 
		//입력클래스 import 
		//정수형 2차원 배열 변수 선언(당첨번호), 당첨번호 리스트 대입 
		//정수형 2차원 배열 변수 선언(입력번호), 6칸 배열 생성 
		//입력메시지 출력(6개의 수를 띄어쓰기로 구분하여 입력하세요)
		//for~each문 => int 반복문변수 : 입력번호배열 
		//	반복문변수에 nextInt로 정수 입력받고 대입 
		//for~each문 종료 
		//nextLine으로 버퍼 지우기 
		//for~each문 => int[] 반복문변수 : 당첨번호배열 
		//	if 반복문변수와 입력번호배열을 각각 toString 메소드로 변환한 문자열이 같다면 실행
		//		출력(당첨되었습니다!!)
		//		break;
		//for~each문 종료
		//출력(당첨이 아닙니다 ..)
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		int[][] lotto = {{3, 5, 6, 3, 75, 34}, 
						{23, 67, 4, 6, 34, 2},
						{1, 15, 13, 55, 78, 10},
						{7, 4, 7, 8, 2, 10},
						{43, 34, 6, 6, 45, 33},
						{12, 32, 44, 5, 6, 12}};
		
		int[] input = new int[6];
		System.out.println("6개의 수를 띄어쓰기로 구분하여 입력하세요");
		for(int num : input) {
			num = sc.nextInt();
		}
		System.out.println(input.toString());
		sc.nextLine();
		boolean isWin = false;
		for(int[] lottoArr : lotto) {
			if(lottoArr.toString().equals(input.toString())) {
				System.out.println("당첨되었습니다!!");
				isWin = true;
				break;
			}
		}
		if (!isWin) {
			System.out.println("당첨이 아닙니다 ...");
		}
		sc.close(); 
		
	}
}
