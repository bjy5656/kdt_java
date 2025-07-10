package review;

public class ToStringTest {
	public static void main(String[] args) {
		Student st1 = new Student("장구", 100, 100, 100+100);
		System.out.println(st1);
		System.out.println(st1.toString());
	}
}
