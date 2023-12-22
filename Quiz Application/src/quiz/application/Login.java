/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

/**
 *
 * @author Sanket
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    
    JButton Start;
    JTextField tfname;
    Login() {
		
            
		getContentPane().setBackground(Color.white);
		setLayout(null);
                
                
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/A.jpg"));
		JLabel image = new JLabel(i1);
                image.setBounds(0,0,600,470);
                
		add(image);
                
                JLabel heading = new JLabel("Online Quiz Platform");
                heading.setBounds(750, 60,400, 45);
		heading.setFont(new Font("Arial Black" , Font.BOLD, 28 ));
                heading.setForeground(Color.red); 
                add(heading);
                
                
                JLabel name = new JLabel("Enter Your Name");
                name.setBounds(800, 150,300, 45);
		name.setFont(new Font("MV Boli" , Font.BOLD, 23 ));
                name.setForeground(new Color(179, 179, 255)); 
                add(name);
                
                tfname = new JTextField();
                tfname.setBounds(760, 200, 300, 25);
                tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
                
                add(tfname);
                
                Start = new JButton("Start test");
                Start.setBounds(850, 250, 120, 25);
                Start.setBackground(new Color(255, 179, 102));
                Start.addActionListener(this);
                add(Start);
		
		setSize(1200,500);
		setLocation(200 , 150);
		setVisible(true);
              
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==Start){
          String name =tfname.getText();
           setVisible(false);
           new Languages(name);
      }
    }
    
 
  
    
	public static void main(String[] args) {
		new Login();
	}
}
