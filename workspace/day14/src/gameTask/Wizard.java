package gameTask;

public class Wizard extends Character{

//   public Wizard(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
//      super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
//   }
   
//   기본 생성자를 통해 마법사, 15, 30, 1, 30, 0 전달
   public Wizard() {
      super("마법사", 15, 30, 1, 30, 0);
   }

   @Override
   public void normalAttack() {
//      normalAttack() 오버라이딩 : 체력 2 감소 후 공격 실행
//      super.normalAttack();
      hp -= 2;
      super.normalAttack();
      revive();
   }

   @Override
   public void skillAttack() {
//      skillAttack() 오버라이딩 : mp가 부족하면 출력 후 실패
      if(checkMp(10)) {
         super.skillAttack();
      }else {
         System.out.println("마나 부족으로 스킬사용 불가");
         showStatus();
      }
   }

//   specialAttack() 오버라이딩 : 마법사는 특수공격이 없습니다 출력
   @Override
   public void specialAttack() {
      System.out.println("마법사는 특수공격이 없습니다");
   }
   
}
