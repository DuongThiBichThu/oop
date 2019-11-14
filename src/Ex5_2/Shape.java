package Ex5_2;

public abstract class Shape {
	private String color;
	
	
	public Shape(String color) {
		this.color=color;
	}
	@Override
	public String toString() {
		return "Shape of color=\""+ color+"\"";
	}
	public abstract double getArea();
	
}
