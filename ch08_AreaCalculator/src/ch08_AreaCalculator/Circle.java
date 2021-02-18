package ch08_AreaCalculator;

public class Circle extends Shape {
	private double radius;
	//public double area; //was originally inherited but we removed the int area from Shape
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (Math.pow(radius, 2)) * Math.PI; //get the actual one though
	}

	
	
}
