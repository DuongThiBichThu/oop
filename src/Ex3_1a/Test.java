package Ex3_1a;

public class Test {

	public static void main(String[] args) {
		MyComplex myComplex1 = new MyComplex(2,3);
		System.out.println("Complex1: "+myComplex1);
		MyComplex myComplex2 =new MyComplex(2,4);
		System.out.println("Complex2: "+myComplex2);
		System.out.println(myComplex1.add(myComplex2));
		System.out.println(myComplex2.subtract(myComplex1));
		System.out.println(myComplex2.dividi(myComplex1));
		System.out.println(myComplex1.multiply(myComplex1));
		System.out.println(myComplex1.conjugate());
	}

}
