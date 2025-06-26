package scanner;

import java.util.Scanner;

//11번 : 두 정수를 입력받아 합을 출력하기(next() 메소드 사용하기) 
public class ScannerTask03 {
	public static void main(String[] args) {
		
//		//로직구성 
//		String msg1 = "정수 1 입력 : ", msg2 = "정수2 입력 : ";
//		//1) 입력클래스 선언, import 
//		Scanner sc = new Scanner(System.in);
//		
//		//2) 정수형 변수 선언(n1, n2, sum) 
//		int n1, n2, sum;
//		
//		//3) syso(msg1), next()로 입력받고 n1에 형변환한 후 대입 
//		System.out.println(msg1);
//		n1 = Integer.parseInt(sc.next());  
//		
//		//4) syso(msg2), next()로 입력받고 n2에 형변환한 후 대입 
//		System.out.println(msg2);
//		n2 = Integer.parseInt(sc.next());  
//		
//		//5) sum = n1 + n2 
//		sum = n1 + n2;
//		
//		//6) syso("두 정수의 합 : "+sum)
//		System.out.println("두 정수의 합 : "+sum);
//		
//		//7) 입력클래스 닫기 
//		sc.close();
		
		
		
		
		//로직구성 
		String msg1 = "정수 1 입력 : ", msg2 = "정수2 입력 : ";
		//1) 입력클래스 선언, import 
		Scanner sc = new Scanner(System.in);
		
		//2) 정수형 변수 선언(n1, n2, sum) 
		int num1, num2, result;
		
		//3) syso(msg1), next()로 입력받고 n1에 형변환한 후 대입 
		System.out.println(msg1);
//		num1 = Integer.parseInt(sc.next());
		num1 = sc.nextInt();
		
		//4) syso(msg2), next()로 입력받고 n2에 형변환한 후 대입 
		System.out.println(msg2);
//		num2 = Integer.parseInt(sc.next());  
		num2 = sc.nextInt();
		
		//5) sum = n1 + n2 
		result = num1 + num2; //반복적으로 사용할 변수라면 선언하고 일시적으로 사용한다면 변수 선언 하지 않는다. 
		
		//6) syso("두 정수의 합 : "+sum)
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		//7) 입력클래스 닫기 
		sc.close();
	}
}














