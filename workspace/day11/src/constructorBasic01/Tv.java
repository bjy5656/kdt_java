package constructorBasic01;

//1번 : 생성자 기초
public class Tv {
   // 필드
   // 채널, 볼륨, 전원, 색상, 브랜드
   boolean power; // 기본값 : false
   int ch;
   int vol;
   String color;
   String brand;
   
   //생성자 alt + shift + s + o
   //기본생성자 => 개발자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성한다
   public Tv() {
      
   }
//   10, 5, "LG", "black"
   //매개변수가 4개 있는 생성자
   public Tv(int ch, int vol, String color, String brand) {
      this.ch = ch;
      this.vol = vol;
      this.color = color;
      this.brand = brand;
   }
   
   // 메소드
   // 전원이 꺼져있으면 키고, 켜져있으면 끄는 메소드
   // 메소드명 : powerOnOff() 매개변수 x, 리턴값x
   void powerOnOff() {
      // 전원이 켜져있으면 끈다, 꺼져있으면 킨다
      power = !power;
      System.out.println("전원상태 : " + (power ? "켜짐" : "꺼짐"));
//      if(!power) {
//         System.out.println("전원상태 : 켜짐");
//      }else {
//         System.out.println("전원상태 : 꺼짐");
//      }
   }
   
   // 볼륨을 올릴 수 있는 메소드
   // 메소드명 : increaseVolume() 매개변수 x, 리턴값x
   // 1) if 전원이 켜져있는지 확인
   // 켜져있는경우 => 현재 볼륨 출력
   // 2) if 현재 볼륨이 99이하이면 볼륨을 1증가, 증가된 볼륨 출력
   // 3) else 현재 볼륨이 100이면 볼륨이 최대치입니다 출력
   // 4) else 꺼져있으면 전원을 먼저 켜주세요 출력
   void increaseVolumne() {
      if (power) {
         System.out.println("현재 볼륨 : " + vol);
         if (vol <= 99) {
            vol++;
            System.out.println("올린 후 현재 볼륨 : " + vol);
         } else {
            System.out.println("볼륨이 최대입니다");
         }
      } else {
         System.out.println("전원을 먼저 켜주세요");
      }
      
   }

   // 볼륨을 내릴 수 있는 메소드
   // 메소드명 : decreaseVolume() 매개변수 x, 리턴값x
   // 1) if전원이 켜져있는지 확인
   // 현재 볼륨 출력
   // 2) if( vol이 1보다 크거나 같을 때)
   // 볼륨 1 감소, 현재볼륨 출력
   // 3) else 현재 볼륨이 0일 때
   // 볼륨이 최소입니다 출력
   // 4) else 전원을 먼저 켜주세요 출력
   void decreaseVolume() {
      if (power) {
         System.out.println("현재볼륨 : " + vol);
         if (vol >= 1) {
            vol--;
            System.out.println("내린 후 현재 볼륨 : " + vol);
         } else {
            System.out.println("현재 볼륨이 0입니다");
         }
      } else {
         System.out.println("전원을 먼저 켜주세요");
      }
   }

   // 채널을 올리는 메소드
   // 메소드명 : nextChannel() 매개변수 x, 리턴값x
   void nextChannel() {
      if (power) {
         System.out.println("현재 채널 : " + ch);
         if (ch < 500) {
            ch++;
            System.out.println("올린 후 현재 채널 : " + ch);
         } else {
            System.out.println("채널의 끝입니다");
         }
      } else {
         System.out.println("전원을 먼저 켜주세요");
      }
   }

   // 채널 내리는 메소드
   // 메소드명 : previousChannel() 매개변수 x, 리턴값x
   void previousChannel() {
      if (power) {
         System.out.println("현재채널 : " + ch);
         if (ch >= 1) {
            ch--;
            System.out.println("내린 후 현재 채널 : " + ch);
         } else {
            System.out.println("현재 채널이 0번입니다");
         }
      } else {
         System.out.println("전원을 먼저 켜주세요");
      }
   }

}
