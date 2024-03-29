package Ex2_1;


public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();// goi contructor cuar lop cha
		this.height=1.0;
	}
	public Cylinder(double height) {
		super();
		this.height=height;
	}
	public Cylinder(double height,double radius) {
		super(radius);
		this.height=height;
	}
	public Cylinder(double height, double radius, String color) {
		super(radius,color);
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
//	public double getVolume() {
//		return getArea()*height;
//	}
//	public String toString() {
//		return "This is a Cylinder";
//	}
	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*height+2*super.getArea();
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	@Override
	public String toString() {
		return "Cylinder[" +super.toString()+",height= "+height+"]";
	}
}

