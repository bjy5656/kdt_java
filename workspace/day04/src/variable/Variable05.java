package variable;
//6번 : 변수를 사용하는 이유 
public class Variable05 {
	public static void main(String[] args) {
		//1) 반복되는 값을 쉽게 관리하기 위해서(값을 재사용하기 위함) 
		//같은 값을 여러곳에서 사용하거나 변경해야할 때 변수에 저장하면 코드 수정이 간편해진다
		//변수값을 변경하면 해당 변수를 참조하는 모든 코드에 변경사항이 자동으로 적용된다 
		
		int price = 100, quantity = 5; 
		System.out.println("가격 : " + price);
		System.out.println("수량 : " + quantity);
		System.out.println("총 가격 : " + price * quantity);
		
		price = 200;
		System.out.println("가격 : " + price);
		System.out.println("수량 : " + quantity);
		System.out.println("총 가격 : " + price * quantity);
		
		//2) 값에 의미를 부여하기 위해서(값에 이름을 붙여준다)
		// 변수에 이름을 붙이면 코드의 의미를 명확히 전달할 수 있다 
		// 문자열이나 숫자를 직접 사용하는 것보다 변수명을 통해 코드의 목적을 쉽게 이해할 수 있다 
		
		int userAge = 20; 
		final double PI = 3.141592;
		boolean isStudent = false;
		
		System.out.println("사용자 나이 : " + userAge);
		System.out.println("원주율 값 : " + PI);
		System.out.println("학생입니까? " + isStudent);
		//문자열 + 변수명(값) => 연결되어 출력된다 
		
		//3) 프로그램의 가독성, 유지보수성, 재사용을 높이기 위해서 
		// 코드에서 직접 값을 사용하는 매직넘버를 피하고 변수를 사용하면 수정과 유지보수가 용이하다
		
		int number; // RAM에서 상자를 만들고 그 상자의 이름을 number로 지정
		number = 10; // number. 상자에 10이라는 정수형 값을 지정, 이 number 상자는 RAM에서 특정 주소값을 가진다.
		System.out.println(number);
		//컴퓨터는 number의 주소값을 보고 RAM 데이터를 읽어온다
		//주소값에 있는 데이터 출력된다 
		
	}
}
