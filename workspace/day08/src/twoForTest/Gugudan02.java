package twoForTest;

public class Gugudan02 {
	public static void main(String[] args) {
		
		System.out.println("=========================");
		for (int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %2d\t", dan, i, dan*i);
			}
			System.out.println();
		}
	}
}
