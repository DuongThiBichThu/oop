package Ex5_2;

public class Reclangle extends Shape {
	
	private int length;
	private int width;
	
	public Reclangle(String color) {
		super(color);	
	}
	public Reclangle(String color, int length, int width) {
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
