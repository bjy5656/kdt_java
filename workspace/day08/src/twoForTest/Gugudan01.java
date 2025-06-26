package twoForTest;

public class Gugudan01 {
	public static void main(String[] args) {
		//이중 for문 
		for (int dan = 2; dan <= 9; dan++) { //바깥for문 dan => 2
			//안쪽for문 곱해질 변수 i => 1 ~ 9
			System.out.println(dan + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}
			System.out.println();
		}
	}
}
