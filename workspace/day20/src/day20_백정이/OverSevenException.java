package day20_백정이;
//예외클래스 작성 => 학생수가 7명을 초과
public class OverSevenException extends Exception{

	public OverSevenException() {
		super("학생수가 7명을 초과했습니다!!");
	}
	
}
