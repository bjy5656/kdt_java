package print;
//9번 : printf() 출력메소드 
public class PrintTest02 {
	public static void main(String[] args) {
		
//		String name = "백정이";
//		int age = 26; 
//		System.out.println("제 이름은 백정이이고, 나이는 26살 입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
//		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.", name, age);
		
		//정수형 
		int num1 = 200;
		System.out.printf("10진수 :  %d\n", num1);
		System.out.printf("10진수 : %d\n", 10);
		System.out.printf("8진수 : %o", 7);
		System.out.printf("16진수 : %x", 16); //16진수는 10 A, 11 B, .. 16 F, 17 => 10 
		
		//실수형 
		System.out.printf("\n실수형 : %f\n", 3.1234567);
		//float 타입 => 소수점이하 6자리까지 정확하게 나옴, 7자리이상이면 7번째 자리에서 반올림, %f를 썼으므로 float로 적용됨 
		//double 타입 => 소수점이하 15자리까지
		System.out.printf("\n실수형 2자리까지 표현 : %.2f\n", 3.12345);
		
		//문자형 
		System.out.printf("\n문자형 : %c", 'a');
		
		//문자열 
		System.out.printf("\n문자열 : %s\n", "hello");
		String data = "hello, java"; 
		System.out.println(data);
		System.out.printf("문자열 : %.5s", data);
		
		//논리형(형식지정자 x) 
		System.out.printf("\n논리형 : %s", true);
		System.out.printf("\n논리형 : %.1s", true);
	}
}
