package Ex4_2;

public class Rectangle extends Shape  {
	private int length;
	private int width;
	
	public Rectangle(String color,int lenght,int width) {
		super(color);
		this.length=lenght;
		this.width=width;
	}
	
	public double getArea() {
		return length*width;
	}
	public String toString() {
		return "Rectangle[lenght="+length+",with="+width+","+super.toString()+"]";
	}
	
	
}
