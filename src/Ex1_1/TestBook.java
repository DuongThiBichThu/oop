package Ex1_1;

public class TestBook {
	public static void main(String[] args) {
		Author Java = new Author("java","thanhcong@gmail.com",'m');
		System.out.println(Java); 
		
		Book b = new Book("JavaScrip",Java, 145,99);
		System.out.println(b);

	}
}
