package homework15_백정이;

public class Main {
	public static void main(String[] args) {
		
		//Student 클래스 객체1 생성
		//Teacher 클래스 객체2 생성
		//Employee 클래스 객체3 생성
		//Person 타입 배열변수 선언, 3칸 배열 생성
		//각 객체를 배열에 저장하여 업 캐스팅 
		//for~each문 => 배열의 객체마다 반복
		//	객체의 introduce 메소드 호출 
		//	Main 클래스의 printInfo 호출하고 객체 대입 

		Student student = new Student("민영", true);
		Teacher teacher = new Teacher("만길");
		Employee employee = new Employee("지수");
		Person[] personArray = new Person[3];
		personArray[0] = student;
		personArray[1] = teacher;
		personArray[2] = employee;
		for(Person person : personArray) {
			person.introduce();
			Main.printInfo(person);
		}
		
	}
	
	//static 메소드 printInfo() 작성
	//객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행 
	//리턴타입 => void 
	//매개변수 => 업캐스팅된 Person 클래스 타입 객체
	//실행할문장 => 
	//if문 => 매개변수 instanceof Student타입이 true 
	//	Student로 다운캐스팅하여 객체의 study 메소드 호출
	//else if문 => 매개변수 instanceof Teacher타입이 true
	//	Teacher로 다운캐스팅하여 객체의 teach 메소드 호출
	//else문 
	//	Employee로 다운캐스팅하여 객체의 work 메소드 호출
	
	static void printInfo(Person person) {
		if(person instanceof Student) {
			((Student)person).study();
		}else if(person instanceof Teacher) {
			((Teacher)person).teach();
		}else {
			((Employee)person).work();
		}
	}
}
