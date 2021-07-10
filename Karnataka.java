import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;



import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Karnataka{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	String[] args;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Karnataka window = new Karnataka();
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
	public Karnataka() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame("TRAVEL");
		frame.setBounds(100, 100, 892, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setBackground(Color.BLACK);
		
		JLabel lblNammaKarnatakaTravels = new JLabel("NAMMA KARNATAKA TRAVELS !!!");
		lblNammaKarnatakaTravels.setForeground(Color.CYAN);
		lblNammaKarnatakaTravels.setFont(new Font("Calibri", Font.BOLD, 47));
		lblNammaKarnatakaTravels.setBounds(85, 36, 754, 67);
		frame.getContentPane().add(lblNammaKarnatakaTravels);
		
		JButton btnNewUser = new JButton("NEW USER");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewUser.setBackground(Color.MAGENTA);
		btnNewUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewUser.setBounds(359, 217, 115, 40);
		frame.getContentPane().add(btnNewUser);
		
		JButton btnExistingUser = new JButton("EXISTING USER");
		btnExistingUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		});
		btnExistingUser.setBackground(Color.GREEN);
		btnExistingUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExistingUser.setBounds(328, 370, 182, 40);
		frame.getContentPane().add(btnExistingUser);
	}
}
