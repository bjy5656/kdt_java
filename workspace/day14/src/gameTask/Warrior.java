package gameTask;
//Character 클래스 상속
public class Warrior extends Character {

	
	//필드 
	
	//생성자 
	public Warrior() {
		this("전사", 30, 10, 5, 15, 100);
	}

	public Warrior(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
		super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
	}

	//메소드 
	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		super.specialAttack();
	}

	public void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다");
	}
	
	
	
}
