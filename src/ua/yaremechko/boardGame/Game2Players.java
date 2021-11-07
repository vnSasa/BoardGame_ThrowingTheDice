package ua.yaremechko.boardGame;

import java.util.Scanner;

public class Game2Players {

	Scanner sc = new Scanner(System.in);

	public Game2Players() {
		super();
	}

	public void game() {

		Boolean b = true;
		System.out.println("Enter length of game:");
		int game = sc.nextInt();

		System.out.println();

		System.out.println("Enter name Player One: ");
		String namePlayer = sc.next();

		System.out.println("Enter name Player Two: ");
		String namePlayerTwo = sc.next();

		Step2Players step2Players = new Step2Players(namePlayer, namePlayerTwo);

		while (b) {

			step2Players.resultGame();

			step2Players.step();

			System.out.println(namePlayerTwo + " -" + step2Players.getRoadPlayerTwo());
			System.out.print(namePlayer + " -" + step2Players.getRoadPlayerOne());
			step2Players.stepAdd();
			System.out.println();

			step2Players.setRoadPlayerOne(step2Players.getRoadPlayerOne() + step2Players.getRoad());

			if (step2Players.getRoadPlayerOne().length() >= game) {
				System.out.println();
				System.out.println("PLAYER " + namePlayer.toUpperCase() + " WIN!!!");

				b = false;

			} else {

				step2Players.resultGame();

				step2Players.step();

				System.out.println(namePlayer + " -" + step2Players.getRoadPlayerOne());
				System.out.print(namePlayerTwo + " -" + step2Players.getRoadPlayerTwo());
				step2Players.stepAdd();
				System.out.println();

				step2Players.setRoadPlayerTwo(step2Players.getRoadPlayerTwo() + step2Players.getRoad());
				if (step2Players.getRoadPlayerTwo().length() >= game) {
					System.out.println();
					System.out.println("PLAYER " + namePlayerTwo.toUpperCase() + " WIN!!!");

					b = false;

				}
			}
		}
	}

}
