package 능력단위평가Java5번;

import java.util.Objects;

//(3)Student 클래스 정의 
public class Student extends Person {	//Person 클래스를 상속받는다
	
	//필드
	int studentNumber;	//학번 필드 추가 
	int javaScore; 
	int dbmsScore; 
	int htmlScore; 
	Major major;
	
	//생성자
	public Student(int studentNumber, String name, Major major, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.studentNumber = studentNumber;	//생성자로 초기화하도록 추가
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	} 
	
	//toString() 오버라이딩
	//학생객체를 출력하면 각 과목의 점수, 총점, 평균 정보가 나오도록 오버라이딩 
	@Override
	public String toString() {
		return "[" + this.name + "님의 성적 정보 출력]\n"
				+ this.name + "님의 전공은 " + this.major + "입니다\n"
				+ "Java 점수 : " + this.javaScore
				+ "\nDBMS 점수 : " + this.dbmsScore
				+ "\nHTML 점수 : " + this.htmlScore
				+ "총점 : " + getTotalScore()
				+ "평균 : " + getAverageScore();
	}
	
	//equals() 오버라이딩 
	//학번과 이름을 기준으로 같은 학생인지 판단 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			String str = ((Student)obj).name;
			String num = ((Student)obj).studentNumber + "";
			return this.name.equals(str) && (this.studentNumber + "").equals(num);
		}
		return false;
	}
	
	//hashCode() 오버라이딩 
	//학번을 반환하도록 재정의
	@Override
	public int hashCode() {
		return this.studentNumber;
	}
	
	//메소드 
	//getTotalScore() - 총접 반환 
	//리턴타입 => int 
	//매개변수 x
	//실행할문장 => 
	//정수형 변수 선언(총점), 기본값으로 초기화 
	//객체의 세 과목 점수 합을 총점에 대입 
	//return 총점 
	int getTotalScore() {
		int totalScore = 0; 
		totalScore = this.javaScore + this.dbmsScore + this.htmlScore;
		return totalScore;
	}
	


	//getAverageScore() - 정수 평균 반환 
	//리턴타입 => int 
	//매개변수 x
	//실행할문장 => 
	//정수형 변수 선언(평균), 기본값으로 초기화 
	//객체의 세 과목 점수 합 나누기 3을 평균에 대입 
	//return 평균
	int getAverageScore() {
		int averageScore = 0;
		averageScore = (this.javaScore + this.dbmsScore + this.htmlScore) / 3;
		return averageScore;
	}
	
	//getMajor() - 전공 반환 
	//리턴타입 => Major
	//매개변수 x
	//실행할문장 => 
	//return 객체의 전공 
	Major getMajor() {
		return this.major;
	}
	
}
