package section05;
//예제5-4번 별 역삼각형 모양으로 출력하기 
public class Ex05_04 {
	public static void main(String[] args) {
		
		//예제 5-4. 역삼각형 만들기 
		
		//로직구성 
		//정수형 변수 선언(높이)
		//for문 => 초기식 int i = 0; 조건식 i < 높이, 증감식 i++
		//	for문 => 초기식 int j = 0; 조건식 j < i, 증감식 j++ 	
		//		출력(공백)
		//	for문 => 초기식 int j = 0; 조건식 j < 2*높이-1 - 2*i, 증감식 j++
		//		출력(*)
		//	for문 => 초기식 int j = 0; 조건식 j < i, 증감식 j++ 	
		//		출력(공백)
		//	줄바꿈
		
		int level = 7; //높이 지정 
		for(int i = 0; i < level; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * level - 1 - 2 * i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
		
}
