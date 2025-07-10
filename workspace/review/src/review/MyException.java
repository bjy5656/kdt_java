package review;

public class MyException extends Exception{
	public MyException() {
		super("음수는 입력하면 안돼요");
	}
}
