package ui;

import java.lang.reflect.Array;

public class FirstLast6App {

	public static void main(String[] args) {
		int num[] = new int[] {1,2,6}; //true
		System.out.println(firstLast6(num));
		int num2[] = new int[] {6,1,2,3}; //true
		System.out.println(firstLast6(num2));
		int num3[] = new int[] {13,6,1,2,3}; //false
		System.out.println(firstLast6(num3));
	}
	
	public static boolean firstLast6(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		if (first == 6 || last == 6) {
				return true;
			}
		else {
			return false;
		}
	}
		
		
		
	}
	
	

