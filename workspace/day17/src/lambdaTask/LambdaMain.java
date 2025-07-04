package lambdaTask;
//람다 실습
public class LambdaMain {
	public static void main(String[] args) {
		
//		인터페이스명 : CombInter(함수형 인터페이스)
//		두 문자열을 입력받아 연결하는 추상 메소드를 만든다(명령문은 1줄) 
//		메인메소드에서 익명클래스로 객체화 
//		메인메소드에서 람다식으로 객체화 
		
		CombInter c = new CombInter() {

			@Override
			public String connect(String str1, String str2) {
				return str1 + str2;
			}
			
		};
		
		//이름 지우고 -> 추가 
		//반환타입 추론 가능하므로 생략 
		//매개변수 타입 추론 가능하므로 생략 
		//매개변수 2개 이상이므로 () 생략 불가 
		//명령문이 1개이므로 {}와 ; 생략 
		//return도 생략해야한다 
		CombInter cc = (str1, str2) -> str1 + str2;
		System.out.println(cc.connect("철수와", " 영희"));
	}
}
