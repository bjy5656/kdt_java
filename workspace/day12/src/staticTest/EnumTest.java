package staticTest;

public class EnumTest {
	//enum
	enum Day {
		MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), 
		SATURDAY(false), SUNDAY(false);
		//필드 
		boolean week;

		//생성자 
		private Day(boolean week) {
			this.week = week;
		}
		
		//메소드
		boolean weekday() {
			return this.week;
		}
	}
	
	
	//메인메소드
	public static void main(String[] args) {
		

//		Day today = Day.THURSDAY;
		Day today = Day.FRIDAY;
		
		System.out.println("오늘은 : " + today + "입니다");
		
		String result;
		
		//switch문을 사용하여 열거형 상수 처리 
		switch(today) {
		case MONDAY:
//			System.out.println("월요일입니다");
			result = "월요일";
			break;
		case THURSDAY:
//			System.out.println("목요일입니다");
			result = "목요일";
			break;
		case WEDNESDAY:
//			System.out.println("수요일입니다");
			result = "수요일";
		default:
//			System.out.println("다른요일입니다");
			result = "다른요일";
			break;
		}
		
		System.out.println("오늘은 " + result + "입니다");
		
		
		//조건문 오늘이
		if(today == Day.MONDAY)	{
			System.out.println("오늘은 평일입니다");
		}else {
			System.out.println("오늘은 주말입니다");
		}
		
		//모든 열거형 값을 배열로 가져오는 메소드 
		Day[] days = Day.values();
		System.out.println(days); // [LstaticTest.EnumTest01$Day;@1a6c5a9e
		for(Day day : days) {
			System.out.println(day);
		}
		
		
	}

}
