package ua.yaremechko.boardGame;

import java.util.Scanner;

public class Game3Players {

	Scanner sc = new Scanner(System.in);

	public Game3Players() {
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

		System.out.println("Enter name Player Two: ");
		String namePlayerThree = sc.next();

		Step3Players step3Players = new Step3Players(namePlayer, namePlayerTwo, namePlayerThree);

		while (b) {

			step3Players.resultGame();

			step3Players.step();

			System.out.println(namePlayerTwo + " -" + step3Players.getRoadPlayerTwo());
			System.out.println(namePlayerThree + " -" + step3Players.getRoadPlayerThree());
			System.out.print(namePlayer + " -" + step3Players.getRoadPlayerOne());
			step3Players.stepAdd();
			System.out.println();

			step3Players.setRoadPlayerOne(step3Players.getRoadPlayerOne() + step3Players.getRoad());

			if (step3Players.getRoadPlayerOne().length() >= game) {
				System.out.println();
				System.out.println("PLAYER " + namePlayer.toUpperCase() + " WIN!!!");
				step3Players.resultGame();

				b = false;

			} else {

				step3Players.resultGame();

				step3Players.step();

				System.out.println(namePlayer + " -" + step3Players.getRoadPlayerOne());
				System.out.println(namePlayerThree + " -" + step3Players.getRoadPlayerThree());
				System.out.print(namePlayerTwo + " -" + step3Players.getRoadPlayerTwo());
				step3Players.stepAdd();
				System.out.println();

				step3Players.setRoadPlayerTwo(step3Players.getRoadPlayerTwo() + step3Players.getRoad());
				if (step3Players.getRoadPlayerTwo().length() >= game) {
					System.out.println();
					System.out.println("PLAYER " + namePlayerTwo.toUpperCase() + " WIN!!!");
					step3Players.resultGame();

					b = false;

				} else {

					step3Players.resultGame();

					step3Players.step();

					System.out.println(namePlayer + " -" + step3Players.getRoadPlayerOne());
					System.out.println(namePlayerTwo + " -" + step3Players.getRoadPlayerTwo());
					System.out.print(namePlayerThree + " -" + step3Players.getRoadPlayerThree());
					step3Players.stepAdd();
					System.out.println();

					step3Players.setRoadPlayerThree(step3Players.getRoadPlayerThree() + step3Players.getRoad());
					if (step3Players.getRoadPlayerThree().length() >= game) {
						System.out.println();
						System.out.println("PLAYER " + namePlayerThree.toUpperCase() + " WIN!!!");
						step3Players.resultGame();

						b = false;

					}
				}
			}
		}
	}

}
