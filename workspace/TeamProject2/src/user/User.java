package user;

import bookMaker.Book;
import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.MaxBorrowException;

public abstract class User {
	//필드 
	private String name;
	private String phoneNumber;
	private boolean isLoggedIn;
	
	//생성자
	public User(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//기본 생성자
	public User() {
		
	}
	
	//추상메소드
	//대출 메소드, 이미대여, 대출불과, 한도초과 예외 던지기 
	public abstract void borrowBooks(Book book) throws BookAlreadyException, BookNotAvailableException, MaxBorrowException;
	//반납 메소드
	public abstract void returnBooks(Book book);

	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	
}
