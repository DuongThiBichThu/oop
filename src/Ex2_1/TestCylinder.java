package Ex2_1;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder ht1 = new Cylinder();
		System.out.println("Radius is: "+ht1.getRadius()
						  +" Height is: "+ht1.getHeight()
						  +" Color is: "+ ht1.getColor()
						  +" Base erea is: "+ht1.getArea()
						  +" Volume is: "+ht1.getVolume());
		System.out.println(ht1.toString());
		
	}

}
