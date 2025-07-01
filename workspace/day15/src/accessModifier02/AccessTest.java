package accessModifier02;

import accessModifier01.AccessTarget;

public class AccessTest extends AccessTarget{

   public AccessTest() {
//      super();
      super.protectedMethod(); //상속 통해 접근 가능
      this.protectedMethod(); //현재 클래스의 객체 통해 접근 가능
   }
   
   public void testAccess() {
//      AccessTarget at = new AccessTarget("test"); //protected 생성자 접근 불가
      this.protectedMethod(); // 상속통해 접근 가능
   }
   
}
