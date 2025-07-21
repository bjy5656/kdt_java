package 보충과제_백정이;

public class Employee extends Person{

	//필드

	//생성자 
	public Employee(String name, int age) {
		super(name, age);
	}

	//메소드 오버라이딩 
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj instanceof Employee) {
			return this.name.equals(((Employee)obj).name) && this.age == ((Employee)obj).age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 31 * name.hashCode() + age;
	}
	
	
	
}
