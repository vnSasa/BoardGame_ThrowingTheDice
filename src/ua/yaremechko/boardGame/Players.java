package ua.yaremechko.boardGame;

public abstract class Players {

	private String namePlayer;

	public Players(String namePlayer) {
		super();
		this.namePlayer = namePlayer;
	}

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	@Override
	public String toString() {
		return "Players [namePlayer=" + namePlayer + "]";
	}

	public abstract void resultGame();

	public abstract void stepAdd();

}
