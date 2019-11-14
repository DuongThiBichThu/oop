package Ex3_6;

public class Test {

	public static void main(String[] args) {
		Ball ball = new Ball(1,2,3,4,5);
		Container box = new Container(0, 0, 3,5);
		
		for(int step=0; step<4;step++) {
			ball.move();
			box.collides(ball);
			System.out.println(ball);
		}

	}

}
