package Ex1_3a;


public class Test {

	public static void main(String[] args) {
		Rectangle hcn= new Rectangle();
		hcn.setLength(4);
		hcn.setWidth(4);
		System.out.println("Area is: "+hcn.getArea());
		System.out.println("Perimeter is: "+hcn.getPerimeter());
		System.out.println(hcn.toString());
	}

}