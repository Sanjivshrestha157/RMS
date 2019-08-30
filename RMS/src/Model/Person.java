package Model;

public class Person {
	private String Name;
	private int Id;
	private String Address;
	private int ContactNo;
	public Person()
	{
		setName("");
		setId(0);
		setAddress("");
		setContactNo(0);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	public String tostring()
	{
		return Name+" "+Id+" "+Address+" "+ContactNo;}
}
