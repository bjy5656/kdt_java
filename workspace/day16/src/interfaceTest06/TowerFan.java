package interfaceTest06;

public class TowerFan implements Fan{

	//메소드 오버라이딩 
	@Override
	public void on() {
		System.out.println("타워 선풍기를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("타워 선풍기를 끕니다");
	}

	@Override
	public void turbo() {
		System.out.println("타워선풍기를 터보모드로 전환합니다");
	}

	
}
