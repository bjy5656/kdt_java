package day20_백정이;

public class OutBoundsException extends Exception{

	public OutBoundsException() {
		super("점수가 0 ~ 100 값이 아닙니다!!");
	}
	
}
