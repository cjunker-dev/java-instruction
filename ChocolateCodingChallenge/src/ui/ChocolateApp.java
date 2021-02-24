package ui;

public class ChocolateApp {

	public static void main(String[] args) {
		System.out.println(makeChocolate(4,1,9)); //return 4
		System.out.println(makeChocolate(4,1,10)); //return -1
		System.out.println(makeChocolate(4,1,7)); //return 2
		
	}
	public static int makeChocolate(int small, int big, int goal) {
		// goal modulus 5 returns leftovers after big bars are used
		int goalLeft = goal - (big * 5);
		if (goalLeft - small > 0) {
			return -1;
		}
		
		
		
		return goalLeft;
		
		// 
		
		
		
		
	}
}


