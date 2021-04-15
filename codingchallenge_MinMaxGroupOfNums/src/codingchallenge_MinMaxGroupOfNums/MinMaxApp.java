package codingchallenge_MinMaxGroupOfNums;

public class MinMaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ints[] = new int[] {1, 3, 5, 7, 9};
		int sums[] = new int[5];
		int num = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < ints.length; i++) {
			num = 0;
			for (int j = 0; j < ints.length; j++) {
				num += ints[j];
			}
			num-= ints[i];
			sums[i] = num;
		}
		for (int s: sums) {
			System.out.print(s + " ");
		}
		max = sums[0];
		//compare each number to find the max and min
		for (int i = 1; i < sums.length; i++) {
			if (sums[i] > sums[i-1]) {
				max = sums[i];
			}
		}
		for (int i = 1; i < sums.length; i++) {
			if (sums[i] < sums[i-1]) {
				min = sums[i];
				
			}
		}
		System.out.println("Lowest sum: " + min);
		System.out.println("Highest sum: " + max);
		
		
		//add numbers 1-50 if they're divisable by five or seven
		num = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0 || i % 5 == 0) {
				num+=i;
			}
	}
		System.out.println("Adding numbers divisible by 5 or 7: " + num);

	System.out.println("My fibonacci: ");
	num = 0;
	int fib[] = new int[75];
	fib[0] = 1;
	//fib[1] = 1;
	for (int i = 1; i < 15; i++) {
		fib[i+1] = fib[i-1] + fib[i];
		System.out.print(fib[i] + ", ");
	}
	System.out.println("");
	System.out.println("Greg's fibonacci: ");
	int a = 1;
	int b = 1;
	int c = 0;
	while (c <= 75) {
		System.out.print(a + ", ");
		c = a+b;
		a = b;
		b = c;
	}
		
	System.out.println();
	System.out.println("Grading rules:");
	int grades[] = new int[] {73, 67, 40, 33};
	int nextMult = 0;
	for (int i = 0; i < grades.length; i++) {
		if (grades[i] > 38) {
			//first figure out what the next number is that's divisible by 5
			for (int j = grades[i]; j < (grades[i] + 5); j++) {
				if (j % 5 == 0) {
					nextMult = j;
				}
			}
			if (nextMult - grades[i] < 3) {
				grades[i] = nextMult;
			}
		}
	}
	for (int i = 0; i < grades.length; i++) {
		System.out.print(grades[i] + ", ");
	}
	
	
	
	
	
	
	}
	
	}


