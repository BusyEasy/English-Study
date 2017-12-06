package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Reading extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reading frame = new Reading();
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
	public Reading() {
		
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnOneOfThe = new JTextPane();
		txtpnOneOfThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		txtpnOneOfThe.setText("One of the foremost American entertainers of the first part of the twentieth century was a part-Cherokee Native American named Will Rogers (1879-1935). Rogers was born in territory that would later become the state of Oklahoma and spent much of his youth riding horses and mastering the use of the lariat. These skills were refined into an entertainment act based on fancy rope tricks interspersed with humorous anecdotes and witty remarks. Traveling widely as a vaudeville entertainer, by 1915 Rogers had become a star act with the Ziegfeld Follies, a famous stage show. In 1918 his stage skills led to a new career as a movie actor both in silent films and later in the \"talkies.\"");
		txtpnOneOfThe.setBounds(116, 90, 379, 261);
		contentPane.add(txtpnOneOfThe);
		
		JLabel lblNewLabel = new JLabel("Read the text");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(0, 250, 154));
		lblNewLabel.setFont(new Font("Felix Titling", Font.PLAIN, 22));
		lblNewLabel.setBounds(221, 11, 180, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1 .setIcon(new ImageIcon(Reading.class.getResource("/EnglishStudy/image/book.jpg")));
		lblNewLabel_1.setBounds(0, 0, 584, 362);
		contentPane.add(lblNewLabel_1);
	
		
		setLocationRelativeTo(null);
		setResizable(false);
	
	}
}
