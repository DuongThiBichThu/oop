package Ex3_6;

public class Container {
	private int x1, y1, x2, y2;
	
	public Container(int x,int y,int width, int height) {
		
	}
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}
	public int getY1() {
		return y1;
	}
	public int getY2() {
		return y2;
	}
	public int getWidth() {
		return this.getWidth();
	}
	public int getHeight() {
		return this.getWidth();
	}
	public boolean collides(Ball ball) {
		if(ball.getX()-ball.getRadius()<=this.x1||
		   ball.getX()-ball.getRadius() >= this.x2) {
			ball.reflectHorizontal();
			return true;
		}
		return false;
	}
	public String toString() {
		return "Container[("+x1+","+y1+"),("+x2+","+y2+")]";
	}
	
}
