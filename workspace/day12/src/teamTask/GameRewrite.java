package teamTask;

import java.util.Scanner;

public class GameRewrite {

	int answer; // 정답
	int level; // 난이도
	int tryCount; // 시도 횟수
	int limit; // 입력제한수
	int input;
	boolean setHintRange = true;
	int rn1;
	int rn2;

	void setLevel(Scanner sc) {

		while (true) {
			System.out.print("난이도를 입력하세요 (1부터 5까지!): ");
			this.level = sc.nextInt();
			sc.nextLine(); // 버퍼지우기...
			if (this.level <= 5 && level > 0) {
				this.answer = (int) (Math.random() * this.level * 20);
				System.out.println("난이도는 " + this.level + "이고, 정답은 " + this.answer + "입니다.");
				System.out.println("범위는 1부터 " + this.level * 20 + "까지 입니다.");
				this.limit = this.level * 5;
				System.out.println("최대 시도 횟수는 " + this.limit + "입니다.");
				break;
			} else {
				System.out.println("범위를 잘못 입력했습니다!!!!");

			}
		}
	}

	boolean checkAnswer() {
		if (this.input == this.answer) {
			System.out.println("정답입니다!!");
			return true;
		} else {
			System.out.println("틀렸습니다!!");
			return false;
		}
	}

	void getHint() {
		if (this.input > this.answer) {
			System.out.println("!!!!!!!!!!!!!!!!정답보다 큰수를 입력했습니다!!");
		} else {
			System.out.println("!!!!!!!!!!!!!!!!!!정답보다 작은를 입력했습니다!!");
		}

		do {
			this.rn1 = (int) (Math.random() * 10); // 3 5
			this.rn2 = (int) (Math.random() * 10); // 3 5
			this.setHintRange = false;
		} while (setHintRange);

		if (this.tryCount == this.limit - 1) {
			this.setHintRange = true;
		}

		System.out.printf("정답은 %d에서 %d사이에 있습니다.\n", this.answer - this.rn1, this.answer + this.rn2);

		System.out.printf("%d번 시도했습니다. %d번 남았습니다.\n", this.tryCount + 1, this.limit - this.tryCount - 1);

	}

	void getStart(Scanner sc) {
		setLevel(sc);
		while (true) {
			System.out.print("숫자를 맞춰주세요!!! 입력 : ");
			input = sc.nextInt();
			System.out.println(input + "을 입력하셨습니다.");
			if (input < 1 || input > (this.level * 20)) {
				System.out.println("!!!!!!!!범위를 벗어난 입력입니다.!!!!!!!!!");
			} else {
				System.out.println(tryCount + "번 입력을 했습니다!");
				if (checkAnswer()) {
					break;
				}
				if (this.limit / 2 <= tryCount && tryCount < this.limit - 1) {
					getHint();
				}
			}
			tryCount++;

			if (tryCount == this.limit) {
				System.out.println("시도횟수를 초과했습니다!");
				break;
			}

		}

		quit();

	}

	void quit() {
		System.out.println("종료합니다!!!");
	}
}
