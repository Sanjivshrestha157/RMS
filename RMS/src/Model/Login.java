package Model;

public class Login {
	private int Id;
	private String Name;
	private String UserName;
	private String Password;
	public Login() {
		Id=0;
		Name="";
		UserName="";
		Password="";
	}
	public Login(int Id, String Name, String UserName, String Password) {
		this.Id=Id;
		this.Name=Name;
		this.UserName=UserName;
		this.Password=Password;
	}
	public Login(String name2, String u) {
		UserName=name2;
		Password=u;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
