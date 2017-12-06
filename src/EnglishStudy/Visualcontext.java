package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;

public class Visualcontext extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualcontext frame = new Visualcontext();
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
	public Visualcontext() {
		
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Next");
		tglbtnNewToggleButton.setFont(new Font("Kristen ITC", Font.PLAIN, 16));
		buttonGroup.add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Visualcontext.class.getResource("/Visual/11.jpg")));
		lblNewLabel.setBounds(52, 81, 339, 216);
		contentPane.add(lblNewLabel);
		
		    String image[] = {"11.jpg","2.jpg","3.jpg"};
		   
		    
		    tglbtnNewToggleButton.addActionListener(new ActionListener() {
		    	
		    	 int count=0;
		    	
			public void actionPerformed(ActionEvent e) {
				ImageIcon  [] imageList = new ImageIcon [3];
				for(int i=0; i<imageList.length; i++) {		
					imageList [i] = new ImageIcon(getClass().getResource("/Visual/"+image[i]));
			}
				if(count<0) count=1;
				if(count>=0 && count<image.length){
					lblNewLabel.setIcon(imageList[count]);
					count++;
					
				}
				
			}
		});
		    
		    
		tglbtnNewToggleButton.setBounds(270, 47, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("back");
		tglbtnNewToggleButton_1.setFont(new Font("Kristen ITC", Font.PLAIN, 16));
		buttonGroup.add(tglbtnNewToggleButton_1);
		
		    tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
		    	
			    public void actionPerformed(ActionEvent e) {
			    	 int count=0;
				
				ImageIcon  [] imageList = new ImageIcon [3];
				for(int i=0; i<imageList.length; i++) {		
					imageList [i] = new ImageIcon(getClass().getResource("/Visual/"+image[i]));
			}
				if(count>=image.length) count=image.length-2;
				if(count>=0 && count<image.length){
					lblNewLabel.setIcon(imageList[count]);
					count--;
					
				}
				
			}
					
			
		})
		    ;
		tglbtnNewToggleButton_1.setBounds(53, 47, 121, 23);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Describe the image");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Centaur", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(162, 11, 148, 25);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
