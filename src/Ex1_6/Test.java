package Ex1_6;

public class Test {

	public static void main(String[] args) {
		Account tk=new Account("1234","Thao");
		tk.setBalance(10000);
		System.out.println(tk.credit(50000));
		System.out.println(tk.debit(50000));
		
		Account tk1=new Account("123","Trang",20000);
		System.out.println(tk.transferTo(tk1, 100000));
		System.out.println(tk.toString());
	}

}
