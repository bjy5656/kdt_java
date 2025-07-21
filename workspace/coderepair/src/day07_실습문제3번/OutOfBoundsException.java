package day07_실습문제3번;
//입력된 나이가 음수일 때 예외 작성 
public class OutOfBoundsException extends RuntimeException{

	public OutOfBoundsException() {
		super("0 이하의 값이 입력되었습니다");
	}

	
}
