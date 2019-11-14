package Ex6_1;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Circle("Red",false,5.5);
		System.out.println(s1);
		
		Circle c1 = (Circle) s1;
		System.out.println(c1);
		
		Shape s2 = new Rectangle(2.0, 4.0, "Blue",false );
		System.out.println(s2);
		Rectangle r = (Rectangle) s2;
		System.out.println(r);
		
		Shape s3= new Square(5);
		System.out.println(s3);
		
	}

}
