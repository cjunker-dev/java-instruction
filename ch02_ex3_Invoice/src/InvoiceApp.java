import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice is equal to "n" or "N"
        String choice = "y";
        int numOfInvoices = 0;
        double avgInvoiceAmt = 0.0;
        int totalInvoiceAmt = 0;
        double avgDiscountAmt = 0.0;
        double totalDiscountAmt = 0.0;
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();
            numOfInvoices ++;
            
            
            // calculate the discount amount and total and add discount amount to the total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
               
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            totalDiscountAmt += discountPercent;
            double discountAmount = subtotal * discountPercent;

            double total = subtotal - discountAmount;
            totalInvoiceAmt += total;
            totalDiscountAmt += discountAmount;
            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        avgInvoiceAmt = totalInvoiceAmt / numOfInvoices;
        avgDiscountAmt = totalDiscountAmt / numOfInvoices;
        System.out.println("Number of Invoices: " + numOfInvoices);
        System.out.println("Average Invoice Amount: " + avgInvoiceAmt);
        System.out.println("Average Discount Amount: " + avgDiscountAmt);
        System.out.println("Goodbye");
    }
}