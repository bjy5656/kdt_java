package day09;

public class ArrayTask02 {
	public static void main(String[] args) {
//		2. 1~10까지의 값을 배열에 넣고 총 합을 입력 
		
		//1) 10칸짜리 배열 선언
		//2) 총합구할 변수 선언 
		//3) for문(1부터 10까지 저장)
		//		int i = 0; => 배열명[i] = i + 1; 
		// 		총합구할 변수 += 배열명[i];
		//4) 총합 출력
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;	//arr[0] = 0 + 1;
							//arr[9] ] = 9 + 1;
			sum += arr[i];
			System.out.println("1부터 "+ + (i + 1) + "까지의 총합 : " +  sum);
		}
		
		System.out.println("1부터 10까지의 총합 : " + sum);
		
		
	}
}
