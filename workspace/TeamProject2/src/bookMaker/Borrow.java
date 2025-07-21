package bookMaker;

import exceptionMaker.BookNotAvailableException;

public interface Borrow {
	//추상메소드
	//대출 메소드, 대출불가 예외 던지기
	void borrowBook() throws BookNotAvailableException;
	//반납 메소드
	void returnBook();
}
