
package Ex1_1a;

public final class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius=1.0;
		this.color="red";
	}
	public Circle(double r) {
		radius=r;
		color="red";
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Circle[radius="+radius+",color="+color+"]";
	}
}
