package ch08_AreaCalculator;

public class Square extends Shape {
	protected double width;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Square(double width) {
		super();
		this.width = width;
	}

	@Override
	public double getArea() {
		return width * width;
	}

}
