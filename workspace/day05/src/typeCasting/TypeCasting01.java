package typeCasting;

public class TypeCasting01 {
	public static void main(String[] args) {
		int num1 = 10;
		float num2 = 6.17f;
		long num3 = 30L;
		double num4 = 6.17;
		boolean isTrue = true; 
		char alpha = 'a';
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(isTrue);
		System.out.println(alpha);
		
		System.out.println(num1 + num3); //정수 + 정수 = 정수 
		System.out.println(num2 + num4); //정수 + 정수 = 정수
		System.out.println(num1 + num4); //정수 + 실수 = 실수  
	
		String result1 = num1 + num3 + ""; //40, num1과 num3를 더한 후 문자열로 형변환된다
											//10 + 30 => 40 + "" => "40"
		String result2 = "" + num1 + num3; //1030, num1이 먼저 형변환되고, num3이 형변환된 후 연결된다
											//"10" + 30 => "1030"
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(isTrue + "");
		System.out.println(alpha + "");
		
		String result3 = num1 + "넘1";
		System.out.println(result3);
	}
}
