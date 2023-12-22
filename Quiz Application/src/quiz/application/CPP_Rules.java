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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class CPP_Rules   extends JFrame implements ActionListener{
    
    JButton Start,Back;
    String name;
    
    public CPP_Rules(String name) {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
                        
        JLabel rule = new JLabel("Welcome");
        rule.setBounds(50,60,300,45);
        rule.setFont(new Font("MV Boli" , Font.BOLD, 30 ));
        rule.setForeground(new Color(179, 179, 255));
        add(rule);
        
         JLabel rule1 = new JLabel("Rules for C++ MCQ Test");
        rule1.setBounds(50,100,400,45);
        rule1.setFont(new Font("MV Boli" , Font.BOLD, 30 ));
        rule1.setForeground(new Color(179, 179, 255));
        add(rule1);
                
        JLabel rule2 = new JLabel();
        rule2.setBounds(50,150,350,100);
        rule2.setFont(new Font("MV Boli" , Font.PLAIN, 14 ));
        rule2.setForeground(Color.BLACK);
        rule2.setText(
        "<html>"+
                "1. Questions will be MCQ formate."+"<br>"+
                "2. Select only one option."+"<br>"+
                "3. Every question takes 30 sec"+"<br>"+
                "4 Each question carries 1 mark"+"<br>"+
               
                "<html>"
        
        
        );
        
        add(rule2);
        
//        Back = new JButton("Back");
//        Back.setBounds(250, 500, 100, 30);
//        Back.setBackground(Color.BLACK);
//        Back.addActionListener(this);
//        add(Back);

        Back = new JButton("Back");
        Back.setBounds(50, 260, 100, 30);
        Back.setBackground(new Color(255, 255, 128));
         Back.setFont(new Font("MV Boli" , Font.BOLD, 20));

        Back.addActionListener(this);  
        add(Back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/C++.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(600,0,500,500);
        add(image);
        
        Start = new JButton("Start");
        Start.setBounds(200, 260, 100, 30);
        Start.setBackground(new Color(255, 255, 128));
         Start.setFont(new Font("MV Boli" , Font.BOLD, 20));

        Start.addActionListener(this);  
        add(Start);
        
        
           JLabel rule3 = new JLabel();
        rule3.setBounds(250,350,300,100);
        rule3.setFont(new Font("MV Boli" , Font.ITALIC, 30 ));
        rule3.setForeground(Color.BLACK);
        rule3.setText(
        "<html>"+
                "Best of luck !!!"+
               
                "<html>"
        
        
        );
        
        add(rule3);
        
        
        
       
        
        JLabel background;
        setSize(1200,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\Quiz Application\\src\\Quiz Image\\C++ Background.png");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0, 0, 1200, 500);
	setLocation(200 , 150);
        add(background);
	setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Start){
            setVisible(false);
            new Cpp_quiz(name);
            
        }
        else{
            setVisible(false);
            new Login();
        }
        


    }
    
    
    
    
    
    public static void main(String[] args) {
        new Java_Rules("User");
    }
    
}
