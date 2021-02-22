package ui;

import java.util.ArrayList;

public class CollectionDemoApp {

	public static void main(String[] args) {
		//p. 389
		ArrayList<String> names = new ArrayList<>();
		names.add("Celina");
		names.add("Will");
		names.add("Lance");
		names.add("Daemon");
		names.add("Tom");
		names.add("Bryan");
		
		for (String s:names) {
			System.out.println(s);
		}
	}

}
