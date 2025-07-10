package review;

public class Student {
	//필드 
	String name; 
	int javaScore; 
	int dbmsScore; 
	int total;
	
	//생성자 
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}

	//메소드 
	@Override
	public String toString() {
		return "Student [name=" + name + ", javaScore=" + javaScore + ", dbmsScore=" + dbmsScore + ", total=" + total
				+ "]";
	} 
	
	
	
}
