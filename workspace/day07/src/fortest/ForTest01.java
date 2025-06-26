package fortest;
//4번 : for문 기호 
public class ForTest01 {
	public static void main(String[] args) {
		
//		//for(초기식; 조건식; 증감식) {}
//		 for(int i = 0; i < 10; i++) {
//			 //정수형 i가 0일 때부터 10보다 작을 때까지 i를 1씩 증가시키면서 반복 
//			 System.out.println(i + "번 행복하다");
////			 break; 
//		 }
//		
//		 for(int i = 1; i < 10; i++) {
//			 System.out.println(i);
//		 }
		
		//이름 10번 출력 
		//초기식 i = 0; 
		//조건식
		//증감식 
		//출력 => 1번 000 
		//		2번 000
		//		10번 000 
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "번 백정이 ");
		}
		
		
		//for문 사용 
		//for 초기식	=> int i = 10	int i = 0	int i = 1
		//	조건식	=> 1 > 0 		i < 10 		i <= 10	1 	< 11
		//	증감식	=> i--			i++ 		i++
		//	출력		i번째				10 - i번재 	11 - i번째 	
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + "번째\t");
			System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(10 - i + "번째");
		}
		//첫번째
		//초기식 i = 0	조건식 0 < 10 true	중괄호 10 - 0이므로 10번째 출력	증감식 i++
		//현재 i = 1로 증가 
		
		//두번째 반복문 
		//				조건식 1 < 10 true	중괄호 10 - 1이므로 9번째 출력	증감식 i++ 
		//현재 i = 2로 증가 
		
		//세번째 반복문 
		//				조건식 2 < 10 true	중괄호 10 - 2이므로 8번재 출력 	증감식 i++
		//현재 i = 3로 증가 
		
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			//총합 저장할 변수 
			result += i; 
		}
		System.out.println(result);
	}
}
