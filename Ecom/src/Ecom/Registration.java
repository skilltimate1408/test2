package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame rframe;
	private JTextField t2;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rframe = new JFrame();
		rframe.setBounds(100, 100, 688, 459);
		rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(168, 10, 265, 51);
		rframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(56, 90, 87, 44);
		rframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email Id");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(56, 163, 87, 44);
		rframe.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ph.No");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(56, 239, 87, 44);
		rframe.getContentPane().add(lblNewLabel_1_2);
		
		t2 = new JTextField();
		t2.setBounds(184, 88, 171, 38);
		rframe.getContentPane().add(t2);
		t2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 163, 175, 36);
		rframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 239, 175, 36);
		rframe.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t2.getText();
				JOptionPane.showMessageDialog(btnNewButton, n+" Registration Done!");
			   
				login l=new login();
			     l.lb2.setText(n+" Please login!");
				l.lframe.setVisible(true);
				rframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(159, 333, 125, 38);
		rframe.getContentPane().add(btnNewButton);
	}
}
