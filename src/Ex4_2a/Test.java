package Ex4_2a;

public class Test {

	public static void main(String[] args) {
		Person p = new Student("Thao","123HD","Hoche",2018,500);
		System.out.println(p.toString());
		
		Student st= new Student("Thu","12st");
		System.out.println("Student: "+" radius="+st.getName()
				+ ", Address= "+st.getAddress());
		
	}

}
