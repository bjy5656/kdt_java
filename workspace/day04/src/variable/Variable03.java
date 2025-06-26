package variable;

public class Variable03 {
	public static void main(String[] args) {
		
		//1) 문자부터 시작한다 
//		int 1num = 10; 숫자부터 시작시 오류 발생 
		int num1 = 10;
		int nu1m = 10; 
//		int num1 = 100; //같은 영역 내에서 같은 이름의 변수 선언시 오류발생 
		
		//2) 특수문자를 쓸 수 없다(단, _와 $는 가능) 
//		int @#$%^& = 100;
		int a$b_ = 100;
		int _ab$ = 100; //가능하지만 1) 문자부터 시작한다를 생각한다!!
		System.out.println(a$b_);
		System.out.println(_ab$);
		
		//3) 공백을 사용할 수 없다(카멜표기법, 스네이크표기법, 파스칼표기법 등을 활용한다)
//		String user; name = "백정이";
		String userName = "백정이";
		//첫단어 소문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성(카멜표기법, 변수명/메소드명 작성시)
		String user_name = "백정이";
		//첫단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결해서 작성(스네이크 표기법, 상수 작성시) 
		String UserName = "백정이"; 
		//첫단어 첫문자를 대문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성(파스칼표기법, 클래스명 작성시)  
		
		//4) 키워드(예약어) 사용할 수 없다 
//		int int = 10; 
//		int for = 10; 
//		int public = 10;
		
		//5) 되도록 소문자로 시작한다(대소문자를 구분) 
		int Abc = 100; 
		int abc = 100; 
		System.out.println(Abc);
		System.out.println(abc);
		
		// name, age, data, number, num1, ...
		
	}
}
