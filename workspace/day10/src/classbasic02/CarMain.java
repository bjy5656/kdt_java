package classbasic02;
//11번 : Car 클래스 main
public class CarMain {
	public static void main(String[] args) {
		//객체화(인스턴스화)
		Car myCar = new Car();
		
		myCar.model = "Tesla Model 3";
		myCar.color = "blue";
		myCar.speed = 0;
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.accelerate(120);
		myCar.accelerate(180);
		
		myCar.stop();
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.decrease();
	}
}
