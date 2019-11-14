
package Ex4_2;
public class Shape{
	private String color;
	
	public Shape(String color) {
		this.color=color;
	}
	public double getArea() {
		System.out.println("Shape unknown!Cannot compute area" );
		return 0.0;
	}
	public String toString() {
		return "Shape[color="+color+"]";
	}
	
}