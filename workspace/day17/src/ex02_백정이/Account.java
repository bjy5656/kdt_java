package ex02_백정이;
//Account 클래스 구성 
public class Account {
//	2. 은행 계좌 프로그램
//	은행계좌 클래스 : Account
//	필드 : 잔고 balance
//	출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
//	            출금금액의 0원이 부족하여 출금이 불가합니다. 출력
//	입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력
//
//	=> 모든 예외처리는 메소드를 사용하는 쪽으로 던지기
	
	
	//필드
	int balance; //잔액
	
	//메소드
	//출금 메소드
	//리턴타입 => void
	//매개변수 => int 출금금액 
	//if 잔액보다 출금금액이 크면 실행 
	//	출력(출금 불가 메시지, 잔액과 출금금액의 차이)\
	//	잔액초과 예외 생성하고 던지기 
	//잔액에서 출금금액만큼 차감
	//출력(출금금액, 잔액)
	void withdraw(int amount) throws OverBalanceException{
		if(balance < amount) {
			System.out.println("출금금액의 " + (amount - balance) + "원이 부족하여 출금이 불가합니다");
			throw new OverBalanceException();
		}
		balance -= amount;
		System.out.println(amount + "원을 출금합니다 현재 잔고는 " + balance + "원입니다");
	}
	
	//입금 메소드
	//리턴타입 => void 
	//매개변수 => int 입금금액
	//잔액에서 입금금액만큼 증가 
	//출력(입금금액, 잔액)
	void deposit(int amount) {
		balance += amount; 
		System.out.println("입금된 금액은 " + amount + "원입니다, 현재 잔고는 " + balance + "원입니다");
	}
		
	//생성자
	//잔액 초기화 
	public Account(int balance) {
		this.balance = balance;
	}

}
