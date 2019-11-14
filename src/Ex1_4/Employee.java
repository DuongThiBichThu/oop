
package Ex1_4;
public class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return firstName+lastName;
	}
	public int getAnnualSalary() {
		return 12*salary;
	}
	//tang %luong tra ve luong moi
	public int raiseSalary(int percent) {
		return 10*12*salary;
	}
	@Override
	public String toString() {
		return "Employee[id="+id+",name="+firstName+lastName+",salary= "+salary+"]";
	}
	
	
}