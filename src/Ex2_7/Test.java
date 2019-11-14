package Ex2_7;

public class Test {

	public static void main(String[] args) {
		Customer kh1 = new Customer(12, "Thu",5);
		System.out.println(kh1.toString());
		
		Invoice hd = new Invoice(2, kh1, 10);
		System.out.println(hd.getAmountAfterDiscount());
		
	}

}
