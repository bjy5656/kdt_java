package serviceDeveloper;

import java.util.ArrayList;
import java.util.Iterator;

import bookMaker.Book;
import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.MaxBorrowException;
import member.Member;

public class LibraryService {
	//필드
	private ArrayList<Book> bookList;
	private String[] nameList = {"자바", "데이터베이스", "보안", "부자아빠", "리눅스마스터", "SQLD"};
	private String[] author = {"이정훈", "민경승", "백정이", "이태호", "이재빈", "김태현"};
	private String[] publisher = {"잉", "엥", "옹"};
	
	//생성자
	public LibraryService() {
		this.bookList = new ArrayList<Book>();
	}
	
	
	//메소드 
	//도서목록 출력 메소드 
	//도서목록의 각 책마다 출력, 도서목록번호를 함께 출력
	public void printBookList() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println("목록번호 : " + i + bookList.get(i));
		}
	}
	//도서검색 메소드 
	//매개변수:(도서제목)
	//도서목록의 제목에 해당하는 책마다 출력, 도서목록번호를 함께 출력
	public void bookSearch(String title) {
		for(int i = 0; i < bookList.size(); i++) {
			if(title.equals(bookList.get(i).getTitle())) {
				System.out.println("목록번호 : " + i + bookList.get(i));
			}	
		}
	}
	//대출 메소드 
	//매개변수:(회원, 도서목록번호) //인덱스로 책 빌리기 - 태호님 코드참고
	//도서목록번호에 해당하는 책을 매개변수에 대입하여 회원의 대출메소드를 호출, 예외 던지기
	public void borrowBookService(Member member, int index) throws BookAlreadyException, BookNotAvailableException, MaxBorrowException{
		member.borrowBooks(bookList.get(index));
	}
	//반납 메소드 
	//매개변수:(회원, 자기책목록번호) //인덱스로 책 반납 - 태호님 코드참고
	//자기책목록번호에 해당하는 책을 매개변수에 대입하여 회원의 반납메소드를 호출
	public void returnBoorService(Member member, int index) {
		member.returnBooks(member.getBorrowBook().get(index));
	}
	//toString 재정의
	//LibraryService 정보 반환 
	@Override
	public String toString() {
		return "LibraryService가 시작되었습니다!";
	}
	// 랜덤으로 책을 40개 생성 해주는 메소드 //태호님 코드
	public void randomBookList() {
		for(int i = 0; i < 40; i++) {
				int randomName = (int)(Math.random() * nameList.length);
				int randomAuthor = (int)(Math.random() * author.length);
				int randomPublisher = (int)(Math.random() * publisher.length);
				
				addBook(nameList[randomName], author[randomAuthor], publisher[randomPublisher]);
		}
	}
	// 책을 추가해주는 메소드 //태호님 코드
	public void addBook(String name, String author, String publisher) {
		Book newBook = new Book(name, author, publisher);
		bookList.add(newBook);
		System.out.println("등록되었습니다!");
		System.out.println("[ 등록된 도서 정보 ]\n" + newBook);
	}


	//getter, setter
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
}
