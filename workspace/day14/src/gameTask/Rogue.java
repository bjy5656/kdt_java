package gameTask;
//Character 클래스 상속
public class Rogue extends Character{

	
	//필드
	
	//생성자 
	public Rogue() {
		this("로그", 20, 20, 3, 20, 0);
	}

	public Rogue(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
		super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
	}

	//메소드 
	@Override
	public void normalAttack() {
		// TODO Auto-generated method stub
		super.normalAttack();
	}

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
	
//	Random r = new Random();
//    int dmg = randomDmg[r.nextInt(randomDmg.length)];
	
}
