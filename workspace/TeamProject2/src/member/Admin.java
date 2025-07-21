package member;

import bookMaker.Book;
import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.MaxBorrowException;
import user.User;

public class Admin extends User{
	//필드
	private String id = "admin";
	private String pw = "1234";
	private boolean isLoggedIn = false;
	
	
	//생성자
	public Admin(String name, String phoneNumber, String id, String pw) {
		super(name, phoneNumber);
		this.id = id;
		this.pw = pw;
	}
	//기본 생성자
	public Admin() {
		
	}
	
	
	//메소드 오버라이딩 
	@Override
	public void borrowBooks(Book book) throws BookAlreadyException, BookNotAvailableException, MaxBorrowException {
		
	}
	@Override
	public void returnBooks(Book book) {
		
	}
	//toString 재정의
	@Override
	public String toString() {
		return "관리자 계정으로 로그인중입니다";
	}
	
	
	//getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

}
