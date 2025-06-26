package variableTest;
//5번 : 가변길이 매개변수
public class VariableTest02 {
   public static void main(String[] args) {
      VariableTest02 vt = new VariableTest02();
      vt.printNumbers("가변길이매개변수", 1);
      vt.printNumbers("가변길이매개변수", 1, 2);
      vt.printNumbers("가변길이매개변수", 1, 2, 3, 4, 5, 6);
   }
   
   void printNumbers(String name, int ... numbers) {
      System.out.println(numbers);
      int total = 0;
      for(int num : numbers) {
         total += num;
      }
      System.out.println(total);
      System.out.println(name);
   }
}
