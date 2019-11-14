package Ex5_2a;

public class Cylinder {
	private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return base.getArea()*height;
    }
    public String toString() {
    	return "Cylinder[base="+base+",hieght="+height+"]";
    }
}
