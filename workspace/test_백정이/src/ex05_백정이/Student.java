package ex05_백정이;

//(3)Student 클래스 정의 
public class Student extends Person {	//Person 클래스를 상속받는다
	
	//필드
	int javaScore; 
	int dbmsScore; 
	int htmlScore; 
	Major major;
	
	//생성자
	public Student(String name, Major major, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
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
