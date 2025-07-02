package interfaceTest02;

public class Hiphop implements Music {

	@Override
	public void mode() {
		System.out.println("힙합 모드");
	}

	void onlyHiphop() {
		System.out.println("오직 힙합만 실행");
	}
}
