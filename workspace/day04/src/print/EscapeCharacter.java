package print;
//7번 : 이스케이프 문자 
public class EscapeCharacter {
	public static void main(String[] args) {
		//이스케이프문자는 문자열 안에서 \를 이용해 작성한다 
		// "\n" "\t" "\'" "\"" "\\"를 표현한다 
		
		//줄바꿈 : \n ㄴ
		System.out.print("안녕하세요. \n4일차 수업중입니다.\n");
		System.out.print("지금은\n이스케이프 문자\n배우는 중입니다.");
		
		//탭 간격 : \t 
		System.out.println("이름 : 백정이, 나이 : 26살");
		System.out.println("이름 : 백정이\t, 나이 : 26살");
		System.out.println("자바는 정말 재미있다. 자바 2일차!");
		System.out.println("자바는 정말 재미있다.\t\t 자바 2일차!");
		
		//문자열 안에서 작은따옴표, 큰따옴표 표현 : \', \"
		
		System.out.println("오늘 날씨는 \"흐림\"입니다.");
		System.out.println("오늘 날씨는 '비'가 입니다.");
		
		//역슬래쉬 : \\;
		System.out.println("워크스페이스 경로는 D:\\web_0900_bjy입니다.");
		
		//복합사용 
		System.out.println("문자열 안에서 다양한 제어문자를 표현할 수 있다.\n\"\\n\" 을 쓰면 줄바꿈이다."
				+ "\n\t\'\\t\'을 쓰면 탭키가 적용된다");
		
	}
}
