package ch07_Project_DiceRoll;

public class Dice {
	private Die die1 = new Die();
	private Die die2 = new Die();
	//private int total;
		
	public Dice() { //instantiate the variables
		super();
		die1 = new Die();
		die2 = new Die();
		//die1.roll();
		//die2.roll();
		//total = die1.getValue() + die2.getValue();
	}
	
	
	
	public Die getDie1() {
		return die1;
	}



	public void setDie1(Die die1) {
		this.die1 = die1;
	}



	public Die getDie2() {
		return die2;
	}



	public void setDie2(Die die2) {
		this.die2 = die2;
	}



	public String getRollResultString() { //method that prints roll but we are gonna change it!!!
		String result = "Die 1:\t" + getDie1().getValue() + "\n" +
						"Die 2:\t" + getDie2().getValue() + "\n" +
						"Total:\t" +getSum() + "\n";
		
		if (getSum() == 7) {
			result += "Craps!";
		}
		else if (getSum() == 12){
			result += "Boxcars!";
		}
		else if (getSum() == 2) {
			result += "Sssssssnake eyes!";
		}
		return result;
	}
	
	public int getSum() { //returns the sum of both dice
		return die1.getValue() + die2.getValue();
	}
	
	
	/* public void getValue() { //method
		
	}*/
	
	
	public void roll() { //method that rolls both dice}
		die1.roll();
		die2.roll();
		}
}
