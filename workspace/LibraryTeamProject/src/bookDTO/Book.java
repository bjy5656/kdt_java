package bookDTO;

import java.util.Objects;

import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.MaxBorrowException;

public class Book implements Borrow {
	//sql
//	CREATE TABLE TBL_BOOKS(
//			BOOK_NUMBER NUMBER,
//			BOOK_TITLE varchar2(100) NOT NULL,
//			BOOK_AUTHOR varchar2(100) NOT NULL,
//			BOOK_AVAILABLE Char(1) DEFAULT 'T' NOT NULL,
//			USER_NUMBER NUMBER,
//			CONSTRAINT PK_BOOK_NUMBER PRIMARY KEY(book_number),
//			CONSTRAINT FK_USER_NUMBER FOREIGN KEY(USER_NUMBER) REFERENCES TBL_USER (USER_NUMBER),
//			CHECK(BOOK_AVAILABLE IN ('T', 'F'))
//		);
	
	// 필드
	private int bookNumber;
	private String bookTitle;
	private String bookAuthor;
	private boolean bookAvailable;
	private int userNumber;
	
	// 생성자
	public Book(String bookTitle, String bookAuthor, boolean bookAvailable) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookAvailable = bookAvailable;
	}
	
	//getter, setter
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public boolean isBookAvailable() {
		return bookAvailable;
	}
	public void setBookAvailable(boolean bookAvailable) {
		this.bookAvailable = bookAvailable;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	// 메소드 오버라이딩
	// 도서대출 오버라이딩 -> 메시지 출력, 도서 정보 출력, 대출가능 여부 변경(false), 예외 던지기
	@Override
	public void borrowBook() throws BookNotAvailableException{
		if(!bookAvailable) {
			throw new BookNotAvailableException();
		}
		System.out.println("도서를 대출합니다!");
		System.out.println(this);
		bookAvailable = false;
	}
	// 도서반납 오버라이딩 -> 메시지 출력, 도서 정보 출력, 대출가능 여부 변경(true)
	@Override
	public void returnBook() {
		System.out.println("도서를 반납합니다!");
		System.out.println(this);
		bookAvailable = true;
	}
	// toString 오버라이딩 -> 도서 정보 반환
	@Override
	public String toString() {
		return "[도서번호 : " + bookNumber
				+ ", 제목 : " + bookTitle 
				+ ", 저자 : " + bookAuthor 
				+ ", 대출가능 여부 : " + (bookAvailable ? "가능" : "불가") 
				+ ", 회원번호 : " + userNumber + "]";
	}

}
