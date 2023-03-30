package studio7;

public class rectangles {
	private double length;
	private double height;
	
	public rectangles(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public void setLength(double l) {
		this.length = l;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getArea() {
		return length*height;
	}
	
	public double getPerimeter() {
		return (length+height)*2;
	}
}
