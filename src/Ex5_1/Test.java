package Ex5_1;

public class Test {

	public static void main(String[] args) {
		Shape s =new Rectangle(4, 5, "Red");
		System.out.println(s);
		Rectangle r = (Rectangle) s;
		System.out.println(r);
		System.out.println(r.getArea());
		
		
		Shape s1 = new Triangle("Blue", 2, 4);
		System.out.println(s1);
		Triangle Tr= (Triangle) s1;
		System.out.println(Tr);
	}

}
