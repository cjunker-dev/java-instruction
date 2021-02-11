package ch01_Test;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Howdy y'all");
		int n1 = 5;
		int n2 = 8;
		int n3 = 21;
		int n4 = 4;
		double d1 = 5.5;
		double d2 = 7.0;
		double d3 = 11.1;
		double d4 = 17.2;
		int sum1 = n1 + n4;
		int diff1 = n3 - n2;
		int prod1 = n1 * n3;
		int quotient1 = n4 / n3;
		double sum2 = d1 + d3;
		double diff2 = d4 - d2;
		double prod2 = d1 * d3;
		double quotient2 = d1 / d4;
		
		System.out.println("Sum1 = " + sum1);
		System.out.println("Diff1 = " + diff1);
		System.out.println("Prod1 = " + prod1);
		System.out.println("Quotient1 = " + quotient1);
		System.out.println("Sum2 = " + sum2);
		System.out.println("Diff2 = " + diff2);
		System.out.println("Prod2 = " + prod2);
		System.out.println("Quotient2 = " + quotient2);
		System.out.println("Mix n match = " + (n1 / d3));
		System.out.println("Goodbye");
	}

}
