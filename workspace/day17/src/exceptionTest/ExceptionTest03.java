package exceptionTest;

public class ExceptionTest03 {
   public static void main(String[] args) {

      ExceptionTest03 et = new ExceptionTest03();
      System.out.println("프로그램 시작");
      et.printLength("java");
      et.printLength(null);
      System.out.println("프로그램 종료");

   }

   public void printLength(String data) {
      try {
         int result = data.length();
         System.out.println("글자수 : " + result);
      } catch (NullPointerException e) {
//         System.out.println("null값은 입력 불가능합니다");
         // 예외 정보를 얻는 방법 3가지
//         1. e.toString(); e => 예외 종류(클래스)와 발생한 이유 반환
//         System.out.println(e.toString());
//         System.out.println(e);

//         2. e.printStackTrace(); => 예외가 어디서 발생했는지 추적한 내용까지 출력
//         e.printStackTrace();

//         3. e.getMessage(); => 예외가 발생한 이유만 반환
         System.out.println(e.getMessage());

      } catch (Exception e) {
         //우리가 try에서 어떤 오류가 발생할 지 전부 예상하기 힘들다
         //예상치 못한 오류를 잡기 위해 Exception 타입의 매개변수를 사용한다
         //모든 예외 클래스의 조상은 Exception 클래스이다
         //즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장 가능하다(업캐스팅)
         
         System.out.println("예상치 못한 오류");
      }

   }
}