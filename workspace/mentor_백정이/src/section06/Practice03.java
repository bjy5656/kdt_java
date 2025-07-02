package section06;

import java.util.Arrays;
import java.util.Random;

//응용문제 3번
public class Practice03 {
	//철수는 동생과 카드 게임을 했습니다. 카드 게임에 사용된 카드는 중복되는 숫자 없이
	//총 10장입니다. 배열과 랜덤 함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요.
	//카드에 적힌 숫자는 1부터 10이며, 카드는 섞여있으므로 순서는 상관없습니다.
	
	//메소드 기능 => 1~100 중 중복 없이 10개의 숫자를 뽑아 출력하기 
	//리턴타입 => void
	//메소드명 => printTenNum
	//매개변수 => Random 객체
	//실행할문장 =>
	//정수형 배열 선언(사용할숫자), 10칸 배열 생성 
	//정수형 변수 선언(뽑은숫자, 뽑은숫자개수), 기본값 대입
	//boolean 변수 선언(중복여부), 기본값 대입 
	//while 뽑은숫자개수가 10장 미만일 때 반복
	//	뽑은숫자에 1~100 중 난수를 구하고 대입
	//	for 초기식 int i = 0; 조건식 i <= 뽑은숫자개수; 증감식 i ++
	//		if 사용할숫자[i]와 뽑은숫자가 같으면 실행
	//			중복여부를 true로 변경
	//			break;
	//	for문 종료
	//	if 중복여부가 true이면 실행
	//		중복여부를 false로 변경
	//		continue;
	//	사용할숫자[뽑은숫자개수]에 뽑은숫자 대입 
	//	뽑은숫자개수 1 증가 
	//while문 종료
	//사용할숫자 배열을 toString 메소드를 사용하여 출력 
	
	static void printTenNumCard(Random random) {
		int[] tenNum = new int[10];
		int num = 0, numCount = 0;
		boolean isSame = false;
		while(numCount < 10) {
			num = random.nextInt(100)+1;
			for(int i = 0; i <= numCount; i++) {
				if(tenNum[i] == num) {
					isSame = true;
					break;
				}
			}
			if(isSame) {
				isSame = false;
				continue;
			}
			tenNum[numCount] = num;
			numCount++;
		}
		System.out.println(Arrays.toString(tenNum));
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Practice03.printTenNumCard(random);
	}
}
