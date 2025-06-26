package task;
//메소드 문제
public class Task01 {
	
	public static void main(String[] args) {
		
		Task01 m = new Task01();
		
		System.out.println("=====1번=====");
//		m.countWord("안녕하세요 저는 백정이입니다 java 공부 중입니다");
		
		System.out.println("=====2번=====");
		System.out.println(m.getGender("9402172"));
		
		System.out.println("=====3번=====");
		System.out.println(m.getGrade(10, 55, 97));
		System.out.println(m.getGrade(100, 100, 100));
		System.out.println(m.getGrade(77, 77, 77));
		
	}
	
	
	//1. 문자열 속의 단어를 공백 기준으로 세기 
	//메소드명 : countWord
	//매개변수 : String str 
	//ex) I love java	=> 3개 
	//ex) 안녕하세요 저는 백정이입니다 java 공부 중입니다 => 6개 
	
	//로직구성 
	//리턴타입 => void 
	//실행할문장 => 
	//정수형 변수 선언(공백 개수), 기본값 0 대입 
	//boolean 변수 선언(앞뒤 맨 끝 공백 여부), false 대입  
	//for문 => int i=0; i<문장길이; i++
	//	if문 => 문장의 각 문자가 공백이면 실행 
	//		공백개수++
	//		
	//for문 종료 
	//출력(단어의 개수 : 공백개수 + 1) 
	

	
	//2. 주민등록번호로 성별 판단하기 
	//메소드명 : getGender 
	//1, 3 => 남자 
	//2, 4 => 여자 
	
	//로직구성
	//리턴타입 => String 
	//매개변수 => String 주민번호
	//실행할문장 => 주민번호를 뒷번호 맨 앞자리까지(총 7문자) 인수로 입력받고 성별 판단  
	//boolean형 변수 4개 선언( 자리수확인, 끝자리확인, 생월확인, 일자확인), false 대입 
	//int형 변수 2개 선언(생월, 일자), 각각 알맞은 자리수를 정수로 형변환한 후 대입 
	//if 주민번호가 7자리이면 자리수확인 = true 
	//if 주민번호 끝자리가 1~4이면 끝자리확인 = true 
	//if 주민번호 생월이 1~12이면 생월확인 = true 
	//if 주민번호 일자가 1~31이면 일자확인 = true 
	//if 주민번호 마지막자리가 
	//if 끝자리확인, 생월확인, 일자확인 모두 true이면 실행 
	//	if 주빈번호 끝자리가 1 또는 3이면 실행 
	//		남자입니다 반환 
	//	else
	//		여자입니다 반환 
	//else
	//	다시 입력하세요 반환 
	
	
	String getGender(String regNum) {
		boolean lengthCheck = false, lastNumCheck = false, monthCheck = false, dayCheck = false;
		int month = Integer.parseInt("" + regNum.charAt(2) + regNum.charAt(3));
		int day = Integer.parseInt("" + regNum.charAt(4) + regNum.charAt(5));
		if(regNum.length() == 7) {
			lengthCheck = true;
		}
		if(regNum.charAt(regNum.length()-1) >= '1' && regNum.charAt(regNum.length()-1) <= '4') {
			lastNumCheck = true;
		}
		if(month >= 1 && month <= 12) {
			monthCheck = true;
		}
		if(day >= 1 && day <= 31) {
			dayCheck = true;
		}
		if(lengthCheck && lastNumCheck && monthCheck && dayCheck) {
			if(regNum.charAt(6) == 1 || regNum.charAt(6) == 3) {
				return "남자입니다";
			}else {
				return "여자입니다";
			}
		}else {
			return "다시 입력하세요";
		}
		
	}
	
	
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 각 학생별 평균 구하여(정수형)
	//		각 학생별 학점 구하기 
	//메소드명 : getGrade 
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F
	
	//로직구성 
	//리턴타입 => String  
	//매개변수 => int 3개(수학점수, 국어점수, 영어점수)
	//실행할문장 => 해당 등급의 최소점수를 구하고 switch문에 대입하여 학점을 반환 
	//정수형 변수 2개 선언(점수평균, 등급의 최소점수)
	//점수평균 = (수학점수 + 국어점수 + 영어점수) / 3
	//삼항연산자 사용 => 점수평균 10단위 값에 1의자리가 5 이상이면 5를 더하고 아니면 그대로 등급최소점수에 대입 
	//if 점수평균이 95 이상이면 등급최소점수에 95 대입 
	//switch (등급최소점수) 
	//	95부터 70까지 5점 단위로 케이스를 나누고 각 등급을 반환
	//	default F 반환 
	
	String getGrade(int math, int kor, int eng) {
		int avg = 0, minScore = 0;
		avg = (math + kor + eng) / 3;
		minScore = avg % 10 >= 5 ? (avg / 10) * 10 + 5 : (avg / 10) * 10;
		if (avg >= 95) {
			minScore = 95;
		}
		switch(minScore) {
		case 95:
			return "A+";
		case 90:
			return "A";
		case 85:
			return "B+";
		case 80: 
			return "B";
		case 75:
			return "C+";
		case 70:
			return "C";
		default:
			return "F";
		}
	}
	
}
