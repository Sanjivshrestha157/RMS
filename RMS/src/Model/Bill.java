package Model;

public class Bill {
	private int BillNo;
	private double total;
	Food a=new Food();
	String d=a.getFoodName();

	
public Bill()
{
	}
	public int getBillNo() {
		return BillNo;
	}

	public void setBillNo(int billNo) {
		BillNo = billNo;
	}

	public double getTotal() {
		return total;
	}

	public void Total() {
		total +=a.getUnitPrice();
		System.out.println(total);
	}

}
