package ex04_백정이;

public class Ex04 {

//	문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//
//	- for문 이용 (ForGugudan) 로직구성 필요없음
//	 
//	- while문 이용(WhileGugudan) 로직구성 필요없음
	 
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}

		int i = 1; 
		while(i <= 9) {
			int j = 2;
			while(j <= 9) {
				System.out.print(j + " x " + i + " = " + j * i + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
