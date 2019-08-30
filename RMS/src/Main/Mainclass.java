package Main;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.Border;

import Database.*;
import Model.Login;

import javax.imageio.ImageIO;

public class Mainclass extends JFrame {
	private JLabel label1,label2,image,wel;
	private JTextField text1,text2;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JPanel p,p1,p2;
	private JCheckBox c;
	Database db;
	public Mainclass(String title) {
		super(title);
		
//		  final int WINDOW_WIDTH = 750, WINDOW_HEIGHT = 750; 
		Dimension dim= getPreferredSize();
		dim.width=700;
		dim.height=700;
		setSize(dim);
//		setBorder(BorderFactory.createEmptyBorder(5,5,5,5)));
		 
		
//		setImageIcon("rms.jpg");
		ImageIcon image1=new ImageIcon("rms.jpg");
		image=new JLabel(image1);
		wel=new JLabel("Welcome To Restaurant Management System ");
		wel.setBackground(Color.BLUE);
		/* image.setText("Restaurant"); */
		label1=new JLabel("Username");
		text1=new JTextField(10);
		label2=new JLabel("Password");
		text2=new JTextField(10);
		b1=new JButton("Login");
		b1.setBackground(Color.GREEN);
		//b1.setActionCommand("");
		b1.addActionListener(new Buttons());
		/*
		 * b2=new JButton("Cancel"); b2.addActionListener(new Buttons());
		 */
		c=new JCheckBox("Remember me");
		p=new JPanel();
		 p.setLayout(new GridBagLayout()); 
		p1=new JPanel();
		/* p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); */
		p1.add(wel);
		p1.add(image);
		p.add(label1);
		p.add(text1);
		p.add(label2);
		p.add(text2);
		p.add(c);
		p.add(b1);
		p1.add(p);
		/* p.add(b2); */
		p.setBackground(Color.CYAN);
		add(p1);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
	new Mainclass("Restaurant Management System");

	}
	class Buttons implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
//			if(text1.getText().equals("Rabin")&&(text2.getText().contentEquals("Lamichhane")))
			{
				
				  String name=text1.getText(); 
				  String u=text2.getText();
				  try {
					db=new Database();
				  // Login l=newLogin(name,u); 
			      Login l1=db.getAccess(name,u); 
				  if(l1!=null) {
				 
						JOptionPane.showMessageDialog(null, "Login Succesful");
						dispose();
						NewButtons n=new NewButtons("Restaurant Management System");
				
				  } 
				  else
					  {
					  	JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
					  }} catch (SQLException e1) { e1.printStackTrace(); } catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 	
				/*
				 * b3=new JButton("Food Menu"); b4=new JButton("Employee"); b5=new
				 * JButton("Table"); b6=new JButton("Order"); b7=new JButton("Bill"); p1=new
				 * JPanel(); p1.add(b3); p1.add(b4); p1.add(b5); p1.add(b6); p1.add(b7);
				 * add(p1); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setVisible(true);
				 */
				
				
			}
			
		}
		
	}

}

