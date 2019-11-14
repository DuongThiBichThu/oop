package Ex4_5a;

public class Square extends Rectangle {
	private double side;
	
	
	public Square(double width, double length) {
		super(width, length);
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(color,filled);
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double width) {
		super.setWidth(width);
	}
	public void setLength(double length) {
		super.setLength(length);
	}
	public String toString() {
		return  "A Square with side="+super.getWidth()+" which is a subclass of "+super.toString();
	}
		
}
