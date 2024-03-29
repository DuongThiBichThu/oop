
package Ex3_1;
public class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
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
	public void setXY(int x, int y ) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public double distance(Point another) {
		return Math.sqrt(Math.pow(another.getX() - this.getX(),2) + Math.pow(another.getY()-this.getY(),2));
	}
}