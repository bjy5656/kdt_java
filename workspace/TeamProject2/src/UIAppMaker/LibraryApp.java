package UIAppMaker;

import java.util.InputMismatchException;
import java.util.Scanner;

import bookMaker.Book;
import exceptionMaker.BookAlreadyException;
import exceptionMaker.BookNotAvailableException;
import exceptionMaker.ConsoleUIException;
import exceptionMaker.MaxBorrowException;
import member.Admin;
import member.Member;
import serviceDeveloper.LibraryService;
import user.LoginManager;

public class LibraryApp {
	//대출할 책 목록 메소드 
	//매개변수:(LibraryService 객체), 가능한 책 목록 출력, 도서목록번호를 함께 출력
	public static void printAvailableBookList(LibraryService ls) {
		for(int i = 0; i < ls.getBookList().size(); i++) {
			if(ls.getBookList().get(i).isAvailable()) {
				System.out.println("목록번호 : " + i + ls.getBookList().get(i));
			}
		}
	}
	//반납할 책 목록 메소드 
	//매개변수:(회원), 자기책목록 출력, 자기책목록번호를 함께 출력 
	public static void printBorrowedBookList(Member member) {
		for(int i = 0; i < member.getBorrowBook().size(); i++) {
			System.out.println("목록번호 : " + i + member.getBorrowBook().get(i));
		}
	}
	//main 메소드
	public static void main(String[] args) {
//		Scanner 객체 생성
//		ConsoleUI 객체 생성 
//		ConsoleUI 정보 출력
//		LoginManager 객체 생성
//		LoginManager 정보 출력
//		LibraryService 객체 생성
//		LibraryService 정보 출력 
//		LibraryService 객체의 책 랜덤 생성 메소드 호출
//		입력할 Member 정보 변수 선언
//		입력할 제목/저자/출판사 변수 선언
//		입력할 목록번호 변수 선언
//		입력번호 변수 선언
//		while문(입력번호가 0이 아니면 반복)
//		ConsoleUI의 Member/Admin 객체 로그인된 상태이면 정보 출력
//		메뉴메소드 호출
//		입력번호 = 번호입력메소드 호출, 예외처리
//		switch문 
//		입력번호:1
//			로그아웃된 상태면 id/pw 입력받기, 관리자 계정 id/pw 출력, 로그인 메소드 호출하고 Member 객체에 대입, 예외처리
//			로그인된 상태면 로그아웃 메소드 호출, 예외처리
//		입력번호:2
//			도서제목 입력받기, 예외처리
//			도서검색 메소드 호출
//		입력번호:3
//			도서목록 출력 메소드 호출	
//		입력번호:4
//			대출할 책 목록 메소드 호출
//			도서목록번호 입력받기, LibraryService의 대출메소드 호출, 예외처리 
//		입력번호:5
//			반납할 책 목록 메소드 호출
//			자기책목록번호 입력받기, LibraryService의 대출메소드 호출, 예외처리 
//		입력번호:6
//			대출할 책 목록 메소드 호출
//		입력번호:7
//			반납할 책 목록 메소드 호출
//		입력번호:9
//			로그아웃된 상태면 이름/전화번호/id/pw 입력받기, 회원가입 메소드 호출, 예외처리
//		while문 종료(입력번호가 0이면)
//		종료되었습니다 출력
		Scanner sc = new Scanner(System.in);
		ConsoleUI cu = new ConsoleUI();
		System.out.println(cu);
		LoginManager lm = new LoginManager();
		System.out.println(lm);
		LibraryService ls = new LibraryService();
		System.out.println(ls);
		ls.randomBookList();
		String name = "", phoneNumber = "", id = "", pw = "";
		String title = "", author = "", publisher = "";
		int index = 0;
		int inputNum = 10;
		while(inputNum != 0) {
			if(cu.getCurLoginUser().isLoggedIn()) {
				System.out.println(cu.getCurLoginUser());
			}
			if(cu.getCurLoginAdmin().isLoggedIn()) {
				System.out.println(cu.getCurLoginAdmin());
			}
			cu.menuPrinter();
			try {
				inputNum = cu.loginMenu(sc);
			} catch (InputMismatchException | ConsoleUIException e) {
				e.printStackTrace();
				continue;
			} catch (RuntimeException e) {
				e.printStackTrace();
				continue;
			}
			switch(inputNum) {
			case 1:
				if(!cu.getCurLoginUser().isLoggedIn() && !cu.getCurLoginAdmin().isLoggedIn()) {
					try {
						System.out.println("아이디를 입력하세요 : ");
						System.out.println("관리자 계정 id : admin\n관리자 계정 pw : 1234");
						id = sc.nextLine();
						if(!lm.getUserInfo().containsKey(id) && !lm.getAdminInfo().containsKey(id)) {
							throw new ConsoleUIException("없는 id입니다!");
						}
						if(id == null || id.trim().length() == 0) {
							throw new ConsoleUIException("id가 한글자 이상 입력되지 않았습니다!");
						}
						System.out.println("비밀번호를 입력하세요 : ");
						pw = sc.nextLine();
						if(!pw.equals(lm.getUserInfo().get(id).getPw())) {
							throw new ConsoleUIException("pw가 일치하지 않습니다!");
						}
						if(pw == null || pw.trim().length() == 0) {
							throw new ConsoleUIException("pw가 한글자 이상 입력되지 않았습니다!");
						}
					} catch (ConsoleUIException | InputMismatchException e) {
						e.printStackTrace();
						break;
					} catch (RuntimeException e) {
						e.printStackTrace();
						break;
					}
					if(lm.login(id, pw) instanceof Admin) {
						cu.setCurLoginAdmin((Admin)lm.login(id, pw));
					}else {
						cu.setCurLoginUser((Member)lm.login(id, pw));
					}
				}else {
					lm.logout(cu.getCurLoginAdmin());
					lm.logout(cu.getCurLoginUser());
				}
				break;
			case 2:
				try {
					System.out.println("제목을 입력하세요 : ");
					title = sc.nextLine();
					if(title == null || title.trim().length() == 0) {
						throw new ConsoleUIException("제목이 한글자 이상 입력되지 않았습니다!");
					}
					boolean contains = false;
					for(Book book : ls.getBookList()) {
						if(title.equals(book.getTitle())) {
							contains = true;
							break;
						}
					}
					if(!contains) {
					throw new ConsoleUIException("없는 도서입니다!");
					}
				} catch (ConsoleUIException | InputMismatchException e) {
					e.printStackTrace();
					break;
				} catch (RuntimeException e) {
					e.printStackTrace();
					break;
				}
				ls.bookSearch(title);
				break;
			case 3:
				ls.printBookList();
				break;
			case 4:
				printAvailableBookList(ls);
				try {
					System.out.println("도서목록번호를 입력하세요 : ");
					index = Integer.parseInt(sc.nextLine());
					if(index < 0 || index > ls.getBookList().size() - 1) {
						throw new ConsoleUIException("목록번호 범위를 벗어났습니다!");
					}
				} catch (ConsoleUIException | InputMismatchException e) {
					e.printStackTrace();
					break;
				} catch (RuntimeException e) {
					e.printStackTrace();
					break;
				}
				try {
					ls.borrowBookService(cu.getCurLoginUser(), index);
				} catch (BookAlreadyException e) {
					e.printStackTrace();
					break;
				} catch (BookNotAvailableException e) {
					e.printStackTrace();
					break;
				} catch (MaxBorrowException e) {
					e.printStackTrace();
					break;
				}
				break;
			case 5:
				printBorrowedBookList(cu.getCurLoginUser());
				try {
					System.out.println("대출할 도서의 목록번호를 입력하세요 : ");
					index = Integer.parseInt(sc.nextLine());
					if(index < 0 || index > cu.getCurLoginUser().getBorrowBook().size() - 1) {
						throw new ConsoleUIException("대출한 도서 목록의 목록번호 범위를 벗어났습니다!");
					}
				} catch (ConsoleUIException | InputMismatchException e) {
					e.printStackTrace();
					break;
				} catch (RuntimeException e) {
					e.printStackTrace();
					break;
				}
				ls.returnBoorService(cu.getCurLoginUser(), index);
				break;
			case 6:
				printAvailableBookList(ls);
				break;
			case 7:
				printBorrowedBookList(cu.getCurLoginUser());
				break;
			case 8:
				try {
					System.out.println("제목을 입력하세요 : ");
					title = sc.nextLine();
					if(title == null || title.trim().length() == 0) {
						throw new ConsoleUIException("이름이 한글자 이상 입력되지 않았습니다!");
					}
					System.out.println("저자를 입력하세요 : ");
					author = sc.nextLine();
					if(author == null || author.trim().length() == 0) {
						throw new ConsoleUIException("저자가 한글자 이상 입력되지 않았습니다!");
					}
					System.out.println("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					if(publisher == null || publisher.trim().length() == 0) {
						throw new ConsoleUIException("출판사가 한글자 이상 입력되지 않았습니다!");
					}
				} catch (ConsoleUIException | InputMismatchException e) {
					e.printStackTrace();
					break;
				} catch (RuntimeException e) {
					e.printStackTrace();
					break;
				}
				ls.addBook(title, author, publisher);
				break;
			case 9:
				try {
					System.out.println("이름을 입력하세요 : ");
					name = sc.nextLine();
					if(name == null || name.trim().length() == 0) {
						throw new ConsoleUIException("이름이 한글자 이상 입력되지 않았습니다!");
					}
					System.out.println("전화번호를 입력하세요 : ");
					phoneNumber = sc.nextLine();
					if(phoneNumber.length() != 11) {
						throw new ConsoleUIException("전화번호 자리수가 올바르지 않습니다!");
					}
					for(int i = 0; i < phoneNumber.length(); i++){
						if(phoneNumber.charAt(i) < 48 || phoneNumber.charAt(i) > 57) {
							throw new ConsoleUIException("전화번호가 잘못 입력되었습니다!");
						}
					}
					System.out.println("아이디를 입력하세요 : ");
					id = sc.nextLine();
					if(lm.getUserInfo().containsKey(id) || lm.getAdminInfo().containsKey(id)) {
						throw new ConsoleUIException("이미 있는 id입니다!");
					}
					if(id == null || id.trim().length() == 0) {
						throw new ConsoleUIException("id가 한글자 이상 입력되지 않았습니다!");
					}
					System.out.println("비밀번호를 입력하세요 : ");
					pw = sc.nextLine();
					if(pw == null || pw.trim().length() == 0) {
						throw new ConsoleUIException("pw가 한글자 이상 입력되지 않았습니다!");
					}
				} catch (ConsoleUIException | InputMismatchException e) {
					e.printStackTrace();
					break;
				} catch (RuntimeException e) {
					e.printStackTrace();
					break;
				}
				lm.register(id, pw, name, phoneNumber);
				break;
			}
		}
		System.out.println("종료되었습니다");
	}
}
