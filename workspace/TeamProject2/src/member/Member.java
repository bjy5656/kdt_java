package member;

import java.util.ArrayList;
import java.util.List;

import bookMaker.Book;
import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.MaxBorrowException;
import user.User;

public class Member extends User{
	//필드
	private String id;
	private String pw;
	private boolean isLoggedIn = false;
	private List<Book> borrowBook; //유저에 빌린 책 정보를 담기 위함 
	private int borrowLimit = 20; //대출한도(20권)
	
	
	//생성자
	public Member(String name, String phoneNumber, String id, String pw) {
		super(name, phoneNumber);
		this.id = id;
		this.pw = pw;
		this.borrowBook = new ArrayList<>();
	}
	

	//메소드 오버라이딩 
	//대출 메소드
	//매개변수:(책)
	//대출한도가 0이면 한도초과 예외 발생
	//자기책목록에 책이 이미 있으면 이미대여 예외 발생
    //자기책목록에 책 추가, 책의 대출메소드 호출, 대출한도 1차감
	@Override
	public void borrowBooks(Book book) throws BookAlreadyException, BookNotAvailableException, MaxBorrowException{
		if(borrowLimit == 0) {
			throw new MaxBorrowException();
		}
		if(borrowBook.contains(book)) {
			throw new BookAlreadyException();
		}
		borrowBook.add(book);
		book.borrowBook();
		borrowLimit--;
	}
	//반납 메소드
	//매개변수:(책)
	//자기책목록에서 책 제거, 책의 반납메소드 호출, 대출한도 1증가
	@Override
	public void returnBooks(Book book) {
		borrowBook.remove(book);
		book.returnBook();
		borrowLimit++;
	}
	//toString 재정의
	//회원 정보 반환 
	@Override
	public String toString() {
		return "[ " + getName() + " 회원님의 대출한도는 " + borrowLimit + "권입니다 ]";
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
	public List<Book> getBorrowBook() {
		return borrowBook;
	}
	public void setBorrowBook(List<Book> borrowBook) {
		this.borrowBook = borrowBook;
	}
	public int getBorrowLimit() {
		return borrowLimit;
	}
	public void setBorrowLimit(int borrowLimit) {
		this.borrowLimit = borrowLimit;
	}
	
	
	

	
	
	
}
