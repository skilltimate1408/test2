package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class product {

	private JFrame frame;
   int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					product window = new product();
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
	public product() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 959, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(308, 10, 138, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\book1.PNG"));
		lblNewLabel_1.setBounds(30, 59, 204, 200);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b1.PNG"));
		lblNewLabel_2.setBounds(285, 59, 161, 200);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b7.PNG"));
		lblNewLabel_3.setBounds(534, 74, 167, 185);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lb = new JLabel("Cart : ");
		lb.setFont(new Font("Tahoma", Font.BOLD, 30));
		lb.setBounds(575, 16, 167, 46);
		frame.getContentPane().add(lb);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "PDF", "Kindel", "Paper"}));
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setBounds(86, 326, 89, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 20));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paper", "Pdf", "Kindel"}));
		c2.setBounds(308, 324, 96, 21);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("120/-");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(102, 289, 73, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("160/-");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(328, 289, 73, 25);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("110/-");
		lblNewLabel_4_1_1.setForeground(Color.RED);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(607, 289, 73, 25);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paper", "Pdf", "Kindel"}));
		c3.setFont(new Font("Tahoma", Font.BOLD, 20));
		c3.setBounds(587, 324, 96, 21);
		frame.getContentPane().add(c3);
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+ i);
			   int p=120;
			   String t=(String) c1.getSelectedItem();
			   JOptionPane.showMessageDialog(btnNewButton, "Price: "+p+"\n type:"+t);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(43, 357, 168, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+ i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(278, 357, 168, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+ i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(555, 357, 168, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}

}
