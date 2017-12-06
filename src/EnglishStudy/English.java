package EnglishStudy;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class English extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JLabel label;
	private JLabel lblNewLabel_1;
	
	
	public English() {
		
		
		
		getContentPane().setLayout(null);
		setTitle("Login and Password");
		
		textField = new JTextField();
		textField.setBounds(292, 69, 132, 20);
		getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 109, 132, 20);
		getContentPane().add(passwordField);
		
		
		textField.setColumns(10);
		
	    btnNewButton = new JButton("Sign in");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		
		try{
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e1) {
				
				
				if(textField.getText().equals("Assem")&&(passwordField.getText().equals("123"))){
					
				if(e1.getSource()== btnNewButton ){
					
					dispose();
					
					English2 english = new English2();
					english.setVisible(true);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "entered button");
				}
				}
				else{
					JOptionPane.showMessageDialog(null, "entered an incorrect username or password");
				}
				
			}
		});}
		catch(Exception r){
			JOptionPane.showMessageDialog(null, "Program ERROR");
		}
		
		btnNewButton.setBounds(315, 150, 89, 23);
		getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(English.class.getResource("/EnglishStudy/image/Study.jpg")));
		lblNewLabel.setBounds(0, 0, 650, 291);
		getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		

		
	}

	
	public static void main(String[]args){
		
		English a = new English();
		a.setVisible(true);
		a.setSize(600, 300);
		a.setLocationRelativeTo(null);
		a.setResizable(false);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
