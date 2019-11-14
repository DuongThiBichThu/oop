package Ex5_5;

public class Test {
	public static void main(String[] agrs) {
		Shape s1= new Rectangle(2, 3);
		System.out.println(s1);
		System.out.println("Area is: "+s1.getArea());
		
		Shape s2= new Triangle(2, 4);
		System.out.println(s2);
		System.out.println("Area is: "+s2.getArea());
		
	}
}
