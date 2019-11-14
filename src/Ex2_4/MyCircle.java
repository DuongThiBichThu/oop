
package Ex2_4;
public class MyCircle{
	private MyPoint center;
	private int radius;
	public MyCircle() {
		center = new MyPoint(0,0);
		this.radius=1;
	}
	public MyCircle(int x, int y, int radius) {
		center= new MyPoint(x,y);
		this.radius=radius;
	}
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterx(int x) {
		center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		center.setY(y);
	}
	public String toString() {
		return "MyCircle[radius="+radius +",center="+center+"]";
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getCircumference() {
		return Math.PI*radius;
	}
	public double distance(MyCircle another) {
		return this.center.distance(another.getCenterX(),getCenterY());
	}
		
}