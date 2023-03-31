package Sendata;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class login {

	private JFrame frame;
	private JTextField un;
	private JPasswordField password;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 655, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		un = new JTextField();
		un.setBounds(156, 78, 250, 56);
		frame.getContentPane().add(un);
		un.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(169, 190, 237, 48);
		frame.getContentPane().add(password);
		JLabel lb = new JLabel("");
		lb.setBounds(273, 270, 146, 13);
		frame.getContentPane().add(lb);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=un.getText();
				String pass=password.getText();
				//lb.setText(pass);
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd", "root", "Welcome@123");
					String q="select count(*) from ac where email=? and pass=?";
					PreparedStatement ps=connection.prepareStatement(q);
					ps.setString(1, user);
					ps.setString(2, pass);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int count=rs.getInt(1);
					if(count==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid");
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "valid");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(169, 293, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass=password.getText();
				lb.setText(pass);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\eye.PNG"));
		btnNewButton_1.setBounds(416, 200, 47, 26);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
