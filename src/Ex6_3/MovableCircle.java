package Ex6_3;

public class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius=radius;
		center= new MovablePoint(x, y, xSpeed, ySpeed);
	}
	@Override
	public void moveUp() {
		center.y -=center.ySpeed; 
	}
	public void moveDown() {
		center.y += center.ySpeed;
	}
	public void moveLeft() {
		center.x -= center.xSpeed;
	}
	public void moveRight() {
		center.x +=center.xSpeed;
	}
	public String toString() {
		return "MovableCircle[Radius="+radius+",center="+center+"]";
	}
	
	
}
