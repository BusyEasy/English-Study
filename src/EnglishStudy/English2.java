package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class English2 extends JFrame implements ActionListener {
	
 	private JButton btnNewButton;
 	private JButton btnNewButton_1;
	public English2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to the English language");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 22));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(147, 0, 332, 46);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choose the category to study");
		lblNewLabel_2.setFont(new Font("Felix Titling", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(168, 57, 295, 32);
		getContentPane().add(lblNewLabel_2);
		
	    btnNewButton = new JButton("Reading");
	    btnNewButton.setForeground(new Color(255, 0, 0));
	    btnNewButton.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		btnNewButton.setBounds(94, 100, 102, 33);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Topics");
		btnNewButton_1.setForeground(new Color(0, 0, 205));
		btnNewButton_1.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		btnNewButton_1.setBounds(94, 158, 102, 28);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(this); 
		
		btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent y) {
				
				
					if(y.getSource()==btnNewButton_1){
						
						Topic h = new Topic();
						h.setVisible(true);			
					}
				}
	
		});

		JButton btnNewButton_2 = new JButton("Take the test");
		btnNewButton_2.setForeground(new Color(255, 105, 180));
		btnNewButton_2.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		btnNewButton_2.setBounds(361, 100, 136, 32);
		getContentPane().add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent b) {
				
				if(b.getSource()==btnNewButton_2){
					
					Test y = new Test();
					y.setVisible(true);
					y.setLocationRelativeTo(null);
					y.setResizable(false);
				}
				
				
				
                 			
			}
		
			
		});
		
		JButton btnNewButton_3 = new JButton("Listening");
		btnNewButton_3.setForeground(new Color(199, 21, 133));
		btnNewButton_3.setFont(new Font("Felix Titling", Font.PLAIN, 13));
		btnNewButton_3.setBounds(94, 207, 102, 32);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Visual context");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnNewButton_4){
					
					 Visualcontext b = new  Visualcontext();
					 b.setVisible(true);
					 
					
					
				}
			}
		});
		
		
		
		btnNewButton_4.setForeground(new Color(72, 61, 139));
		btnNewButton_4.setFont(new Font("Felix Titling", Font.PLAIN, 10));
		btnNewButton_4.setBounds(361, 157, 136, 32);
		getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(English2.class.getResource("/EnglishStudy/image/Big-Benjpg.jpg")));
		lblNewLabel.setBounds(0, 0, 584, 362);
		getContentPane().add(lblNewLabel);
		
		
		
		btnNewButton_3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent b) {
				
				if(b.getSource()==btnNewButton_3){
					
					Listening w = new Listening();
					w.setVisible(true);
					
					
				}
				
					if(b.getSource()==btnNewButton_1){
						
						Topic h = new Topic();
						h.setVisible(true);
						
					}
				}
				
		
			
		});
		
		
		
		
	}

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					English2 frame = new English2();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNewButton){
			
			Reading a = new Reading();
			a.setVisible(true);
			
			
		}
		
		
			
		
		
		
	}
}
