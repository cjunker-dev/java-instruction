public class ProductDB {

    public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = null;

        // fill the Product object with data
       // product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
           //product.setDescription("Murach's Java Programming");
            //product.setPrice(57.50);
            product = new Product("java", "Murach's Java Programming", 57.57);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            //product.setDescription("Murach's Java Servlets and JSP");
            //product.setPrice(57.50);
            product = new Product("jsp", "Murach's Java Servlets and JSP", 57.54);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            //product.setDescription("Murach's MySQL");
            //product.setPrice(54.50);
            product = new Product("mysql", "Murach's MySQL", 54.56);
        } else if (productCode.equalsIgnoreCase("rby")) {
        	//product.setDescription("Murach's Ruby on Rails");
        	//product.setPrice(58.76);
        	product = new Product("rby", "Murach's Ruby on Rails", 54.51);
        }
        
        else {
           // product.setDescription("Unknown");
            product = new Product("unknown", "unknown", 0.0);
        }
        return product;
    }
}