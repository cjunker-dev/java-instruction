package ui;

import business.Product;

public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Arrays. Good luck.");
		// p. 355
		double[] prices = new double[4];
		
		prices[0] = 5.99;
		prices[1] = 7.55;
		prices[2] = 6.55;
		prices[3] = 2.50;
		//price[4] = 5.45 <= not allowed
		
		System.out.println("item at idx 2: " + prices[2]);
		
		//p. 357
		int[] numbers = {5, 24, 7, 9, 45, 11};
		System.out.println("array of numbers length = " + numbers.length);
		
		
		
		
		//p. 359
		System.out.println("All the prices in our array");
		for (int i= 0; i < prices.length; i++) {
			System.out.println("Item at index " + i + ": " + prices[i]);
		}
		
		
		//p. 361
		System.out.println("\nEnhance for loop\n");
		int sum = 0;
		for (int i: numbers) {
			sum+= i;
		}
		System.out.println("Sum of numbers = " + sum);
		System.out.println("Avg = " + ((double)sum/numbers.length));
		System.out.println("number of elements = " +numbers.length);
		
		
		Product p1 = new Product("java", "Murach's Java Programming", 59.59);
		Product p2 = new Product("mysql", "Murach's My SQL", 55.50);
		Product p3 = new Product("andr", "Murach's Android Programming", 57.50);
		
		Product[] products = {p1, p2, p3};
		
		for  (Product p: products) {
			System.out.println(p);
		}
		
		System.out.println("Bye!");
	}

}
