package ex01_백정이;

public class Student extends Person{
	//필드 
	private int score;

	//생성자 
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	//메소드 
	public int getScore() {
		return score;
	}
	
	@Override
	public void socre() {
		System.out.println(getName() + "의 점수는 " + getScore() + "점입니다");
	}
	
}
