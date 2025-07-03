package ex02_백정이;
//AccountMain 클래스 작성  
public class AccountMain {
	 public static void main(String[] args) {
		//로직구성
		//Account 객체 생성 (잔액 : 1000) 
		//try
		//	출금 메소드 실행 (출금금액 : 1500)
		//catch => 예외 객체 생성
		//	printStackTrace(예외 발생지점을 추적하여 단계별로 전부 출력) 메소드 실행 
		//catch문 종료
		//입금 메소드 실행 
		
		Account a = new Account(1000);
		try {
			a.withdraw(1500);
		} catch (OverBalanceException e) {
			e.printStackTrace();
		}
		a.deposit(1500);
		System.out.println("프로그램 종료");
	}
}
