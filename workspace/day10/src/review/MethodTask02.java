package review;

import java.util.Scanner;

public class MethodTask02 {
   
   //1. 정수 1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
   //메소드명 : checkNum
   
   //1) 기능
   //2) 리턴타입 => void
   //3) 메소드명 => checkNum
   //4) 매개변수 => 정수형 변수1개
   //5) 실행할문장 => 삼항연산자
   //6) return => return 매개변수 % 2 == 0 ? "짝수입니다" : "홀수입니다"
   //7) 리턴타입 변경 => String
   String checkNum(int number) {
      return number % 2 == 0 ? "짝수입니다" : "홀수입니다";
   }
   
   //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
   // 메소드명 : getSum
   //1) 리턴타입 => void
   //2) 메소드명 => getSum
   //3) 매개변수 => int[] 매개변수명
   //4) 실행할문장(기능 구현) => 
   //      총합구할변수 선언
   //      for-each문(자료형 변수명 : 배열명){
   //         총합구할변수 += 변수명;
   //      }
   //5) return 총합구할변수
   //6) 리턴타입 => int

   int getSum(int[] numbers) {
      int total = 0;
      for(int num : numbers) {
         total += num;
      }
      return total;
   }
   
   //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
   //메소드명 : reverseStr
   // hello => olleh
   
   //1) char[]을 이용한 방식
   //리턴타입 => void
   //메소드명 => reverseStr1
   //매개변수 => String 1개
   //실행할문장 =>
   //   조건식(if문)   매개변수 == null
   //         { return; }
   //   int 변수1 = 매개변수명.length();
   //   문자형배열 변수2 = new char[변수1];
   //   반복문(for문) int i = 0; i < 변수1; i++
   //   {   변수1[i] = 매개변수.charAt(변수1 - 1 - i); }
   //return => 문자열변수 
   
   //매개변수 o, 리턴값 x 메소드 정의
   String resverseStr1(String str) {
//      if(str == null) {
//         return null;
//      }
      int len = str.length();
      char[] reverse = new char[len];
      String result = "";
      for(int i = 0; i < len; i++) {
         reverse[i] = str.charAt(len - 1 - i);
      }
      return new String(reverse);
   }
   
   //2) 뒤에서부터 문자를 하나씩 더해서 새로운 문자열 만드는 방식
   // 리턴타입 => void
   // 메소드명 => reverseStr2
   // 매개변수 => String str
   // 실행할 문장 => 
   //   조건문 if(str == null){ return null; }
   //   문자열 변수 선언
   //  반복문(for문) int i = str.length() -1; i >= 0; i-- 
   //      { 변수 += str.charAt(i); }
   // return => 변수
   // 리턴타입 변경 => String
   
   String reverseStr2(String str) {
      if(str == null) {
         return null;
      }
      String result ="";
      for(int i = str.length() - 1; i >= 0; i--) {
         result += str.charAt(i);
      }
      return result;
   }
   
   //3) char[] 새로 만들어서 앞뒤 바꿔서 복사하는 방식
   // 리턴타입 => void
   // 메소드명 => reverseStr3
   // 매개변수 => String str
   // 실행할 문장(기능구현)
   //      조건문if   str ==null {return null;}
   //      정수형 변수1 = str.length();
   //      문자형배열 변수2 = new char[변수1];
   //      반복문for문 int i = 0; i < 변수1; i++
   //      {   변수2 = str.charAt(변수1 - 1 - i); }
   //      String 변수3 = ""
   //      for-each
   //      for(char 변수 : 변수2){
   //         변수3 += 변수;
   //      }
   //   리턴타입 변수3; String타입으로 변경
   String reverseStr3(String str) {
      if(str == null) {
         return null;
      }
      
      int len = str.length();
      char[] reverse = new char[len];
      
      for(int i = 0; i < len; i++) {
         reverse[i] = str.charAt(len - 1 - i);
      }
      String result= "";
      for(char c : reverse) {
         result += c;
      }
      return result;
   }
   
//   //4) 메소드를 이용하는 방식
   String reverseStr4(String str) {
      return new StringBuilder(str).reverse().toString();
   }
   
   //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
   //메소드명 : contains
   //배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
   //   syso(메소드명(배열명, 10)) => true
   
