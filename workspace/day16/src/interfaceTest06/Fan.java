package interfaceTest06;
//23번 : 어댑터클래스(메인클래스)
public interface Fan {
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0; 

	//메소드
	void on();
	void off();
	void turbo();
	
	//구현하는 클래스
	//CeilingFan 클래스 
	//3개 메소드 천장선풍기를 켭니다, 천장선풍기를 끕니다, 비워두기 
	//TableFan 클래스
	//탁자 선풍기를 켭니다, 탁자 선풍기를 끕니다, 비워두기 
	//TowerFan 클래스 
	//타워 선풍기를 켭니다, 타워 선풍기를 끕니다, 타워선풍기를 터보모드로 전환합니다
	
	
}
