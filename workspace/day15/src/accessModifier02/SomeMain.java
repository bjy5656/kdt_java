package accessModifier02;

import accessModifier01.AccessTarget;

public class SomeMain {
   public static void main(String[] args) {
      System.out.println("======다른 패키지에서 접근======");
      AccessTarget a1 = new AccessTarget(); //public 생성자
//      AccessTarget a2 = new AccessTarget("hello"); //protected 생성자 - 직접 접근 불가
//      AccessTarget a3 = new AccessTarget(123); //default 생성자
//      AccessTarget a4 = new AccessTarget(3.14); //private 생성자
      
      a1.publicMethod();
//      a1.defaultMethod(); //다른 패키지 + 직접 접근 불가
      
      AccessTest test = new AccessTest(); // 자식클래스
      test.testAccess(); // 상속으로 접근 가능
      
      double db = 3.11111111111111111111;
      float fl = 3.11f;
      System.out.printf("%f",db);
      System.out.println();
      System.out.println(fl);
      System.out.printf("\u0000");
      System.out.println();
      char c = ' ';
      int i = c;
      System.out.println(i);
   }
}
