package Ex4_4;

public class Test {

	public static void main(String[] args) {
		A a1=new C();
		System.out.println(a1);
		B b1=(B) a1;
		C c1 = (C) b1;
		
		A a2 = new B();
		System.out.println(a2);
		
	}

}
