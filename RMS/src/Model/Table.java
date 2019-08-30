package Model;

public class Table extends Customer {
public Table(String name, int id, String address) {
		super(name, id, address);
		// TODO Auto-generated constructor stub
	}

int tableno;
int capacity;
public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

String a[];

public int getTableno() {
	return tableno;
}

public void setTableno(int tableno) {
	this.tableno = tableno;
}

}
