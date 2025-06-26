package teamTask;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GameRewrite game = new GameRewrite();
		game.getStart(sc);
		
	}
}
