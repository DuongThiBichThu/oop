package Ex3_7;

public class Test {

	public static void main(String[] args) {
		Ball ball = new Ball(1,2,3);
		Player player= new Player(1, 1, 2);
		player.kick(ball);
		player.kick(ball);
		player.kick(ball);
		System.out.println(ball);

	}

}
