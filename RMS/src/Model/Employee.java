package Model;

public class Employee extends Person {
	private int id;
	private String name;
	private String address;
	private int contact;
	public Employee(int id1, String n, String address1, int contact1) {
		id=id1;
		name=n;
		address=address1;
		contact=contact1;
	}
	public int getId()
	{
		return id;
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return address;
		
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getcontact()
	{
		return contact;
		
	}
	public void setContact(int contact)
	{
		this.contact=contact;
	}

	

}
