package Database;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Model.*;

public class Database {
	String url = "jdbc:mysql://localhost:3306/rms";
	String username = "root";
	String password = "";
	String sql = "",s1,s2,s3,s4,s5;
	Statement stmt;
	ResultSet rs;
	Connection con;
	public Database() throws SQLException, ClassNotFoundException {
		con = (Connection) DriverManager.getConnection(url, username, password);
		Class.forName("com.mysql.jdbc.Driver");
	}
	
	
	  public void addEmployee(Employee e1) throws SQLException {
	  s1 = "insert into employee (Id,Name,Address,ContactNo) " ;
	  s2="values("+e1.getId()+", '" + e1.getName() + "', '" + e1.getAddress() +"',"+ e1.getContactNo()+")"; //
	  sql=s1+s2;
		/* PreparedStatement p = (PreparedStatement) con.prepareStatement(sql); */
	  stmt = (Statement) con.createStatement();
	  stmt.executeUpdate(sql); 
	  stmt.close();
	  }
	  public void deleteEmployee(int id,String name) throws SQLException{
		  s1="delete from employee";
		  s2="Id=? and";
		  s3="Name=?";
		  sql=s1+s2+s3;
		  PreparedStatement stmt=(PreparedStatement) con.prepareStatement(sql);
		  stmt.setInt(1,id);
		  stmt.setString(2,name);
		  stmt.executeUpdate(sql);
		  stmt.close();
	  }
	  public List<Employee> ListEmployee() throws SQLException {
			Employee v;
			List<Employee> vList = new ArrayList<Employee>();
			sql = "SELECT * FROM employee";
			// 3. prepare sql statement to be executed
			stmt = (Statement) con.createStatement();
			// 4 get the resultset from execution
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				int contact = rs.getInt(4);
				v = new Employee(id, name, address, contact);
				vList.add(v);

			}
			rs.close();
			stmt.close();
			return vList;
		}
	  public void addFoodmenu(Food e1) throws SQLException {
		  s1 = "insert into foodmenu (ItemNo,FoodName,UnitPrice,Category) " ;
		  s2="values("+e1.getItemNo()+", '" + e1.getFoodName() + "', " + e1.getUnitPrice() +",'"+ e1.getCategory()+"')"; //
		  sql=s1+s2;
			/* PreparedStatement p = (PreparedStatement) con.prepareStatement(sql); */
		  stmt = (Statement) con.createStatement();
		  stmt.executeUpdate(sql); 
		  stmt.close();
		  }
	  public List<Food> Listmenu() throws SQLException {
			Food v;
			List<Food> vList = new ArrayList<Food>();
			sql = "SELECT * FROM foodmenu";
			// 3. prepare sql statement to be executed
			stmt = (Statement) con.createStatement();
			// 4 get the resultset from execution
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				int itemno = rs.getInt(1);
				String foodname = rs.getString(2);
				int unitprice = rs.getInt(3);
				String category = rs.getString(4);
				v = new Food(itemno, foodname, unitprice, category);
				vList.add(v);

			}
			rs.close();
			stmt.close();
			return vList;
		}
	  public void deleteFoodmenu(int item,String foodname) throws SQLException{
		  s1="delete from foodmenu";
		  s2="ItemNo=? and";
		  s3="FoodName=?";
		  sql=s1+s2+s3;
		  PreparedStatement stmt=(PreparedStatement) con.prepareStatement(sql);
		  stmt.setInt(1,item);
		  stmt.setString(2,foodname);
		  stmt.executeUpdate(sql);
		  stmt.close();
	  }
	 
	public Login getAccess(String username,String password) throws SQLException
	{
		Login l=null;
		/*
		 * s1="SELECT "; s2="* FROM 'login'"; s5=" WHERE"; s3=" UserName=?";
		 * s4=" Password=?"; sql=s1+s2+s5+s3+s4; // 3. prepare sql statement to be
		 * executed PreparedStatement p = (PreparedStatement) con.prepareStatement(sql);
		 * p.setString(1, username); p.setString(2, password);
		 */
		sql="select * from login where UserName='"+username+"' and Password='"+password+"'";
		stmt = (Statement) con.createStatement();
		// 4 get the resultset from execution
		rs = stmt.executeQuery(sql);
				while (rs.next()) {
			
			  int Id = rs.getInt(1); 
			  String Name = rs.getString(2);
			 String UserName = rs.getString(3);
			String Password = rs.getString(4);
			l = new Login(Id,Name,UserName, Password);
				}
				rs.close();
				stmt.close();
				return l;
		
		
	}

}
