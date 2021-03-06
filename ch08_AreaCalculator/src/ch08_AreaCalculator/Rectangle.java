package ch08_AreaCalculator;

public class Rectangle extends Square {
	private double height;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}

	@Override
	public double getArea() {
		return height * width;
	}
}
