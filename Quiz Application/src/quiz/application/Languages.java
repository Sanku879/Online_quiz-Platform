/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;



import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Sanket
 */
public class Languages extends JFrame implements ActionListener{
    JButton Start,Start1,Start2,Start3;
    String name;
    
   
    public Languages(String name) {
        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);


      
      
      
      pack();
        
        JLabel rule = new JLabel("Welcome "+ name);
        rule.setBounds(450,60,300,45);
        rule.setFont(new Font("Arial Narrow" , Font.BOLD, 35 ));
        rule.setForeground(new Color(179, 179, 255));
        add(rule);
        
        
        
        Start = new JButton("Java Quiz");
        Start.setBounds(50, 130, 350, 70);
        Start.setBackground(new Color(255, 51, 153));
        Start.setFont(new Font("MV Boli" , Font.BOLD, 30));
        Start.addActionListener(this);  
        add(Start);
        
        
        Start1 = new JButton("C++ Quiz");
        Start1.setBounds(700, 130, 350, 70);
        Start1.setBackground(new Color(51, 255, 119));
        Start1.setFont(new Font("MV Boli" , Font.BOLD, 30));
        Start1.addActionListener(this);  
        add(Start1);
        
        Start2 = new JButton("C Quiz");
        Start2.setBounds(50, 260, 350, 70);
        Start2.setBackground(new Color(255, 255, 128));
         Start2.setFont(new Font("MV Boli" , Font.BOLD, 30));

        Start2.addActionListener(this);  
        add(Start2);
        
        
         Start3 = new JButton("Python Quiz");
        Start3.setBounds(700, 260, 350, 70);
        Start3.setBackground(new Color(128, 255, 255));
                Start3.setFont(new Font("MV Boli" , Font.BOLD, 30));

        Start3.addActionListener(this);  
        add(Start3);
        
        JLabel background;
        setSize(1200,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\Quiz Application\\src\\Quiz Image\\Languages Background.png");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0, 0, 1200, 500);
	setLocation(200 , 150);
        add(background);
	setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==Start){
//          String name =tfname.getText();
           setVisible(false);
           new Java_Rules(name);
      }
      else if(e.getSource()==Start1){
          setVisible(false);
          new CPP_Rules(name);
      }
       else if(e.getSource()==Start2){
          setVisible(false);
          new C_Rules(name);
      }
       else if(e.getSource()==Start3){
          setVisible(false);
          new Python_Rules(name);
      }
    }
    
    
    public static void main(String[] args) {
        new Languages("User");
    }
        
    
    
}
