package Ex2_2a;

public class Test {

	public static void main(String[] args) {
		Author[] author = new Author[2];
		author[0] = new Author("NVA","abc@gmail.com",'m');
		author[1] = new Author(" NVB", "Nguyen@gmail.com", 'm');

		
		Book b = new Book("java01",author,12.5,5);
		System.out.println(b);
		System.out.println(b.getAuthorNames());
	}

}
