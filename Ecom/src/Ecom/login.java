package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	 JFrame lframe;
	private JTextField t1;
	private JPasswordField p1;
	JLabel lb2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.lframe.setVisible(true);
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
		lframe = new JFrame();
		lframe.setBounds(100, 100, 621, 411);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(187, 10, 118, 50);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(38, 124, 199, 44);
		lframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(38, 210, 199, 44);
		lframe.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(197, 124, 199, 36);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(197, 210, 199, 36);
		lframe.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=t1.getText();
				String ps=p1.getText();
				if(un.equals("MREC") && ps.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(152, 299, 131, 36);
		lframe.getContentPane().add(btnNewButton);
		
		 lb2 = new JLabel("");
		lb2.setBounds(316, 66, 189, 19);
		lframe.getContentPane().add(lb2);
	}
}
