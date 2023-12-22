/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Sanket
 */
public class Java_Score extends JFrame implements ActionListener{

    public Java_Score(int score) {
        
//        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/score.png"));
//        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//		JLabel image = new JLabel(i1);
//                image.setBounds(0,200,300,150);
//                
//		add(image);
                
        JLabel qno = new JLabel("Thank You ");
        qno.setBounds(300, 35, 700, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(qno);
        
        JLabel Score = new JLabel("Your Score is :"+score);
        Score.setBounds(270, 200, 300, 30);
        Score.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(Score);
        
        JButton submit = new JButton("Restart");
        submit.setBounds(300, 270, 120, 30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
//        submit.setEnabled(false);
        add(submit);
        
         
        JLabel background;
        setSize(750,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\Quiz Application\\src\\Quiz Image\\Java Background.png");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0, 0, 750, 500);
	setLocation(200 , 150);
        add(background);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        setVisible(false);
        new Login();
        
    }
    
    
    
    
    public static void main(String[] args) {
        new Java_Score(0);
    }
    
}
