package Ex5_5;

public class Triangle implements Shape{
	private double base;
	private double hieght;
	
	public Triangle(double base, double hieght) {
		this.base=base;
		this.hieght=hieght;
	}
	public double getArea() {
		return 0.5*hieght*base;
	}
	public String toString() {
		return "Triangle[Base="+base+",hieght="+hieght+"]";
	}
}
