package section05;
//응용문제 4번
import java.util.Random;
import java.util.Scanner;

public class Practice04 {
	//두 개의 주사위가 같은 값이 나올 때까지 while문을 사용해 반복하고, 
	//반복 횟수와 주사위 눈의 번호를 출력해 보세요.
	public static void main(String[] args) {
		//입력클래스 import 
		//Random 클래스 객체 생성
		//정수형 변수 4개 선언(주사위1, 주사위2, 반복횟수, 사용자입력번호), 기본값으로 초기화
		//do~while문 => 
		//	입력메시지 출력
		//	사용자입력번호 변수에 nextInt()로 번호 입력받고 대입 
		//	nextLine()으로 버퍼 비우기 
		//	if문 => 사용자입력번호가 1, 2가 아니면 실행
		//		출력(1, 2만 입력해주세요)
		//		continue;
		//	else~if문 => 사용자입력번호가 2이면 실행 
		//		출력(종료합니다)
		//		break;
		//	주사위1 변수에 1~6 중 난수 생성후 대입 
		//	주사위2 변수에 1~6 중 난수 생성후 대입 
		//	반복횟수++
		//	출력(반복 횟수, 주사위1, 주사위2)
		//	if문 => 주사위1이 주사위2와 같으면 실행 
		//		출력(같아졌습니다)
		//while(주사위1이 주사위2와 다르면 반복)
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int dice1 = 0, dice2 = 0, count = 0, input = 0;
		do {
			System.out.println("번호를 입력하세요.\n1 : 주사위 굴리기\n2 : 종료하기");
			input = sc.nextInt();
			sc.nextLine();
			if(input != 1 && input != 2) {
				System.out.println("1, 2만 입력해주세요!");
			}else if(input == 2) {
				System.out.println("종료합니다");
				break;
			}
			dice1 = random.nextInt(6)+1;
			dice2 = random.nextInt(6)+1;
			count++;
			System.out.println("반복 횟수 : " + count + ", 주사위 눈 1 : " + dice1 + ", 주사위 눈 2 : " + dice2);
			if(dice1 == dice2) {
				System.out.println("같아졌습니다!");
			}
		} while(dice1 != dice2);
		sc.close();
	}
}
