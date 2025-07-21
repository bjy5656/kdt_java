package UIAppMaker;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptionMaker.ConsoleUIException;
import member.Admin;
import member.Member;

public class ConsoleUI {
	//필드
	private Member curLoginUser;
	private Admin curLoginAdmin;
	
	//생성자 
	public ConsoleUI() {
		this.curLoginUser = new Member(null, null, null, null);
		this.curLoginAdmin = new Admin(null, null, null, null);
	}
	
	
	//메소드
	//메뉴 메소드
	//메뉴 출력(1,2,3,4,...,0:시스템종료)
		//1 : 로그아웃된 상태면 로그인 / 로그인된 상태면 로그아웃
		//2 : 도서 검색
		//3 : 도서 목록 보기 
		//로그인된 상태면 출력 4 : 도서 대출 
		//로그인된 상태면 출력 5 : 도서 반납
		//로그인된 상태면 출력 6 : 대출가능 도서 목록 보기 
		//로그인된 상태면 출력 7 : 반납할 도서 목록 보기
		//관리자계정으로 로그인된 상태면 출력 8 : 도서 등록
		//로그아웃된 상태면 출력 9 : 회원가입
		//0 : 시스템 종료
	public void menuPrinter() {
		System.out.println(
			"1 : " + (!curLoginUser.isLoggedIn() && !curLoginAdmin.isLoggedIn() ? "로그인\n" : "로그아웃\n")
			+ "2 : 도서 검색\n" 
			+ "3 : 도서 목록 보기\n"
			+ (curLoginUser.isLoggedIn() ? "4 : 도서 대출\n" : "")
			+ (curLoginUser.isLoggedIn() ? "5 : 도서 반납\n" : "")
			+ (curLoginUser.isLoggedIn() ? "6 : 대출가능 도서 목록 보기 \n" : "")
			+ (curLoginUser.isLoggedIn() ? "7 : 반납할 도서 목록 보기\n" : "")
			+ (curLoginAdmin.isLoggedIn() ? "8 : 도서 등록\n" : "")
			+ (!curLoginUser.isLoggedIn() && !curLoginAdmin.isLoggedIn()? "9 : 회원 가입\n" : "")
			+ "0 : 시스템 종료"
				);
	}
	//번호 입력 메소드
	//매개변수:(Scanner 객체), 입력번호 반환, 예외 던지기 
	public int loginMenu(Scanner sc) throws ConsoleUIException, InputMismatchException{
		int num = sc.nextInt();
		sc.nextLine();
		if(curLoginUser.isLoggedIn()) {
			if(num < 0 || num > 7) {
				throw new ConsoleUIException("입력 번호가 잘못되었습니다!");
			}
		}
		if(!curLoginUser.isLoggedIn() && !curLoginAdmin.isLoggedIn()) {
			if((num < 0 || num > 3) && num != 9) {
				throw new ConsoleUIException("입력 번호가 잘못되었습니다!");
			}
		}
		if(curLoginAdmin.isLoggedIn()) {
			if((num < 0 || num > 3) && num != 8 && num != 9) {
				throw new ConsoleUIException("입력 번호가 잘못되었습니다!");
			}
		}
		return num;
	}
	//toString 재정의 
	@Override
	public String toString() {
		return "ConsoleUI가 시작되었습니다!";
	}


	//getter, setter
	public Member getCurLoginUser() {
		return curLoginUser;
	}
	public void setCurLoginUser(Member curLoginUser) {
		this.curLoginUser = curLoginUser;
	}
	public Admin getCurLoginAdmin() {
		return curLoginAdmin;
	}
	public void setCurLoginAdmin(Admin curLoginAdmin) {
		this.curLoginAdmin = curLoginAdmin;
	}
	
}
