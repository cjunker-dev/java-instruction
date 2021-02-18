
//pg 217
//1. Create class
// Name must match perfectly
public class Product {
	// all physical products need to be classes in Java
	//2. Set instance variables.
	private String code;
	private String description;
	private double price;
	
	
	//3. Generate constructors
	//"fully loaded" constructor - not required
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	//4. Setters and getters
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	
	//5. Optional - generate a toString
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
}
