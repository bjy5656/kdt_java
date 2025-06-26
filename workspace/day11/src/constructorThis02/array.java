package constructorThis02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
		//문자열
		//for 
		boolean isTrue = true;
		int count = 0;
		int countStr = 0;
		String str = "";
		String word = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 개수 입력 : ");
		countStr = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < countStr; i++) {
			System.out.println("문자열 입력 : ");
			str = sc.nextLine();
			word = "" + str.charAt(0);
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) != word.charAt(word.length()-1)) {
					word += str.charAt(j);
					for (int k = 0; k < word.length()-1; k++) {
						if(word.charAt(k) == str.charAt(j)){
							isTrue = false;
						}
					}
				}
			}
		if(isTrue) {
			count++;
		}
		isTrue = true;
		}
		System.out.println(count);
		
		
		
	}
}
