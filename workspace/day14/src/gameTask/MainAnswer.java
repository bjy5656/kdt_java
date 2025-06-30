package gameTask;

import java.util.Scanner;

public class MainAnswer {
   public static void main(String[] args) {
//      사용자에게 캐릭터를 선택하게 하고 1. 마법사, 2. 전사, 3. 로그
//      선택한 캐릭터로 반복적으로 메뉴 실행
//      1. 기본공격, 2. 스킬공격, 3. 특수공격, 4. 종료

      //1) 입력클래스 import
      Scanner sc = new Scanner(System.in);
      //2) Wizard 객체 생성 마법사, 전사, 로그 = null;
      Character character = null;
      Wizard wizard = null;
      Warrior warrior = null;
      Rogue rogue = null;
      //3) 반복문(while (true))
      while(true) {
         //   3-1) 캐릭터 선택 메시지 출력
         //   syso(1. 마법사);
         //   ...syso(선택 : );
         System.out.println("캐릭터를 선택하세요.\n" 
               + "1. 마법사\n"
               + "2. 전사\n"
               + "3. 로그\n"
               + "입력 : ");
         //   3-2) int choice = sc.nextInt();
         int choice = sc.nextInt(); //지역변수(인스턴스 변수)
         //   3-3) sc.nextLine(); 버퍼지우기
         sc.nextLine();
         //   3-4) switch or if문
         //      객체명 = new 생성자();
         if(choice == 1) {
            wizard = new Wizard();
            break;
         }else if(choice == 2) {
            warrior = new Warrior();
         }else if(choice == 3) {
            rogue = new Rogue();
         }else {
            System.out.println("번호를 다시 입력하세요");
         }
      }

      //4) String 변수 = 메뉴 출력 메시지
      String msg = "\n1. 일반공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n번호입력 : ";
//      System.out.println(msg);
      //5) 반복문(while (true))
      while (true) {
         //   5-1) 메뉴 출력
         System.out.println(msg);
         //   5-2) choice = sc.nextInt();
         int choice = sc.nextInt(); //지역변수(인스턴스 변수)
         //   5-3) switch (choice)
         switch(choice) {
         //   5-4) case 1:
         //   5-5) 객체명.normalAttack;
         //    5-6) break;
         //   ...    case 4:
         //         syso("게임종료);
         //         sc.close();
         //         return;
         //
         case 1:
            wizard.normalAttack();
            break;
         case 2:
            wizard.skillAttack();
            break;
         case 3:
            wizard.specialAttack();
            break;
         case 4:
            System.out.println("게임종료");
            sc.close();
            return;
         default:
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            
         }

      }

      
   }
}
