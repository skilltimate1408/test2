package Sendata;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class reg {

	private JFrame frame;
	private JTextField n;
	private JTextField em;
	private JPasswordField p;
	private JTextField m;
	private JButton btnNewButton;
	private JRadioButton r1;
	private JRadioButton r2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		n = new JTextField();
		n.setBounds(267, 42, 240, 49);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		p = new JPasswordField();
		p.setBounds(256, 232, 281, 42);
		frame.getContentPane().add(p);
		
		em = new JTextField();
		em.setBounds(267, 147, 248, 42);
		frame.getContentPane().add(em);
		em.setColumns(10);
		
		m = new JTextField();
		m.setBounds(267, 323, 262, 42);
		frame.getContentPane().add(m);
		m.setColumns(10);
		
		btnNewButton = new JButton("click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=n.getText();
				String email=em.getText();
				String pass=p.getText();
				String mobile=m.getText();
				String gender;
				if(r1.isSelected())
				{
					gender="Female";
				}
				else if(r2.isSelected())
				{
					gender="male";
				}
				else
				{
					gender="invalid";
				}
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd", "root", "Welcome@123");
					String query = "INSERT INTO ac values('"+name+"','"+email+"','"+pass+"','"+mobile+"','"+gender+"')";
					Statement sta = connection.createStatement();
					 int x = sta.executeUpdate(query);
					 connection.close();
					 JOptionPane.showMessageDialog(btnNewButton, "Done!"+gender);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(267, 390, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		r1 = new JRadioButton("female");
		r1.setBounds(20, 116, 200, 50);
		frame.getContentPane().add(r1);
		
		r2 = new JRadioButton("male");
		r2.setBounds(20, 197, 200, 50);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);
		bg.add(r2);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
