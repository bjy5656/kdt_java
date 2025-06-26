package homework08;

public class Gugudan04 {
	public static void main(String[] args) {
		
//		4) while문만 이용 구구단 출력(단별로 가로로 출력하기)
		
		//4번문제 로직구성
		//정수형 변수 i와 j 선언, 1 대입 
		//while문 i <= 9 참이면 반복 
		//	출력(i단, tab, tab)
		//while문 종료 
		//출력(줄바꿈)
		//while문 i <= 9 참이면 반복 
		//	while문 j <= 9 참이면 반복 
		//		출력(99단 식 : j X i = i*j)
		//		j 1 증가 
		//	while문 종료 
		//	출력(줄바꿈)
		//	i 1 증가 
		//while문 종료 
		
		int i = 1;  
		while (i <= 9) {
			System.out.print(i+"단\t\t");
			i++;
		}
		i = 1;
		System.out.println();
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d x %d = %d\t", j, i, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
