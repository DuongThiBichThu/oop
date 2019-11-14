package Ex7_1;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer("Thu");
		customer.setMember(true);
		customer.setMemberType("Gold");
		System.out.println(customer);
		
		Visit visit = new Visit(customer,"8/8/2018");
		visit.setServiceExpense(20);
		visit.setProductExpense(10);
		System.out.println(visit);
		System.out.println("total:" +visit.getTotalExpense());
	}

}
