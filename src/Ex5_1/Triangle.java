package Ex5_1;

public class Triangle extends Shape {
	private int base;
	private int hieght;
	
	public Triangle(String color) {
		super(color);
	}
	public Triangle(String color, int base,int hieght) {
		super(color);
		this.base=base;
		this.hieght=hieght;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	@Override
	public double getArea() {
		return 0.5*base*hieght;
	}
	public String toString() {
		return "Triangle[base="+base+",height"+hieght+","+super.toString()+"]";
	}
	
	
}
