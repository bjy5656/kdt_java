package iftest;
//13번 : if~if문, if~else if문 차이 / if문 중첩 
public class IfTest04 { //클래스 시작 
	public static void main(String[] args) { //main 메소드 시작
		//if~if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100; //int 변수 num, grade에 10, 100 대입 
		if(num > 5) { //if문 시작, num(10) > 5 가 true이므로 실행  
			System.out.println("num은 5보다 큽니다"); //메시지 출력 
		} //if문 종료
		if(num >3) { //if문 시작, num(10) > 3 가 true이므로 실행 
			System.out.println("num은 3보다 큽니다"); //메시지 출력 
		} //if문 종료
		
		//if~else if문 : 위의 조건식이 true면 아래 있는 조건식은 무시된다 
		if(num > 5) { //if문 시작, num(10) > 5가 true이므로 실행  
			System.out.println("num은 5보다 큽니다"); //메시지 출력 
		}else if(num > 3) { //else if문 시작, 앞 if문이 실행되었으므로 num(10) > 3 이 true이지만 실행되지 않음 
			System.out.println("num은 3보다 큽니다"); //메시지 출력 
		} //else if문 종료
		
		//if문 중첩 
		//90점 이상은 A, 100점은 만점으로 A 출력 
		if(grade == 100) { //if문 시작부분, grade(100) == 100 이 true이므로 실행 
			System.out.println("만점으로 A"); //메시지 출력 
		
		}else if(grade >= 90) { //else if문 시작부분, grade(10) >= 90이 true이지만 앞의 if문이 실행되었으므로 실행되지 않음
			System.out.println("A"); //메시지 출력 
		} //else if문 종료부분
		
		if(grade >= 90) { //if문 시작부분, grade(100) >= 90 이 true이므로 실행 
			if(grade == 100) { //중첩 if문 시작부분, grade(100) == 100 이 true이므로 실행 
				System.out.println("만점으로 A");	//메시지 출력 
			}else { //if문 안의 else문 시작부분, 앞의 if문이 실행되었으므로 실행되지 않음
			System.out.println("A");
			}//if문 안의 else문 종료부분
		}//if문 종료부분
		
		
	} //main 메소드 종료 	
	
} //클래스 종료 
