package Ex3_4;

public class Test {

	public static void main(String[] args) {
		MyTime t1= new MyTime(23,59,59);
		System.out.println(t1);
		System.out.println(t1.nextSecond());
		System.out.println(t1.previousSecond());
		
	}

}
