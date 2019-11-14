package Ex6_1;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(String color, boolean filled) {
		super(color, filled);
	}
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width=width;
		this.length=length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override 
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2.0*(width+length);
	}
	public String toString() {
		return "Rectangle[width="+width+",length="+length+","+super.toString()+"]";
	}
	
	
}
