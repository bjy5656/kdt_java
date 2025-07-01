package ex05_백정이;

//(1)열거형 자료구조 정의
public enum Major {
	
	COMPUTER_SCIENCE("컴퓨터공학"), CYBER_SECURITY("정보보안학"), ARTIFICIAL_INTELLIGENCE("인공지능학");

	//필드
	final private String koreanName;

	//생성자
	private Major(String koreanName) {
		this.koreanName = koreanName;
	}
	
	//메소드 - 한글명 반환
	//리턴타입 => String 
	//메소드명 => getKoreanName
	//매개변수 x
	//실행할문장 => 
	//return 상수의 한글 정공명
	String getName ( ) {
		return this.koreanName;
	}
	
}
