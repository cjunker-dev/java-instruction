import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) throws NoSuchCustomerException {
		// TODO Auto-generated method stub
		System.out.println("Customer Viewer");
		int id = Console.getInt("Enter a customer number:");
		//get customer (id)
		//Customer cus = new Customer();
		System.out.println(CustomerDB.getCustomer(id).getNameAndAddress());
		
	}

}

