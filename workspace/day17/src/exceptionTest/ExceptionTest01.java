package exceptionTest;
//10번 : Excetpion Basic
public class ExceptionTest01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
		int result = 10 / 0; 
		System.out.println(result);
//		java.lang.ArithmeticException
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		System.out.println("프로그램 끝");
	}
}
