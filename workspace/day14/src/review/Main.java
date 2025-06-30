package review;

class Animal{
	//필드 
	String name; 
	int age;
	
	//생성자 
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	
	//메소드
	void eat(String food) {
		System.out.printf("%s이/가 %s을 먹습니다\n", this.name, food);
	}
	
	void play() {
		System.out.printf("%s이/가 놀고있습니다\n", this.name);
	}
	
	void sleep() {
		System.out.printf("%s이/가 잠을 잡니다\n", this.name);
	}
	
	void sleep(int time) {
		System.out.printf("%s이/가 %d시에 잠을 잡니다\n", this.name, time);
	}

}


public class Main {
	public static void main(String[] args) {
		//동물 클래스 작성
		//Animal 클래스 정의 
		//필드 : 이름(name), 나이(age)
		//생성자 매개변수 2개있는 생성자 
		//메소드
		//	eat(String food) 이름이 음식을 먹습니다 출력 
		//	play()			이름이 놀고있습니다 출력
		//	sleep()			이름이 잠을 잡니다 출력 
		//	sleep(int time)	이름이 몇시에 잠을 잡니다 출력 
		
		//main메소드에서 객체 2개 만들고 모든 메소드 호출하기 
		Animal a1 = new Animal("누렁이", 10);
		Animal a2 = new Animal("흰둥이", 9); 
		
		a1.eat("수박");
		a2.play();
		a1.sleep();
		a2.sleep(11);
		
		a2.eat("바나나");
		a2.sleep();
		a1.play();
		a1.sleep(9);
		
		
	}
}
