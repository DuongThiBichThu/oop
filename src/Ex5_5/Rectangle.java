package Ex5_5;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public double getArea() {
		return length*width;
	}
	public String toString() {
		return "Rectangle[length="+length+",width="+width+"]";
	}
}
