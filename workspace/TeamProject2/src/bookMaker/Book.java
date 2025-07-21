package bookMaker;

import java.util.Objects;

import exceptionMaker.BookNotAvailableException;

public class Book implements Borrow{
	//필드
	private String title;
	private String author;
	private String publisher;
	private boolean isAvailable = true;

	
	//생성자 
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	//메소드 오버라이딩
	//대출 메소드 
	//대출가능여부가 불가이면 대출불가 예외 발생
    //대출가능여부변경
	//메시지 출력
	@Override
	public void borrowBook() throws BookNotAvailableException {
		if(!isAvailable) {
			throw new BookNotAvailableException(); 
		}
			isAvailable = false;
			System.out.println("대출되었습니다!");
			System.out.println("[ 대출된 도서 정보 ]\n" + this);
	}
	//반납 메소드
	//대출가능여부 변경
	//메시지 출력
	@Override
	public void returnBook() {
			isAvailable = true;
			System.out.println("반납되었습니다!");
			System.out.println("[ 반납된 도서 정보 ]\n" + this);
	}
	//toString 재정의
	@Override
	public String toString() {
		return "| " + (isAvailable ? "대출가능" : "대출불가") + " | 도서정보 : " + "[ 제목 : " + title + ", 저자 : " + author + ", 출판사 : " + publisher + " ]";
	}
	//equals 재정의
	//제목, 저자, 출판사 기준으로 비교 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Book) {
			Book book = (Book)obj;
	        return this.title.equals(book.title) && this.author.equals(book.author) && this.publisher.equals(book.publisher);
		}
		return false;
	}
	//hashCode 재정의
	//제목, 저자, 출판사를 이용해서 생성한 해시값 반환
	@Override
	public int hashCode() {
		return Objects.hash(title, author, publisher);
	}
	
	
	//getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
