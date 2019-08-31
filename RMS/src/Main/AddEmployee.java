package Main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.Database;
import Model.*;


public class AddEmployee extends JFrame implements ActionListener{
	JPanel panel1;
	JLabel idLbl, nameLbl, addressLbl, contactLbl;
	JTextField id,name, address, contact;
	JButton add, cancel;
	Database db;
	Employee obj;
	public AddEmployee() {
		super("Add New Employee");
		this.obj = obj;
		final int WINDOW_WIDTH = 450, WINDOW_HEIGHT = 450;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		try {
			db = new Database();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initializeAll();
		pack();
		setVisible(true);
	}
	public void initializeAll() {
		panel1 = new JPanel();
//		panel1.setLayout(new GridLayout(4, 2));
		panel1.setBorder(BorderFactory.createBevelBorder(10));

		idLbl = new JLabel("Id: ");
		panel1.add(idLbl);
		id = new JTextField(10);
		panel1.add(id);

		nameLbl = new JLabel("Name: ");
		panel1.add(nameLbl);
		name = new JTextField(10);
		panel1.add(name);

		addressLbl = new JLabel("Address: ");
		panel1.add(addressLbl);
		address = new JTextField(10);
		panel1.add(address);
		
		contactLbl = new JLabel("Contact: ");
		panel1.add(contactLbl);
		contact = new JTextField(10);
		panel1.add(contact);

		add = new JButton("Add");
		add.addActionListener(this);
		panel1.add(add);

		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		panel1.add(cancel);

		add(panel1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add)) {
			int id1=Integer.parseInt( id.getText());
			String contact1 =contact.getText();
			String n = name.getText();
			String address1 = address.getText();
			Model.Employee v = new Model.Employee(id1,n, address1, contact1);
			try {
				db.addEmployee(v);
				JOptionPane.showMessageDialog(null, "Employee has been successfully added");
				setVisible(false);
				obj.setVisible(true);
				dispose();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource().equals(cancel)) {
			setVisible(false);
			obj.setVisible(true);
			dispose();
		}
	}
		
	}


