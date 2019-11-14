package Ex2_1a;

public class Test {

	public static void main(String[] args) {
		Author tg=new Author("Thanh Cong","thanhcongdn@gmail.com",'m');
		System.out.println(tg);
		Book b=new Book("Java",tg,100,50);
		System.out.println(b);

	}

}
