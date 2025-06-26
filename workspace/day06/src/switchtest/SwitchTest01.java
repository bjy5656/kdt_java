package switchtest;
//14번 : switch문 
public class SwitchTest01 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작
		
		String animal = "고양이";
		
		switch ("강아지") { //switch문 시작부분, "강아지" 입력 
		case "고양이": //"강아지" == "고양이" false이므로 건너뜀 
			System.out.println("선택한 동물은 고양이입니다"); //출력되지 않음 
			break; //switch문 탈출되지 않음 
			
		case "강아지": //"강아지" == "강아지" true이므로 실행 
			System.out.println("선택한 동물은 강아지입니다"); //메시지 출력
			break; //switch문 탈출  
		
		case "코알라": //break가 실행되어 실행되지 않음 
			System.out.println("선택한 동물은 코알라입니다"); //break가 실행되어 실행되지 않음 
			break; //break가 실행되어 실행되지 않음 
		
		default: //break가 실행되어 실행되지 않음 
			System.out.println("선택한 동물이 없습니다"); //break가 실행되어 실행되지 않음 
			break; //break가 실행되어 실행되지 않음 
		} //switch문 종료부분
		
		switch (101) { //switch문 시작부분, 101 입력 
		case 10: //101 == 10 false이므로 건너뜀
			System.out.println("10입니다"); //출력되지 않음 
			break; //switch문 탈출되지 않음 
		case 100: //101 == 100 false이므로 건너뜀
			System.out.println("100입니다"); //출력되지 않음 1
			break; //switch문 탈출되지 않음 
		case 50: //101 == 50 false이므로 건너뜀 
			System.out.println("50입니다"); //출력되지 않음 
			break; //switch문 탈출되지 않음 
		default: //전부다 건너뛰었으므로 default문 실행 
			System.out.println("case에 값이 없습니다"); //메시지 출력 
		} //switch문 종료부분
		
		
	} //main 메소드 종료 
} //클래스 종료 
