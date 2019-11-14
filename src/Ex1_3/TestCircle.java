package Ex1_3;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2=new Circle(2,4,4.5);
		System.out.println(c2);
		Circle c3 = new Circle(new Point(2,3),3.3);
		System.out.println(c3);
		
		c1.setCenter(new Point(1,2));
		c1.setRadius(10.5);
		System.out.println(c1);
		System.out.println("center is: "+c1.getCenter());
		System.out.println("center is: "+c1.getRadius());
		
		System.out.println("Area is: "+c1.getArea());
		System.out.println("Circumference is: "+c1.getCircumference());
		System.out.println("Distance is: "+c1.distance(c2));
	}

}
