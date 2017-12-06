package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.Color;

public class Test extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		
		setBounds(100, 100, 464, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Check the your knowledge");
		lblNewLabel.setFont(new Font("Centaur", Font.PLAIN, 18));
		lblNewLabel.setBounds(135, 11, 186, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. My mother is a good cook. ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 46, 260, 24);
		contentPane.add(lblNewLabel_1);
	
		JRadioButton rdbtnNewRadioButton = new JRadioButton("I agree to you.");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 77, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("I agree with you.");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(136, 77, 134, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I agree you.");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(272, 77, 131, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		 
		
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("2. Do you like reading books?");
		lblNewLabel_2.setBounds(10, 119, 186, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yes, I do.");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(10, 140, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yes, I like.");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(121, 140, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Yes, I have.");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(235, 140, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("3. I ___ baseball very much.");
		lblNewLabel_3.setBounds(10, 179, 160, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("am");
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(10, 200, 55, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("have");
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(93, 200, 61, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("like");
		buttonGroup_2.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(235, 200, 109, 23);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JLabel lblNewLabel_4 = new JLabel("4. What were you doing last night at 7:00?");
		lblNewLabel_4.setBounds(10, 230, 235, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("I was sleeping.");
		buttonGroup_3.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setBounds(0, 251, 109, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("I slept.");
		buttonGroup_3.add(rdbtnNewRadioButton_10);
		rdbtnNewRadioButton_10.setBounds(124, 251, 109, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("I will be sleeping.");
		buttonGroup_3.add(rdbtnNewRadioButton_11);
		rdbtnNewRadioButton_11.setBounds(249, 251, 131, 23);
		contentPane.add(rdbtnNewRadioButton_11);
		
		JLabel lblNewLabel_5 = new JLabel("5. Where can I buy beer?");
		lblNewLabel_5.setBounds(10, 289, 160, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("When you are twenty years old.");
		buttonGroup_4.add(rdbtnNewRadioButton_12);
		rdbtnNewRadioButton_12.setBounds(0, 310, 211, 23);
		contentPane.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("At a liquor store.");
		buttonGroup_4.add(rdbtnNewRadioButton_13);
		rdbtnNewRadioButton_13.setBounds(213, 310, 131, 23);
		contentPane.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("With Jane.");
		buttonGroup_4.add(rdbtnNewRadioButton_14);
		rdbtnNewRadioButton_14.setBounds(346, 310, 96, 23);
		contentPane.add(rdbtnNewRadioButton_14);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setBounds(156, 348, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(235, 46, 80, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(180, 119, 63, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(180, 179, 75, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(265, 230, 68, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(215, 289, 75, 14);
		contentPane.add(lblNewLabel_10);
		
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent g) {
			
				if(rdbtnNewRadioButton_1.isSelected()){
					
					 lblNewLabel_6.setText("True");
					 lblNewLabel_6.setForeground(new Color(0, 51, 255));
				}
				
				else{
					lblNewLabel_6.setText("False");
					lblNewLabel_6.setForeground(new Color(255, 0, 0));
					
					
				}
				
				

				if(rdbtnNewRadioButton_3 .isSelected()){
					
					 lblNewLabel_7.setText("True");
					 lblNewLabel_7.setForeground(new Color(0, 51, 255));
				}
				else{
					
					lblNewLabel_7.setText("False");
					lblNewLabel_7.setForeground(new Color(255, 0, 0));
				}

				
				if(rdbtnNewRadioButton_8.isSelected()){
					
					 lblNewLabel_8.setText("True");
					 lblNewLabel_8.setForeground(new Color(0, 51, 255));
				}
				else{
					
					lblNewLabel_8.setText("False");
					lblNewLabel_8.setForeground(new Color(255, 0, 0));
				}

				
				if(rdbtnNewRadioButton_9.isSelected()){
					
					 lblNewLabel_9.setText("True"); 
					 lblNewLabel_9.setForeground(new Color(0, 51, 255));
				}
                else{
					
					lblNewLabel_9.setText("False");
					lblNewLabel_9.setForeground(new Color(255, 0, 0));
				}
				
				if(rdbtnNewRadioButton_13.isSelected()){
					
					 lblNewLabel_10.setText("True");
					 lblNewLabel_10.setForeground(new Color(0, 51, 255));
				}
				
				else{
					 
					 lblNewLabel_10.setText("False");
					 lblNewLabel_10.setForeground(new Color(255, 0, 0));
				}
				
				
				
				
			}
			
		});
		
		
		
		
		
		
	}
}
