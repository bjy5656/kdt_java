package 보충과제_백정이;

public class Person {
	// 필드
	String name;
	int age;
	int score;

	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//생성자 오버로딩 
	public Person(String name, int age, int score) {
		this(name, age);
		this.score = score;
	}


	// toString 재정의
	@Override
	public String toString() {
		return name + " [ " + age + "살 ]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
//		Person person = (Person)obj; //다운캐스팅

		return this.age == ((Person) obj).age && this.name.equals(((Person) obj).name);
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age * 31;
	}

}
