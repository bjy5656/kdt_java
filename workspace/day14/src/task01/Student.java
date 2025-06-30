package task01;

public class Student extends Person{
	
	//필드 
	String studentNum;
	String major;
	
	
	//생성자
	public Student() {
		this("이름없음", 0, "값없음", "전공없음");
	} 
	
	
	public Student(String name, int age, String studentNum, String major) {
		super(name, age);
		this.studentNum = studentNum;
		this.major = major;
		System.out.println("student 생성자 호출");
	}


	@Override
	void introduce() {
		super.introduce();
		System.out.println("학번 : " + this.studentNum + ", 전공 : " + this.major);
		
	}

	

	
	
}
