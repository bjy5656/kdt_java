package interfaceTest06;

public class CeilingFan extends FanAdapter implements Fan{

	//메소드 오버라이딩
	@Override
	public void on() {
		System.out.println("천장선풍기를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("천장선풍기를 끕니다");
	}
	
	
	
}
