package Ex4_4a;

public class Test {

	public static void main(String[] args) {
		Point p = new MovablePoint(2, 3);
		System.out.println(p);
		
		MovablePoint m = new MovablePoint(4, 5);
		m.setXY(3, 4);
		m.getX();
		m.getY();
		m.setxSpeed(3);
		m.setySpeed(2);
		System.out.println(m.move());

	}

}
