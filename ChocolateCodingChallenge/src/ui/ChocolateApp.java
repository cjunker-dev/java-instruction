package ui;

public class ChocolateApp {
	
	/*
	 * We want make a package of goal kilos of chocolate. 
	 * We have small bars (1 kilo each) and big bars (5 kilos each). 
	 * Return the number of small bars to use, 
	 * assuming we always use big bars before small bars. 
	 * Return -1 if it can't be done.
	 */

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


