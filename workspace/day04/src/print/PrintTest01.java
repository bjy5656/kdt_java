package print;
//8번 : println(), print() 출려메소드 
public class PrintTest01 {
	public static void main(String[] args) {
		//println() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈된다 
		System.out.println("\"println()\"는 출력메소드이다.");
		System.out.println("\n자동으로 줄바꿈된다\n");
		
		//print() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈 되지 않는다 
		System.out.print("\'print()\'도 출력메소드이다.");
		System.out.print("자동으로 줄바꿈되지 않는다.");
		
		System.out.println("java 수업중입니다");
		System.out.println("지금은 3시 11분입니다.");
	}
}
