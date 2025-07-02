package section05;
//응용문제 3번
public class Practice03 {
	//1부터 100까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을 사용해 작성해 보세요
	public static void main(String[] args) {
		
		//로직구성
		//총합구할변수 선언, 기본값 0 대입 
		//for문 => 초기식 int i = 0; 조건식 i <= 100; 증감식 i+=2
		//	총합구할변수 에 총합구할변수 + i 대입 
		//for문 종료 
		//출력(총합구할변수) 
		
		int sum = 0; 
		for(int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
	}
	
}
