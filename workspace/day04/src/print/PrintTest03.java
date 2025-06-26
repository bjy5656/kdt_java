package print;
//10번 : 서식문자의 옵션   printf()
public class PrintTest03 {
   public static void main(String[] args) {
      System.out.println("======================");
      // 기본 형식지정자
//      System.out.printf("이름 : %s, 나이 : %d\n", "김영선", 20);
//      System.out.printf("%d.%.2f 날씨 : %s\n", 2025, 6.16, "흐림");
//      System.out.printf("%s %c", true, 'a');

      // 자리수를 지정한 출력
      System.out.println("======================");
      // %[왼쪽 - or 0][n][.m]서식문자
      String subject = "java";
      System.out.printf("%10s\n", subject); //10자리 기준 오른쪽 정렬
      System.out.printf("%-10s\n", subject); //10자리 기준 왼쪽 정렬
      System.out.printf("%10s %05d\n", subject, 500);
      System.out.printf("%5s", "김영선");
      
      //상품명과 가격정렬
      System.out.println("\n\n===========메뉴=============");
      System.out.printf("%-5s\t\t%5d원", "꼬북칩", 2500);
      System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 3000);
      System.out.printf("\n%-5s\t\t%5d원", "껌", 800);
		
      
	      
      
      
   }
}





