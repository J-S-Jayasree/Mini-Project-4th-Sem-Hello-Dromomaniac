import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
public class existing{
public static int check=0;
	public JFrame frame;
	private JPasswordField pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					existing window = new existing();
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
	public existing() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ENJOY YOUR JOURNEY BY GIVING FEEDBACK");
		frame.setBounds(100, 100, 775, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel pass1 = new JLabel("Enter password : (min 8 characters)");
		pass1.setHorizontalAlignment(SwingConstants.CENTER);
		pass1.setFont(new Font("Tahoma", Font.BOLD, 14));
		pass1.setBounds(119, 67, 290, 36);
		frame.getContentPane().add(pass1);
		
		pass2 = new JPasswordField();
		pass2.setBounds(315, 125, 216, 36);
		frame.getContentPane().add(pass2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			String name,pass,url;
			Connection con=null;
			public void actionPerformed(ActionEvent e) {
			try {
				
				 Class.forName("com.mysql.cj.jdbc.Driver");  
				    url="jdbc:mysql://localhost:3306/tourist";  
				        name="root";  
				        pass="indira@123";  
				        con = DriverManager.getConnection(url,name,pass);  
				        System.out.println("Connection created"); 
				        Statement myStmt=con.createStatement();
				        String s1="Select * from `tour table` where Password='"+pass2.getText()+"'";
				        ResultSet rs=myStmt.executeQuery(s1);
				        if(rs.next())
				        {
				        	JOptionPane.showMessageDialog(null, "Password correct");
				        	check=1;
				        	EventQueue.invokeLater(new Runnable() {
				    			public void run() {
				    				try {
				    					rate window = new rate();
				    					window.frame.setVisible(true);
				    				} catch (Exception e) {
				    					e.printStackTrace();
				    				}
				    			}
				    		});
			        
				        
				        }
				        else
				        	JOptionPane.showMessageDialog(null, "Password incorrect");
				        con.close();
			}
			catch(Exception e1) {
				System.out.println(e1.toString());
			}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(313, 217, 111, 27);
		frame.getContentPane().add(btnLogin);
		
		JButton btnForgot = new JButton("Forgot");
		btnForgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnForgot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnForgot.setBounds(470, 219, 97, 25);
		frame.getContentPane().add(btnForgot);
		
		
		
	}
}
