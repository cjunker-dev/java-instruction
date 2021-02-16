import java.text.NumberFormat;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String getAreaFormatted() {
	    double area = length * width;
		NumberFormat number = NumberFormat.getNumberInstance();
	    area = (double) Math.round(area * 1000)/ 1000;
		return number.format(area);
	    
	}
	public double getPerimeter() {
		return ((2 * length) + (2* width));
		
	}
	
	public String getPerimeterFormatted() {
	    double perimeter = ((2 * length) + (2* width));
		NumberFormat number = NumberFormat.getNumberInstance();
	    perimeter = (double) Math.round(perimeter * 1000)/ 1000;
		return number.format(perimeter);
	    
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length2) {
		this.length = length2;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width2) {
		this.width = width2;
	}

}
