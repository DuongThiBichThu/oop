package Ex1_4;

public class Test {
	public static void main(String[] args) {
		Employee nv= new Employee(1,"A","Nguyen",500000);
		System.out.println(nv.toString());
		System.out.println("AnnualSalary is: "+nv.getAnnualSalary());
		System.out.println("RaiseSalary is: "+ nv.raiseSalary(5));

	}

}
