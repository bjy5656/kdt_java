package fortest;
//5번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {
		//for문만 사용 
		//1. 100부터 1까지 출력(tab키로 띄어쓰기) 
		//1) for문 초기식 i = 1, 조건식 i <= 100, 증감식 i++ 
		//2) 중괄호 출력(i와 tab)
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		//2. 구구단 3단만 출력 
		//1) for문 초기식 i = 3, 조건식 i <= 100, 증감식 i+=3
		//2) 중괄호 출력(i와 tab) 
		int dan = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);	 
		}
		
		System.out.println();
		//3. A ~ F 출력(초기식 char i = 'A') 
		//1) for문 초기식 char i = 'A', 조건식 (int)i <= (int)'F', 증감식 i = (char)(i+1)  
		//2) 중괄호 출력(문자형 i와 tab)
//		for(char i = 'A'; i <= 'F'; i = i++) {
//			System.out.print(i + "\t");
//		}
		
		System.out.println();
		//4. A ~ F 출력(초기식 int i = 0)
		//1) for문 초기식 int i = 'A', 조건식 i <= (int)'F', 증감식 i++
		//2) 중괄호 출력(문자형 i와 tab) 
//		for(int i = 'A'; i <= (int)'F'; i++) {
//			System.out.print((char)i + "\t");
//		}	
		
		System.out.println();
		//5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		//1) 문자형 변수 소문자, 대문자 선언 
		//2) for문 초기식 int i = 0, 조건식 i < 26, 증감식 i+=2
		//3) 중괄호 출력(문자형으로 소문자+i, 대문자+i)
		char lower = 'a', upper = 'B';
		for (int i = 0; i < 26; i += 2) {
			System.out.printf("%c%c", (char)(lower+i), (char)(upper+i));
		}
		
		
		
	}
}
