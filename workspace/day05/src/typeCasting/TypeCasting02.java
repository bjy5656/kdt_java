package typeCasting;
//3번 : 문자열 자료형 -> 다른 기본 자료형으로 
public class TypeCasting02 {
	public static void main(String[] args) {
		//기본자료형 -> 문자열 자료형 
		String str1 = 3 + ""; 
		String str2 = 6.17 + ""; 
		String str3 = "hello" + ""; 
		String str4 = true + "";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//문자열 -> 기본자료형으로 
		int number1 = Integer.parseInt(str1);
		System.out.println(number1);
		double number2 = Double.parseDouble(str2);
		System.out.println(number2);
		boolean isTrue2 = Boolean.parseBoolean(str4);
		System.out.println(isTrue2);
		char ch = str3.charAt(6);
		System.out.println(ch);
	}
}
