package ua.yaremechko.boardGame;

import java.util.Scanner;

public class Step2Players extends Players implements Step {

	Scanner sc = new Scanner(System.in);

	private String roadPlayerOne = "";
	private String roadPlayerTwo = "";

	private String road = "";

	private String namePlayerTwo;

	public Step2Players(String namePlayer, String namePlayerTwo) {
		super(namePlayer);
		this.namePlayerTwo = namePlayerTwo;
	}

	public String getNamePlayerTwo() {
		return namePlayerTwo;
	}

	public void setNamePlayerTwo(String namePlayerTwo) {
		this.namePlayerTwo = namePlayerTwo;
	}

	public String getRoadPlayerOne() {
		return roadPlayerOne;
	}

	public void setRoadPlayerOne(String roadPlayerOne) {
		this.roadPlayerOne = roadPlayerOne;
	}

	public String getRoadPlayerTwo() {
		return roadPlayerTwo;
	}

	public void setRoadPlayerTwo(String roadPlayerTwo) {
		this.roadPlayerTwo = roadPlayerTwo;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Override
	public void resultGame() {
		System.out.println();
		System.out.println("Result");
		System.out.println(getNamePlayer() + " -" + roadPlayerOne);
		System.out.println(getNamePlayerTwo() + " -" + roadPlayerTwo);
	}

	@Override
	public void step() {
		road = "";

		System.out.println("To make a move click 1 and ENTER");
		int go = sc.nextInt();

		int step = (int) (1 + (Math.random() * 6));

		for (int i = 0; i < step; i++) {
			road += ">";
		}

		this.road = road;
	}

	@Override
	public void stepAdd() {

		String stepAdd = road;
		for (int i = 0; i < stepAdd.length(); i++) {
			System.out.print(">");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
