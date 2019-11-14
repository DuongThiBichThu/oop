
package Ex7_2;

public class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int[] getXY() {
		return new int[] {x,y};
	}
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public double distance(Point another) {
		double diffOfX=(another.getX()-this.x)*(another.getX()-this.x);
		double diffOfY=(another.getY()-this.y)*(another.getY()-this.y);
		return Math.sqrt(diffOfX+diffOfY);
	}
}