package methodTest;

public class MethodTask {
	public static void main(String[] args) {
		
	MethodTask mt = new MethodTask();
	
	System.out.println("=====1번=====");	
	System.out.println(mt.changeSign(100));
	System.out.println(mt.changeSign(-100));
	
	System.out.println("=====2번=====");	
	System.out.println(mt.printName(2,  "장구"));
	String value = mt.printName(3,  "철수");
		
	System.out.println("=====3번=====");	
	
	
	
	System.out.println("=====6번=====");	
	System.out.println(mt.changeCase("HELLO")); //hello
	System.out.println(mt.changeCase("heLLo"));
	
	}
	//1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드 
	//매개변수o, 리턴값o 
	//메소드명 : changeSign

	//로직구성 
	//메소드 선언 => 리턴타입 : int, 매개변수 : int형 입력정수
	//정수형 변수 선언(결과값) 
	//삼항연산자 사용 => 결과값에 입력정수가 0 이상이 참이면 입력정수 대입, 거짓이면 -(입력정수) 대입 
	//결과값 리턴 
	
//	int changeSign(int num){
//		int result = 0; 
//		result = num >= 0 ? num : -num;
//		return result;
//	}
	
	int changeSign(int num) {
		return num * -1;
	}
	
	

	//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드 
	//매개변수o, 리턴값o
	//메소드명 : printName 
	
	//로직구성 
	//메소드 선언 => 리턴타입 : void, 매개변수 : String(이름), int(입력정수) 
	//for문 => 초기식 i=0; 조건식 i<입력정수, 증감식 i++
	//	출력(이름)
	//for문 종료 
	
	//기능 => 전달된 정수만큼 전달된 이름 출력 
	//리턴타입 => void 
	//메소드명 => printName 
	//매개변수 => 2개(int, String) 
	//구현부{실행할 문장 => for문(초기식 int i = 1; 조건식 int <= 매개변수; 증감식 i++)
	//	syso(문자열매개변수); }
	//리턴값 => "정수 : " + 정수형매개변수 + "이름 : " + 문자열매개변수;
	//리턴타입을 수정 => String
	
//	void printName(String name, int num) {
//		for(int i = 0; i < num; i++) {
//			System.out.println(name);
//		}
//	}
	
	String printName(int num, String name) {
		for(int i = 1; i <= num; i++) {
			System.out.println(name);
		}
		return num + ", " + name;
	}
	
	//3. 10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드 
	//매개변수o, 리턴값o
	//메소드명 ; changeNumber 
	
	//로직구성 
	//메소드 선언 => 리턴타입 : int, 매개변수 : int(입력정수) 
	//정수형 변수 선언(결과값) 
	//삼항연산자 이용 => 결과값에 입력정수가 10 이하가 참이면 1, 거짓이면 100 대입 
	//결과값 반환 
	
	//1) 리턴타입 => int 
	//2) 메소드명 => changeNumber
	//3) 매개변수 => 정수형 1개 
	//4) 실행할문장	 //5)리턴값 실행 연산자  
	
//	int changeNumber(int num) {
//		int result = 0; 
//		result = num <= 10 ? 1 : 100;
//		return result;
//	}
	
	int changeNumber(int num) {
		return num <= 10 ? 1 : 100;
	}
	
	//4. 5개의 정수 중 평균을 반환하는 메소드 
	//매개변수o(배열), 리턴값o 
	//메소드명 : getAvg 
	
	//로직구성 
	//메소드 선언 => 리턴타입 : double, 매개변수 : 정수형 배열(입력배열) 
	//double형 변수 선언(총합) 
	//for문 사용 => 초기식 i = 0; 조건식 i < 배열길이; 조건식 i++ 
	//	총합 += 배열[i];
	//for문 종료 
	//총합을 배열길이로 나눈 값을 반환 
	
	//리턴타입 => void
	//메소드명 => getAvg
	//매개변수 => int[] ar
	//실행할문장 => 
	//	총합구할 변수 
	//	반복문(for~each문){
	//		총합구변수수 += 반복문변수;
	//	}
	//리턴 생각 => (실수형) 총합구할변수 / 배열.length;
	//리턴타입을 double 변경 
	
//	double getAvg(int[] numArray) {
//		double sum = 0.0;
//		for (int i = 0; i < numArray.length; i++) {
//			sum += numArray[i];
//		}
//		return sum / numArray.length;
//	}
	//메소드 매개변수 값으로 배열이 바로 들어갈 때는 new int[]를 붙여주어야 한다 
	
	
	//5. 정수 배열 중 최대값과 최소값을 출력하는 메소드 
	//매개변수ㅇ(배열), 리턴값x
	//메소드명 : printMinMax 
	
