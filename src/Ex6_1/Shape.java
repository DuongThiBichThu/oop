package Ex6_1;

public abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		
	}
	public Shape(String color, boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		return "Shape[color="+color+",filled="+filled+"]";
	}
	
	
}
