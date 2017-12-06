package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import javazoom.jl.player.Player;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Topic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Topic frame = new Topic();
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
	public Topic() {
		
		setBounds(100, 100, 289, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		JLabel lblNewLabel = new JLabel("My favourite room ");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 32, 151, 22);
		contentPane.add(lblNewLabel);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		lblNewLabel.addMouseListener(new MouseAdapter() { 
		      public void mousePressed(MouseEvent me) { 
		        	
		     if(me.getSource()==lblNewLabel){

		    	 JFrame a = new JFrame();
		    	 a.setVisible(true);
		    	 a.setSize(400, 350);
		    	
		    	
		    	 JTextPane txtpnOneOfThe = new JTextPane();
		 		 txtpnOneOfThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		 		txtpnOneOfThe.setText("We have recently moved to a new flat, which is situated not far from the city center."
		 				+ " It�s a spacious three bedroom flat on the 5th floor. One room is for my parents, one room is for me and the last one if for our guests in case they decide to stay overnight.I like all the rooms in this flat but my favourite place is, of course, my bedroom. It�s like a small world where I keep all my textbooks, CDs, stuffed animals, dresses, magazines, posters and else."
		 				+ " I should say that my room is not big at all, but it stores lots of my possessions."
		 				+ " The only furniture I have there is my bed, my desk with the chair, my bookcase and my wardrobe. "
		 				+ "All my stuffed animals are placed on the bed. The books and magazines are in the bookcase and all my clothes are in the wardrobe");
		 		txtpnOneOfThe.setBounds(100, 90, 500, 661);
				a.getContentPane().add(txtpnOneOfThe);
				a.setLocationRelativeTo(null);
				a.setResizable(false);
		    	 
		     }
		          
		          }
		        });
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("I love my family");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Harrington", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 91, 136, 22);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() { 
		      public void mousePressed(MouseEvent me) { 
		        	
		     if(me.getSource()==lblNewLabel_1){
		    	 
		    	
		    	 JFrame u = new JFrame();
		    	 u.setVisible(true);
		    	 u.setSize(400, 450);
		    	 u.setLocationRelativeTo(null);
		 		 u.setResizable(false);
		    	 
		    	
		    	 JTextPane txtpnOneOfThe1 = new JTextPane();
		 		 txtpnOneOfThe1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		 		 txtpnOneOfThe1.setText("Every person has his own family. It may be good, unusual etc.I`d like to tell you about my family. It`s not very large. My mother doesn`t work. She is good, clever and she always waits for me from school. She can do everything and she teaches me a lot of things. I like her very much.My father is a captain of the police. He has a very responsible work. He helps people. He is seldom at home because he has a lot of work, but we know that he loves us. To my mind, my father is the best man I have ever met.I have a sister, called Ksyusha. She studies at the Ural Medical Academy. When she graduates from it, she`ll become a dentist. She is a creative person. She likes to write funny verses and compose songs. It`s always interesting and funny with her. She is sociable and she has a lot of friends. I miss Ksyusha very much because she lives in Yekaterinburg and I always wait for weekends when she comes home.");
		 		 txtpnOneOfThe1.setBounds(100, 90, 500, 661);
				 u.getContentPane().add(txtpnOneOfThe1);
		    	 
		     }
		          
		          }
		        });
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Why I love winter?");
		lblNewLabel_2.setForeground(new Color(127, 255, 0));
		lblNewLabel_2.setFont(new Font("Harrington", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 148, 136, 28);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setIcon(new ImageIcon(Topic.class.getResource("/EnglishStudy/image/Topic11.jpg")));
		lblNewLabel_3.setBounds(0, 0, 283, 272);
		contentPane.add(lblNewLabel_3);
		
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() { 
		      public void mousePressed(MouseEvent me) { 
		        	
		     if(me.getSource()==lblNewLabel_2){
		    	 
		    	
		    	 JFrame e = new JFrame();
		    	 e.setVisible(true);
		    	 e.setSize(400, 350);
		    	 e.setLocationRelativeTo(null);
		 		 e.setResizable(false);
		    	 
		    	
		    	 JTextPane txtpnOneOfThe1 = new JTextPane();
		 		 txtpnOneOfThe1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		 		 txtpnOneOfThe1.setText("It`s snowing! It`snowing outside! I`m sitting near the window and I`m very glad because winter has come."
		 		 		+ "I like winter very much. I like white snow and white trees and white houses. There is much snow in the wood and I can ski with my sister. We like to play snowballs. It`s great fun .My friends and I make big snowmen every winter."
		 		 		+ "We toboggan and sometimes play hockey with our boys.In winter there are a lot of holidays: my birthday and my mother`s birthday, New Year`s Day and Christmas, Father`s day in February. "
		 		 		+ "And so many presents! And so many merry games! And we have winter holidays too! And my grandma always cook a very tasty Christmas cake.");
		 		 txtpnOneOfThe1.setBounds(100, 90, 500, 661);
				 e.getContentPane().add(txtpnOneOfThe1);
		    	 
		     }
		          
		          }
		        });
		
		 
	        	  
	}

}
