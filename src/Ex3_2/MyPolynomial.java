
package Ex3_2;
public class MyPolynomial{
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	public int getDegree() {
		int degree=0;
		for(int i=0; i<coeffs.length; i++)
		{
			if(coeffs[i]!=0) {
				degree=i;
			}
		}
		return degree;
	}
	public String toString() {
		return "";//
	}
	public double evaluate(double x) {
		double value = coeffs[0];
		for(int i=1; i<=getDegree();i++) {
			value += coeffs[i]*Math.pow(x, i);
		}
		return value;
	}
	public MyPolynomial add(MyPolynomial another) {
		MyPolynomial myPolynomial;
		return another;//
	}
	public  MyPolynomial multi(MyPolynomial another) {
        
        return another;//
    }
	
	
}