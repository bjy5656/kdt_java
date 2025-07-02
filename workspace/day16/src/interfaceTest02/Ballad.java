package interfaceTest02;

public class Ballad implements Music{

	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}

	void onlyBallad() {
		System.out.println("오직 발라드만 실행");
	}
	
	
}