	//로직구성 
	//메소드 선언 => 리턴타입 : void, 매개변수 : 정수형 배열(입력배열) 
	//정수형 변수 선언(최대값, 최소값), 각각 배열의 첫번째 값으로 초기화 
	//for문 사용 => 초기식 i = 0; 조건식 i < 배열길이; 증감식 i++ 
	//	삼항연산자 사용 => 최대값에 최대값 > 배열[i] 값 참이면 최대값을, 거짓이면 배열[i] 값 대입 
	//	삼항연산자 사용 => 최소값에 최소값 < 배열[i] 값 참이면 최대값을, 거짓이면 배열[i] 값 대입 
	//for문 종료 
	//출력(최대값, 최소값) 
	
	//1) 리턴타입 => void 
	//2) 메소드명 => printMinMax
	//3) 매개변수 => int[] ar
	//4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교 
	//			0번째 인덱스의 값보다 작은값의 최소값, 큰값이 최대값이 된다 출력 
	
	void printMinMax(int[] ar) {
		int min = ar[0];
		int max = ar[0];
		
		for(int i = 1; i < ar.length; i++) {
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최소 : " + min + ", 최대 : " + max);
	}
	
//	void printMinMax(int[] numAr) {
//		int Max = numAr[0], Min = numAr[0];
//		for (int i = 0; i < numAr.length; i++) {
//			Max = Max > numAr[i] ? Max : numAr[i];
//			Min = Min > numAr[i] ? Min : numAr[i];
//		}
//		System.out.println("배열의 최대값 : " + Max + ", 최소값 : " + Min);
//	}
	
	//6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드 
	//예시 : BanAnA => bANaNa 
	//메소드명 : changeCase 
	//매개변수와 반환값은 자유 => 단, 형변환 이용할것!
	
	//로직구성 
	//메소드 선언 => 리턴타입 : void, 매개변수 : String(입력문자) 
	//정수형 변수 선언(코드값차이 : 대문자 알파벳과 소문자 알파벳의 유니코드값 차이 -> 32) 
	//문자열 변수 선언(결과문자), 기본값 대입 
	//for문 선언 => 초기식 : i = 0; 조건식 i < 문자열.length(); 증감식 i++
	//	삼항연산자 사용 => 결과문자 += 입력문자.charAt(i) >= 97 참이면 - 코드값차이 계산, 거짓이면 + 코드값차이 계산
	//for문 종료 
	//출력(결과문자)
	
	 //1) 리턴타입 => void
	   //2) 메소드명 => changeCase
	   //3) 매개변수 => 문자열 1개
	   //4) 실행할문장 => 
	   //      문자형 변수1 선언
	   //      문자열 변수2 선언
	   //      for문( int i=0; i < 매개변수.length(); i++){
	   //         변수1 = 매개변수.charAt(i);
//	         조건문(if~else if~else)
	   //         if(변수1 >= 97 && 변수1 <= 122{
	   //            변수2 += (char)(변수1 - 32);
	   //         }else if(변수1 >= 65 && 변수 <= 90){
	   //            변수2 += (char)(변수1 + 32);
	   //         }else{
	   //            잘못된 값입니다 출력
	   //         }}
	   //      return 변수2;
	   //5) 리턴타입 수정 => String
	
	
//	void changeCase(String st) {
//		int dif = 'a' - 'A';
//		String result = null;
//		for(int i = 0; i < st.length(); i++) {
//			result += st.charAt(i) >= 'a' ? st.charAt(i) - dif : st.charAt(i) + dif;
//		}
//		System.out.println("변환된 문자는 : " + result);
//	}
	
	String changeCase(String str) {
	      char c = ' ';
	      String result = "";
	      
	      for(int i = 0; i < str.length(); i++) {
	         c = str.charAt(i);
	         if(c >= 97 && c <= 122) {
	            result += (char) (c - 32);
	         }else if(c >= 65 && c <= 90) {
	            result += (char) (c + 32);
	         }else {
	            result = "잘못된 값입니다";
	         }
	      }
	      return result;
	   }
	
	
	//7. 아이디와 비밀번호를 입력받아 로그인하기 
	//매개변수o, 리턴값o(리턴타입 boolean) 
	//메소드명 : login 
	//main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력 
	//둘중하나라도 틀리면 다시 확인하세요 출력 
	
	//로직구성 
	//메소드 선언 => 리턴타입 : boolean, 매개변수 : String(아이디, 비밀번호) 
	//boolean형 변수 선언(결과값), true 대입 
	//if문 => id 가 admin이고 비밀번호가 1234 참이면 실행 
	//	메시지 출력 
	//else문 
	//	다시 확인하세요 출력 
	//	결과값에 false 대입 
	//결과값 반환 
	
	boolean login(String id, String pw) {
		boolean result = true;
		if(id == "admin" && pw == "1234") {
			System.out.println("관리자님 환영합니다");
		}
		else {
			System.out.println("다시 확인하세요");
			result = false; 
		}
		return result; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
