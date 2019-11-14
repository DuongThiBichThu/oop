package Ex4_3a;

public class Point3D extends Point2D {
	private float z;
	
	public Point3D(float x,float y) {
		super(x,y);
		this.z=0.0f;
	}
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z=z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, int y, int z) {
		super.setXY(x, y);;
		this.z=z;
	}
	public float[] getXYZ() {
		return new float[] {super.getX(), super.getY(),this.z};
	}
	public String toString() {
		return "("+super.getX()+","+super.getX()+","+z+")";
	}
}
