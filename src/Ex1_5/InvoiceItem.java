
package Ex1_5;
public class InvoiceItem{
	private String id;
	private String decs;
	private int qty;
	private double unitPrice;
	public InvoiceItem(String id, String decs, int qty, double unitPrice) {
		this.id = id;
		this.decs = decs;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDecs() {
		return decs;
	}
	public void setDecs(String decs) {
		this.decs = decs;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		return unitPrice*qty;
	}
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", decs=" + decs +
		 ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}	
	
}
