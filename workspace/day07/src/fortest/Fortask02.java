package fortest;
//6번 : for문 연습
public class Fortask02 {
   public static void main(String[] args) {
      //for문만 사용
      //1. 100부터 1까지 출력(tab키로 띄어쓰기)
//      for (   초기식 int i = 0;
//            조건식 i < 100;
//            증감식 i++)
//      100 - i 출력

      for (int i = 0; i < 100; i++) {
         System.out.print(100 - i + "\t");
      }
      System.out.println();
      //2. 구구단 3단만 출력(3 x 1 ~ 3 x 9까지)
      
      //1) 변수선언(단을 설정할)
      //2) for문(1부터 9까지 곱해질 내용을 반복문으로 만들기)
      //      초기식 int i = 1   
      //      조건식 i < 10
      //      증감식 i++
      //3) 출력   단 x i = 결과 형태로 출력
      int dan = 3;
      for(int i = 1; i < 10; i++) {
         System.out.println(dan + " x " + i + " = " + (dan * i));
      }
      
      //3. A ~ F 출력(초기식 char i = 'A')
      for(char i = 'A'; i <= 70; i++ ) {
         System.out.print(i + " ");
      }
      System.out.println();
      for(char i = 'A'; i <= 'F'; i++ ) {
         System.out.print(i + " ");
      }
      System.out.println();
      //4. A ~ F 출력(초기식 int i = 0)
      for(int i = 0; i < 6; i++) {
         System.out.println((char)(i + 65));
      }
      
      //5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
      //홀수 => 소문자
      //짝수 => 대문자
      for(int i = 0; i < 26; i++) {
         if(i % 2 == 0) {
            System.out.print((char)(i + 97));
         }else {
            System.out.print((char)(i + 65));
         }
      }
      System.out.println();
      for(int i = 0; i < 26; i++) {
         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
      }
      
      //첫번째 반복문
      //초기식 i가 0, 조건식 0 < 26 true, 중괄호영역 (char)(97) => a, 증감식 i++ => i = 0 + 1
      //현재 i의 값 1
      //      조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => (char)66 => B, 증감식 i++ => i = 1 + 1
      //현재 i의 값 2
      //      조건식 2 < 26 true
      //..
      //현재 i의 값 25
      //   조건식 25 < 26   true, 중괄호 영역 (char)(25 % 2 == 0 false, 25 + 65) => (char)91, 증감식 i++ => 25 + 1
      //현재 i의 값 26
      //   조건식 26 < 26    false,    for문 탈출!
      
   }
}








