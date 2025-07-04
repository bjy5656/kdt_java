package objectTest02;
//4번 : Object 클래스 - equals() 메소드
public class EqualsTest {
	public static void main(String[] args) {
		User u1 = new User("짱구", 20);
		User u2 = new User("철수", 20);
		User u3 = new User("짱구", 20); 
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		//equals()가 오버라이딩 되어있지 않을 때 
		//만약 같은 이름이 같은 객체라면 equals() 메소드를 재정의하여 true 반환하도록 한다
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		System.out.println(u1.hashCode());
		System.out.println(u3.hashCode());
		
	}
}
