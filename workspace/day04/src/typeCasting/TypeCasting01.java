package typeCasting;

//11번 : 자동 형변환 
public class TypeCasting01 {
	public static void main(String[] args) {

		// 1) 작은 자료형의 값을 큰 자료형으로 변환
		// int(4byte) -> long(8byte)
		int iVal = 100;
		long result1 = iVal;
		System.out.println(iVal);
		System.out.println(result1);

//	long lval = 100;

		// int(4byte) -> float(4byte)
		float result2 = iVal;
		System.out.println(result2);

		// int(4byte) -> double(8byte)
		double result3 = iVal;
		System.out.println(result3);

		// double(8byte) -> long(8byte)
//	long result4 = (long)result3;
		// result3은 100.0 실수 타입으로 정수형 변수에 담길 경우 손실이 발생하므로 자동형변환 불가능

		// float(4byte) -> double(8byte)
		double result4 = result2;
//	float result5 = result3;
		// double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문
		// double 타입 : 소수점 이하 15자리까지, float 타입 : 소수점 이하 6자리까지

		// 2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int iVal2 = 10;
		double dVal2 = 3.14;
		System.out.println(iVal2 + dVal2);
		double result6 = iVal2 + dVal2;
		System.out.println(result6);

		// 3) 문자형에서 정수형으로 변환
		char letter = 'a';
		int ascii = letter;
		System.out.println(letter);
		System.out.println(ascii);

		char letter2 = 'b';
		int ascii2 = letter2;
		System.out.println(letter2);
		System.out.println(ascii2);

		char letter3 = 'A';
		int ascii3 = letter3;
		System.out.println(letter3);
		System.out.println(ascii3);
		
		char letter4 = '가';
		int ascii4 = letter4;
		System.out.println(letter4);
		System.out.println(ascii4);
	}
}
