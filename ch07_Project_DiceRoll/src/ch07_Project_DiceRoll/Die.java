package ch07_Project_DiceRoll;

public class Die {
	private int value;

	public Die() {
		//default constructor is ALWAYS needed
		value = 0;
	}
	
	//this constructor won't be used. just for demo purposes.
	public Die(int v) {
		super();
		this.value = v;
	}
	// this is unnecessary because it ruins the purpose of a random number generation
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() { //method
		return value;
	}
	public void roll() {
		//generate a random number between 1 and 6
		value = (int) ((Math.random() * 6) + 1);
	}
}
