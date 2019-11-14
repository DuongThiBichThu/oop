package Ex4_4a;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	public MovablePoint(float x, float y) {
		super(x,y);
		this.xSpeed=0.0f;
		this.ySpeed=0.0f;
	}
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x,y);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public float[] getSpeed() {
		return new float[] {xSpeed,ySpeed};
	}
	public String toString() {
		return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
	}
	public MovablePoint move() {
		super.setXY(super.getX()+xSpeed, super.getY()+ySpeed);
		return this;
	}
	
}
