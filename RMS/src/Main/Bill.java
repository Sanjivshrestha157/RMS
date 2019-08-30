package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bill extends JFrame implements ActionListener {
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JPanel p,p1,p2;
	public Bill(String d) {
		super(d);
		final int WINDOW_WIDTH = 750, WINDOW_HEIGHT = 750;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		b1=new JButton("ADD");
		b1.addActionListener(this);
		b2=new JButton("EDIT");
		b2.addActionListener(this);
		b3=new JButton("DELETE");
		p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		add(p1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
