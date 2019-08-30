package Model;

public class Employee extends Person {
	private int id;
	private String name;
	private String address;
	private String contact;
	public Employee(int id1, String n, String address1, String contact1) {
		id=id1;
		name=n;
		address=address1;
		contact=contact1;
	}
	public int getId()
	{
		return id;
		
	}
	public String getName()
	{
		return name;
		
	}
	public String getAddress()
	{
		return address;
		
	}
	public String getcontact()
	{
		return contact;
		
	}

	

}
