package review;

public class LambdaMain {
	public static void main(String[] args) {
		CombInter c = new CombInter() {

			@Override
			public String connect(String str1, String str2) {
				
				return str1 + str2;
			}
			
		};
		
		
		CombInter cc = (str1, str2) -> str1 + str2;
		System.out.println(cc.connect("철수와", "영희"));
	}
}
