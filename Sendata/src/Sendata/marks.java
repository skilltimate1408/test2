package Sendata;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class marks {

	private JFrame frame;
	private JTextField name;
	private JTable jbtable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marks window = new marks();
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
	public marks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setBounds(174, 110, 190, 45);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JComboBox sno = new JComboBox();
		sno.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		sno.setBounds(174, 32, 190, 38);
		frame.getContentPane().add(sno);
		
		JComboBox marks = new JComboBox();
		marks.setModel(new DefaultComboBoxModel(new String[] {"45", "78"}));
		marks.setBounds(174, 192, 190, 45);
		frame.getContentPane().add(marks);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=(String) sno.getSelectedItem();
				String n=name.getText();
				String m=(String) marks.getSelectedItem();
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd", "root", "Welcome@123");
					String query = "INSERT INTO test values('"+s+"','"+n+"','"+m+"')";
					Statement sta = connection.createStatement();
					 int x = sta.executeUpdate(query);
					 connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(btnNewButton, s);
				
			}
		});
		btnNewButton.setBounds(208, 304, 127, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd", "root", "Welcome@123");
					Statement sta = connection.createStatement();
					String query="select * from test";
					ResultSet rs=sta.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) jbtable.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++)
					{
						colName[i]=rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						//-----------------------------------------
						String s,n,m;
						while(rs.next())
						{
							s=rs.getString(1);
							n=rs.getString(2);
							m=rs.getString(3);
							String[] row= {s,n,m};
							model.addRow(row);
						}
						sta.close();
						connection.close();
					}
				
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(525, 41, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(437, 101, 420, 308);
		frame.getContentPane().add(scrollPane);
		
		jbtable = new JTable();
		jbtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(jbtable);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtable.setModel(new DefaultTableModel());
			}
		});
		btnNewButton_2.setBounds(714, 41, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
	}
}
