package Ex4_1a;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Cylinder(3,"Red");
		System.out.println(c1.toString());
		System.out.println("Area is: "+c1.getArea());
		
		Cylinder c2 =new Cylinder(3,"Red",4);
		System.out.println("Volume is:"+c2.getVolume());
		
		
	}

}
