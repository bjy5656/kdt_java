package interfaceTest04;

public interface Inter2 {
	default void printText() {
		System.out.println("Inter2의 printText() 호출");
	}
}
