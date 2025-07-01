package casting04;

public class Main {
	public static void main(String[] args) {
		
		//업캐스팅
		Hero IronMan = new IronMan("아이언맨");
		IronMan.superPower(); // 업캐스팅 되어도 오버라이딩 된 메소드가 호출 

		Hero hulk = new Hero("헐크");
		hulk.superPower();
		
		//다운캐스팅 
		IronMan ironMan2 = (IronMan) IronMan;
		System.out.println(((Hulk)hulk));
	}
}
