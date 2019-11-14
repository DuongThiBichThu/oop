package Ex6_2;

public class Test {

	public static void main(String[] args) {
		Cat c1= new Cat();
		c1.greeting();
		Dog d1= new Dog();
		d1.greeting();
		
		Animal a1 = new Cat();// Polymorphism
		a1.greeting();
		Animal a2 = new Dog();
		a2.greeting();
		
		Dog d = (Dog) a2; // Downcast
		d.greeting();

	}

}
