public class InterfacesApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Printable p = new Book("java", "Murach's Java Programming", 59.90, "Joel Murach");
		Book b = new Book("andr", "Murach's Android Programming", 57.50, "Joel Murach");
		p.print();
		printIt(b);
		
		//p. 317 - clone a product
		Book seanBook = new Book("java", "Murach's Java Programming", 59.50, "Joel Murach");
		Book willBook = null;
		try {
			willBook = (Book)seanBook.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Goodbye");
	}
	private static void printIt(Printable p) {
		p.print();
	}
}
