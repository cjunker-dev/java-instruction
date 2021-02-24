package ui;

import util.Console;

public class ArrowheadApp {

	public static void main(String[] args) {
		int number = Console.getInt("Arrowhead size?: ");
		//number must be oddified because it needs a middle point
		if (number % 2 == 0) {
			//number is even, must add 1
			number++;
		}
		int midway = (number / 2) + 1;
		
		
		String arrowTop = "";
		for (int i = 0; i < midway; i++) {
			arrowTop += ">";
			System.out.println(arrowTop);
		}
		//what do i need to do here? print the same in reverse order? I can't subtract arrows.
		//maybe i need to do it another way. create an internal for loop?
		String arrowBottom = "";
		for (int i = (midway - 1); i > 0; i--) {
			for (int x = 0; x < i; x++) {
				arrowBottom += ">";
				
			}
			System.out.println(arrowBottom);
			arrowBottom = "";
		}
		
		
		
		
	}

}