   // 리턴타입 => void -> boolean
   // 메소드명 => contains
   // 매개변수 => 정수형배열 1개, 정수형변수 1개
   // 구현부{
   //      if(매개변수1 == null){
   //         return false; }
   //      for(정수형 변수 : 배열명){
   //         조건문(if문) 변수 == 정수형변수 {
   //            return true;
   //         }
   //      }
   //      return false;
   //   }
   
   boolean contains(int[] arr, int num) {
      if(arr == null) {
         return false;
      }
      for(int i : arr) {
         if(i == num) {
            return true;
         }
      }
      return false;
   }
   
   //7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
   //loginTry
   //리턴타입 => void => String
   //메소드명 =>  loginTry
   //매개변수 => 문자열 2개
   //구현부 => 
   //      고정값 id, pw 선언(상수)
   //      횟수 확인할 변수1 선언
   //      if문 변수1 >= 3
   //         return 계정잠금
   //      if문 상수id.equals(매개변수id) && 상수pw.equals(매개변수pw)
   //         변수1 초기화
   //         return 로그인 성공
   //      else{
   //         변수1++
   //         if(변수1 >= 3){
   //         return 계정잠금}
   //      return 로그인실패
   //      }
   //}}
   
   //메소드 밖에서 클래스 안에 변수 선언
//   int tryCount = 0;
//   
//   String loginTry(String inputId, String inputPw) {
//      final String ID = "admin";
//      final String PW = "1234";
//      System.out.println(tryCount + "번");
//      if(tryCount >= 3) {
//         return "계정잠금";
//      }
//      if(ID.equals(inputId) && PW.equals(inputPw)) {
//         tryCount = 0;
//         return "로그인 성공";
//      }else {
//         if(tryCount >= 3) {
//            return "계정잠금";
//         }
//         tryCount++;
//         System.out.println(tryCount);
//         return "로그인실패";
//      }
//   }
   
   //loginTry(검증만)
   String loginTry1(String inputId, String inputPw) {
      final String ID = "admin";
      final String PW = "admin";
      
      if(ID.equals(inputId) && PW.equals(inputPw)) {
         return "로그인성공";
      }
      return "로그인 실패";
   }
   

   public static void main(String[] args) {
      MethodTask02 mt = new MethodTask02();
      
      System.out.println("----------1번---------");
      //매개변수 o, 리턴값 o => syso(객체명.메소드명(인수));
//      System.out.println(mt.checkNum(10));
//      System.out.println(mt.checkNum(-7));
      
      System.out.println("----------2번---------");
      //매개변수 o, 리턴값 o => syso(객체명.메소드명(인수));
      
//      System.out.println(mt.getSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
//      int[] numbers = {10, 20, 10, 20, 10, 20, 10, 20, 10, 20};
//      System.out.println(mt.getSum(numbers));
      
      System.out.println("----------3번-1---------");
//      System.out.println(mt.resverseStr1(null));
//      System.out.println(mt.reverseStr4("철수"));
      
      System.out.println("----------4번----------");
      int[] ar = {1, 2, 3, 10};
      System.out.println(mt.contains(null, 0));
      System.out.println(mt.contains(ar, 10));
   
      System.out.println("----------7번----------");
//      System.out.println(mt.loginTry("admin", "1234"));
//      System.out.println(mt.loginTry("admin", "12345")); //1회실패
//      System.out.println(mt.loginTry("admin", "12345")); //2회실패
//      System.out.println(mt.loginTry("admin", "12345")); //3회실패=>잠금
//      System.out.println(mt.loginTry("admin", "12345")); //3회실패=>잠금
      
      int tryCount = 0;
      String id, passwd, result;
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         System.out.println("아이디 입력 : ");
         id = sc.nextLine();
         System.out.println("비밀번호 입력 : ");
         passwd = sc.nextLine();
         
         result = mt.loginTry1(id, passwd);
         
         if(result.equals("로그인 성공")) {
            System.out.println("로그인 성공");
            break;
         }else {
            tryCount++;
            if(tryCount >= 3) {
               System.out.println("3회 이상 실패로 계정 잠금");
               break;
            }
            System.out.println("로그인 실패");
         }
      }
      sc.close();
      
   }

   
   


   
   //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
   //메소드명 : printGugudan
   //   3 x 1 = 3
   //   ...
   //   3 x 19 = _
   
   //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
   //메소드명 : compareLength
   

   

}
