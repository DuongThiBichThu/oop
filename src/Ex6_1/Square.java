package Ex6_1;
import Ex6_1.Rectangle;
public class Square extends Rectangle{
	private double side;
	public Square(double width, double length) {
		super(width, length);
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	public String toString() {
		return "Square[side="+side+","+super.toString()+"]";
	}
	
}
