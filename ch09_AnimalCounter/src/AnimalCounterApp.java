public class AnimalCounterApp {

	public static void main(String[] args) {
		
		System.out.println("hello");
		//declare a fresh new animal
		Animal animal = null;
		animal = new Alligator();
		count(animal, 3);
		//declare type of animal
		//count animal appropriate number of time
		
		System.out.println("bye");
	}

	
	public static void count(Countable c, int maxCount) {
		//count any Countable object a specific number of times
		animal.getCountString();
		//for each loop
		//reset count each time??
	}
}
