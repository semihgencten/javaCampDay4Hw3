package day3wh3;

public class Game {
	private int id;
	private String nameOfGame;
	private double unitPrice;
	public Game(int id, String nameOfGame, double unitPrice) {
		super();
		this.id = id;
		this.nameOfGame = nameOfGame;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOfGame() {
		return nameOfGame;
	}
	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
