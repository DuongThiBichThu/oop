package Ex2_3a;

public class Test {

	public static void main(String[] args) {
		MyPoint p1=new MyPoint();
		System.out.println(p1);
		p1.setX(4);
		p1.setY(3);
		MyPoint p2 = new MyPoint();
		p2.setX(8);
		p2.setY(6);
		System.out.println(p2.distance(p1));

	}

}
