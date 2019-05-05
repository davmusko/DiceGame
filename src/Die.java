import java.util.Random;

public class Die {
	private int sides;
	private int value;
	Random rand = new Random();
	
	public Die() {
	}
	public Die(int sides) {
		this.sides=sides;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int rollDie() {
		value = rand.nextInt(sides)+1;
		return value;
	}
	
	

}
