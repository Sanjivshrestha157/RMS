package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;

class NewButtons extends JFrame implements ActionListener
{
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JPanel p,p1,p2;

	public NewButtons(String d)
	{
		super(d);
		final int WINDOW_WIDTH = 750, WINDOW_HEIGHT = 750;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//		setBorder(BorderFactory.createBevelBorder(10)));
		b1=new JButton("Food Menu");
		b1.addActionListener(this);
		b2=new JButton("Employee");
		b2.addActionListener(this);
		b3=new JButton("Table");
		b3.addActionListener(this);
		b4=new JButton("Order");
		b4.addActionListener(this);
		b5=new JButton("Bill");
		b5.addActionListener(this);
		p1=new JPanel();
		
		/*
		 * b1.setBackground(Color.BLUE); b2.setBackground(Color.BLUE);
		 * b3.setBackground(Color.BLUE); b4.setBackground(Color.BLUE);
		 * b5.setBackground(Color.BLUE);
		 */
		 
		p1.setLayout(new GridLayout(3,3));
//		setContentPane(new JLabel(new ImageIcon("rms.jpg")));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		add(p1);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b1));
		{
			setVisible(false);
			new FoodMenu("Food Menu");}
		if(e.getSource().equals(b2));
		{
			setVisible(false);
		new Employee("Employee");
		}
		if(e.getSource().equals(b3));
		{new Table("Table");}
		if(e.getSource().equals(b4));
		{new Order("Order");}
		if(e.getSource().equals(b5));
		{new Bill("Bill");}
	}
	
}