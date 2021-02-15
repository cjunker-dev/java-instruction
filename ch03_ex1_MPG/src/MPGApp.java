import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;
public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            double mpg = miles/gallons;
           // big decimal
            BigDecimal milesBD = new BigDecimal(miles);
            BigDecimal gallonsBD = new BigDecimal(gallons);
            BigDecimal mpgBD = milesBD.divide(gallonsBD, 2, RoundingMode.HALF_UP);
            // round to two decimal places
            
            //int roundedMpg = (int)Math.round(mpg);
           //mpg = (double)Math.round(mpg * 100) / 100;
            //NumberFormat nbr = NumberFormat.getNumberInstance();
            //nbr.setMaximumFractionDigits(2);
            //String mileString = nbr.format(mpg);
            //String mileString = number.format(mpg);
            // result is 25.32, 25, 25.31645569620253
            // I can't figure out how to round to 25!! for some reason it keeps adding a .0
           // System.out.println((int) Math.round(x * 100) / 100);
            System.out.println("Miles per gallon is " + mpgBD + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
