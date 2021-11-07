package ua.yaremechko.boardGame;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number players: ");
		int numberOfPlayers = sc.nextInt();

		if (numberOfPlayers == 2) {
			Game2Players game2Players = new Game2Players();
			game2Players.game();
		} else if (numberOfPlayers == 3) {
			Game3Players game3Players = new Game3Players();
			game3Players.game();
		}
	}
}
