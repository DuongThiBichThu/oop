package Ex1_1;

public class TestAuthor {
	public static void main(String[] args) {
		Author Java = new Author("java","thanhcong@gmail.com",'m');
		System.out.println(Java); 

		System.out.println("Name is: "+Java.getName());
		System.out.println("gender is: "+Java.getGender());
		System.out.println("email is: " + Java.getEmail());

	}

}
