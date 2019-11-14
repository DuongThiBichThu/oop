package Ex1_2a;

public class Test{
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(5);
		System.out.println("Radius is: "+c.getRadius());
		System.out.println("Area is: "+c.getArea());
		System.out.println("Cv: "+c.getCircumference());
		System.out.println(c.toString());
	}
}