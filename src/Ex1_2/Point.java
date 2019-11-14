
package Ex1_2;

public class Point {
	private int x=0;
	private int y=0;
	
	public Point() {
		
	}
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
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	public int[] getXY() {
		return new int[] {x,y}; // int [] = {x,y};
	}
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(x-this.getX(),2) + Math.pow(y - this.getY(),2));
	}
	public double distance(Point another) {
		return Math.sqrt(Math.pow(another.getX() - this.getX(),2) + Math.pow(another.getY()-this.getY(),2));
	}
	public double distance() {
		return 0.0;
	}		
	
}
