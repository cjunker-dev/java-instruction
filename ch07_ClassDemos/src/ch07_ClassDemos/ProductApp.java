package ch07_ClassDemos;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		//221 - 255 - accessing
		Product product1 = new Product("java", "Merrick's Java Programming", 65.33);
		
		System.out.println("product1 =" + product1.getCode()+", " + product1.getDescription()
		+ ", "+ product1.getPrice());
		
		//product1.setCode("test");
		System.out.println(product1);
		
		System.out.println("Description equals = " + product1.getDescription());
		System.out.println();
		
		
		// create a vendor
		Vendor amazon = new Vendor();
		Vendor target = new Vendor("TRGT", "Target LLC"); // Java gives you a default constructor if you don't make one
		
		String code = Console.getString("product code: ");
		String desc = Console.getString("product desc: ");
		double price = Console.getDouble("product price: ");
		
		Product product2 = new Product(code, desc, price);
		System.out.println(product2);
		System.out.println("bye");
	}

}
