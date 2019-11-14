package Ex6_4;

public class Circle implements GeometricObject{
	private double radius;
	public Circle(double radius) {
		this.radius=1.0;
	}
	@Override
	public double getPerimeter() {
		return 2.0*Math.PI*radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
