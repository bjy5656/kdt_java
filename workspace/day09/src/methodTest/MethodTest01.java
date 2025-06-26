package methodTest;
//9번 : 메소드 정의
public class MethodTest01 {
	public static void main(String[] args) {
		//메소드 호출
//		add(10, 20);
		//메소드 선언부 앞에 static을 붙이지 않으면 메인 메소드가 메모리에 올라갈 시점에 같이 올라가지 않는다 
		
//		System.out.println(add(10,20));
	
		MethodTest01 mt1 = new MethodTest01();
		//MethodTest01의 모든 내용을 메모리에 올린다 
		
		System.out.println(mt1);
		//methodtest.MethodTest01@6e2c634b => [패키지명.클래스명]@주소값 
		System.out.println(mt1.add(10, 20));
		
		
	} 
	
	int add(int num1, int num2) {
		int result = num1 + num2; 
		return result;
	}
	//static을 붙이지 않으면 main 메소드가 메모리에 올라갈 때 같이 올라가지 않는다 
	
	//메소드 정의 순서 
	//1) 기능을 생각한다 (두 수를 더하는 기능) 
//		반환타입 메소드명(자료형 매개변수명){}
	//2) 반환타입이 생각나지 않는다면 우선 void를 작성한다 
//		void  메소드명() {}
	
	//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로)
//		add, sum, plus, ... 	
//		void add(자료형 매개변수){}
	
	//4) 매개변수를 생각한다(매개변수 2개) 
//		void add(int num1, int num2){}	//,기준으로 구분하며 각각 매개변수에 자료형을 지정해주어야 한다 
	
	//5) 실행할 문장을 작성한다 
//		void add(int num1, int num2){
//			int result = num1 + num2;
//		}
	
	//6) 리턴값을 생각한다 
//		void add(int num1, int num2){
//			int result = num1 + num2;
//			return result; 
//		}
	
	//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
//		int add(int num1, int num2) {
//			int result = num1 + num2;
//			return result;
//		}
	
	
}
