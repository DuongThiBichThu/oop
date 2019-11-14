package Ex4_2;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(String color, int base,int height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
	public String toString() {
		return "Triangle[base="+base+",height="+height+","+super.toString()+"]";
	}
	
}
