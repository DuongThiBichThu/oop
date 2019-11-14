package Ex7_1;

import java.sql.Date;

public class Visit {
	private Customer customer;
	private String date;
	private double serviceExpense;
	private double productExpense;
	
	
	public Visit(Customer name, String date) {
		this.customer=name;
		this.date=date;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	public double getTotalExpense() {
		return serviceExpense+productExpense;
	}
	public String toString() {
		return "Visit[customer="+customer+",date="+date+",serviceExpense="+serviceExpense+",productExpense="+productExpense+"]";
	}
 
}
