package review;

import java.util.Objects;

public class User {
	//필드 
	String name; 
	int age;
	
	//생성자 
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//메소드 
	//toString() : alt + shift + s + s 
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		//자기자신과 같은 경우 
		if (this == obj)
			return true;
		
		//이름이 같은 경우 => 같은 객체로 판단 
//		if(obj instanceof User) {
//			String other = ((User)obj).name;
//			if(this.name.length() == other.length()) {
//				for(int i = 0; i < this.name.length(); i++) {
//					if(this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
		
		//짧은 코드 가능 
		if(obj instanceof User) {
			String other = ((User)obj).name; 
			return this.name.equals(other);
		}
		return false;
		
//		if (!(obj instanceof User))
//			return false;
//		User other = (User) obj;
//		return age == other.age && Objects.equals(name, other.name);
	} 
	
	
	
}
