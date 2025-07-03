package ex03_백정이;
//Main 클래스 작성
public class Main {
	public static void main(String[] args) {
		//익명클래스 작성 
		StringInter si = new StringInter() {
			//익명클래스 내부에서 오버라이딩 
			//리턴타입 => String
			//매개변수 => String 문자열 
			//문자열 변수 선언(새문자열), 기본값으로 초기화 
			//for문 => 문자열의 문작 개수만큼 반복
			//	if charAt(i)가 ','이면 실행
			//		새문자열 += '!'
			//	else
			//		새문자열 += charAt(i)
			//for문 종료
			//새문자열 반환
			@Override
			public String modify(String str) {
				String newStr = "";
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == ',') {
						newStr += '!';
					}else {
						newStr += str.charAt(i);
					}
				}
				return newStr;
			}
		}; //내부클래스 중괄호 끝
		
		//람다식 작성
		//참조변수 선언
		//메소드 이름 지우고 -> 생성
		//리턴타입 추론 가능하므로 생략
		//매개변수 타입 추론 가능하므로 생략 
		//매개변수 1개 => 소괄호 생략 가능 
		//실행할 문장 여러개 => 중괄호 및 ; 생략 불가, return 생략 불가
		
		StringInter si1 = str -> {
			String newStr = "";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ',') {
					newStr += '!';
				}else {
					newStr += str.charAt(i);
				}
			}
			return newStr;
		};
		
		
		System.out.println(si.modify("d,d,d,"));
		System.out.println(si1.modify("d,d,d,"));
	}
}
