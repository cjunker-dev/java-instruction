package ch08_AreaCalculator;

public class AreaCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator\n");
		//while loop from here til choice
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getRequiredString
					("Calculate the area of a circle, square or rectangle? (c/s/r): ");
			Shape shape = null;
			//depending on choice, call a different class
			switch(type) {
				case "c":
					double radius = Console.getDouble("Enter radius: ", 0, Double.MAX_VALUE);
					//Circle circle = new Circle(radius);
					shape = new Circle(radius);
					//circle.setRadius(radius);
					//System.out.println("The area of the Circle you entered is " + shape.getArea() + "\n");
					break;
				case "s":
					double width = Console.getDouble("Enter width: ", 0, Double.MAX_VALUE);
					shape = new Square(width);
					//Square square = new Square(width);
					//square.setWidth(width);
					//System.out.println("The area of the Square you entered is " +shape.getArea() + "\n");
					break;
				case "r":
					width = Console.getDouble("Enter width: ", 0, Double.MAX_VALUE);
					double height = Console.getDouble("Enter height: ", 0, Double.MAX_VALUE);
					//rectangle.setWidth(width);
					//System.out.println(width);
					//rectangle.setHeight(height);
					//System.out.println(height);
					shape = new Rectangle(width, height);
					//Rectangle rectangle = new Rectangle(width, height);
					//System.out.println("The area of the Rectangle you entered is " + shape.getArea() + "\n");
			}
			String shapeType = shape.getClass().getSimpleName();
			System.out.println("The area of the " + shapeType + " you entered is " + shape.getArea() + "\n");
			choice = Console.getChoiceString("Continue? (y/n): ", "y", "n");

		}
		//prompt for entering radius or whatever
		//return area
		//ask to continue
		System.out.println("bye");

	}

}


