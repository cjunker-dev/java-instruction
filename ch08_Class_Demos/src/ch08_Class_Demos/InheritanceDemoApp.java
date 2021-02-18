package ch08_Class_Demos;

import Book;
import Product;

public class InheritanceDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ch 08 hello!");
		
		Product p1 = new Product("java", "Murach'sJAVA", 59.50);
		
		System.out.println("p1: " + p1);
		Product p2 =  new Product("java", "Murach'sJAVA", 59.50);
		
		System.out.println("p2: " + p2);
		
		if (p1 == p2) {
			System.out.println("p1 and p2 point to the same object");
		}
		else {
			System.out.println("p1 and p2 DO NOT point to the same object");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1 and p2 have the same state");
		}
		else {
			System.out.println("p1 and p2 DO NOT have the same state");
		}
		
		
		// p. 265
		//create a book
		Book b1 = new Book("andr", "Murach's Android Programming", 58.99, "Joel Murach");
		System.out.println(b1);
		
		System.out.println("bye");
	}

}
