package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pro {

	private JFrame frame;
   int i=0;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pro window = new pro();
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
	public pro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b1.PNG"));
		lblNewLabel.setBounds(22, 42, 139, 181);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b3.PNG"));
		lblNewLabel_1.setBounds(226, 49, 131, 174);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lb = new JLabel("Cart : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 30));
		lb.setBounds(359, 10, 148, 39);
		frame.getContentPane().add(lb);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "PDF", "Paper", "Kindel"}));
		c1.setBounds(32, 228, 103, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "PDF", "Paper", "Kindel"}));
		c2.setBounds(248, 233, 109, 21);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			int c;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+i);
				
				String s=(String) c1.getSelectedItem();
				
				if(s.equals("PDF"))
				{
					int c=150;
					JOptionPane.showMessageDialog(btnNewButton, "Select Item cost :"+c+"\n type:"+s);
				}
				else if(s.equals("Paper"))
				{
					int c=100;
					JOptionPane.showMessageDialog(btnNewButton, "Select Item cost :"+c+"\n type:"+s);
				}
				else if(s.equals("Kindel"))
				{
					int c=180;
					JOptionPane.showMessageDialog(btnNewButton, "Select Item cost :"+c+"\n type:"+s);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid");
				}
			}
		});
		btnNewButton.setBounds(42, 259, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.setBounds(258, 264, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}

}
