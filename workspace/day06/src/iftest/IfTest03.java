package iftest;
//12번 : if ~ else if ~ else문 
public class IfTest03 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작 
		//양수, 음수, 0인지 출력하기 
		System.out.println("출력 시작"); //메시지 출력
		
		int num = 10; //int 변수 num에 10 대입 
		
		if (num > 0) { //if문 시작, num(10) > 10 false이므로 실행하지 않음 
			System.out.println("양수입니다");
		}else if (num < 0) { //else if문 시작, num(10) < 0 false이므로 실행하지 않음 
			System.out.println("음수입니다"); 
		}else { //else문 시작, 앞에서 모두 실행되지 않으므로 실행 
			System.out.println("0입니다"); //메시지 출력 
		}
		


		if (num > 5 && num < 15) { // num(10) > 5 와 num(10) < 15 모두 true 이므로 true => 실행 
			System.out.println("5보다 큽니다"); //메시지 출력 
		}else if (num > 3) { //앞의 if문에서 실행했으므로 실행되지 않음
			System.out.println("3보다 큽니다"); 
		}else { //앞의 if문에서 실행했으므로 실행되지 않음 
			System.out.println(num );
		}	
	
		System.out.println("출력 끝"); //메시지 출력 
	} //main 메소드 종료 

} //클래스 종료 
