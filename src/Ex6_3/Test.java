package Ex6_3;

public class Test {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 2, 6,10);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(4, 5, 6, 7, 5);
		System.out.println(m2);
		m2.moveUp();
		System.out.println(m2);	
	}
}
