import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rate {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public rate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("REVIEW SYSTEM");
		frame.setBounds(100, 100, 696, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Poor");
		rdbtnmntmNewRadioItem.setFont(new Font("Segoe UI", Font.BOLD, 16));
		rdbtnmntmNewRadioItem.setBounds(58, 217, 102, 24);
		frame.getContentPane().add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Average");
		rdbtnmntmNewRadioItem_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		rdbtnmntmNewRadioItem_1.setBounds(58, 254, 102, 24);
		frame.getContentPane().add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmGood = new JRadioButtonMenuItem("Good");
		rdbtnmntmGood.setFont(new Font("Segoe UI", Font.BOLD, 16));
		rdbtnmntmGood.setBounds(58, 291, 149, 24);
		frame.getContentPane().add(rdbtnmntmGood);
		
		JRadioButtonMenuItem rdbtnmntmBest = new JRadioButtonMenuItem("Best");
		rdbtnmntmBest.setFont(new Font("Segoe UI", Font.BOLD, 16));
		rdbtnmntmBest.setBounds(58, 328, 149, 24);
		frame.getContentPane().add(rdbtnmntmBest);
		
		JRadioButtonMenuItem rdbtnmntmExcellent = new JRadioButtonMenuItem("Excellent");
		rdbtnmntmExcellent.setFont(new Font("Segoe UI", Font.BOLD, 16));
		rdbtnmntmExcellent.setBounds(58, 365, 149, 24);
		frame.getContentPane().add(rdbtnmntmExcellent);
		
		JLabel lblAnyOtherComments = new JLabel("Any other Comments :");
		lblAnyOtherComments.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAnyOtherComments.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnyOtherComments.setBounds(344, 143, 162, 36);
		frame.getContentPane().add(lblAnyOtherComments);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(316, 200, 321, 233);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSelectAnyOne = new JLabel("Select any one :");
		lblSelectAnyOne.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectAnyOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectAnyOne.setBounds(28, 155, 124, 21);
		frame.getContentPane().add(lblSelectAnyOne);
		
		JLabel lblShareYourExperiences = new JLabel("Share your Experiences with us !!!");
		lblShareYourExperiences.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblShareYourExperiences.setHorizontalAlignment(SwingConstants.CENTER);
		lblShareYourExperiences.setBounds(80, 25, 398, 36);
		frame.getContentPane().add(lblShareYourExperiences);
		
		JLabel lblHowWasYour = new JLabel("How was your travel?");
		lblHowWasYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowWasYour.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHowWasYour.setBounds(28, 84, 213, 24);
		frame.getContentPane().add(lblHowWasYour);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(195, 439, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
