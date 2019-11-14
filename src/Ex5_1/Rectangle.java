package Ex5_1;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle(String color) {
		super(color);
	}
	public Rectangle(int length, int width, String color) {
		super(color);
		this.length=length;
		this.width=width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		return length*width;
	}
	public String toString() {
		return "Rectangle[length="+length+",width="+width+","+super.toString()+"]";
	}

}
