
package Ex3_1a;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.RetrievalMethodResolver;

public class MyComplex{
	private double real;
	private double imag;
	
	public MyComplex() {
		this.real=0.0;
		this.imag=0.0;
	}

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	public String toString() {
		return "("+real+"+"+imag+"i)";
	}
	public boolean isReal() {
		return (imag==0);
	}
	public boolean isImaginary() {
		return (real==0);
	}
	public boolean equals(double real, double imag) {
		return this.real==real && this.imag==imag;
	}
	public boolean equals(MyComplex another) {
		return another.getReal() == this.real && another.getImag()==this.imag;
	}
	public double magnitude() {
		return Math.sqrt(real*real+imag*imag);
	}
	public double argument() {
		return Math.atan2(imag,real);
	}
	public MyComplex add(MyComplex right) {
		right.real=this.real+right.real;
		right.imag=this.imag+right.imag;
		return right;
	}
	public MyComplex addNew(MyComplex right) {
		return right; //
	}
	public MyComplex subtract(MyComplex right) {
		right.real=this.real-right.real;
		right.imag=this.imag-right.imag;
		return right;
	}
	public MyComplex subtractNew(MyComplex right) {
		right.real=this.real-right.real;
		right.imag=this.imag-right.imag;
		return new MyComplex();//
	}
	public MyComplex multiply(MyComplex right) {
		MyComplex a= new MyComplex();
		a.real=this.real*right.real-this.imag*right.imag;
		a.imag=this.real*right.imag+this.imag*right.real;
		return a;
	}
	public MyComplex dividi(MyComplex right) {
		MyComplex a;
	    a= this.multiply(right.conjugate());
	    a.real /= right.real*right.real+right.imag*right.imag;
	    a.imag /= right.real*right.real+right.imag*right.imag;
	    return a;
	}
	public MyComplex conjugate() {
		return this;
	}
	
	
}