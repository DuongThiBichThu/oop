package Ex5_6;

public class Test {
	 public static void main(String[] args) {
		 MovablePoint p1 = new MovablePoint(1, 2);
		 System.out.println(p1);
		 p1.moveDown();
		 System.out.println(p1);
		 p1.moveRight();
		 System.out.println(p1);
		 
		 Movable p2= new MovablePoint(3, 3);
		 p2.moveUp();
		 System.out.println(p2);
		 MovablePoint p3 =(MovablePoint) p2;
		 System.out.println(p3);
		 
	 }
}
