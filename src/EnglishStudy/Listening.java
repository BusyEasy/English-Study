package EnglishStudy;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import sun.audio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Listening extends JFrame{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listening frame = new Listening();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	

	}
	
	
	
	public Listening() {
		
		setBounds(100, 100, 450, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    lblNewLabel = new JLabel("Listening 1");
	    lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setFont(new Font("Castellar", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 30, 153, 32);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Listening");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(132, 11, 90, 19);
		contentPane.add(lblNewLabel_2);
		
		 lblNewLabel.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent me) { 
	        	  InputStream in; 
	        	  
	        	  if(me.getSource()==lblNewLabel){
	        		 
	        		try{
	        			 in = new FileInputStream(new File("English listening.wav"));
	        			
	        		Player music = new Player(in);
	        			
	        			music.play();
	        			
	        		}
	        		catch(Exception t){
	        			
	        		}
	        	  }
	        	 
	          } 
	          
	          
	        });
	        	  
		

	       
		
	
		
		
		
		
		
		
	}
}

