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
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class C_Quiz  extends JFrame implements ActionListener{
    
    String question[][] = new String[10][5];
    String answers[][] = new String[10][2];

    JLabel qno,questions;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 60;
    public static int ans_given = 0;
    ButtonGroup groupoptions;
    String useranswer[][]= new String[10][1];
    public static int count = 0;
    JButton next,submit;
    public static int score=0;
    String name;
    
    public C_Quiz(String name) {
        this.name=name;
        setBounds(50, 0, 1440, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/Test.jpg"));
		JLabel image = new JLabel(i1);
                image.setBounds(0,0,1440,392);
                
		add(image);
                
        qno = new JLabel("");
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(qno);
        
        questions = new JLabel("");
        questions.setBounds(150, 450, 900, 30);
        questions.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(questions);

        question[0][0]=" Who is the father of C language?";
        question[0][1]="Steve Jobs";
        question[0][2]="James Gosling";
        question[0][3]="Dennis Ritchie";
        question[0][4]="Rasmus Lerdorf";
        
        question[1][0]="Which of the following is not a valid C variable name?";
        question[1][1]="int number;";
        question[1][2]="float rate;";
        question[1][3]="int variable_count;";
        question[1][4]="int $main;";
        
        question[2][0]="All keywords in C are in ____________";
        question[2][1]="LowerCase letters";
        question[2][2]="UpperCase letters";
        question[2][3]="CamelCase letters";
        question[2][4]="None of the mentioned";
        
        question[3][0]="Which is valid C expression?";
        question[3][1]="int my_num = 100,000;";
        question[3][2]="int my_num = 100000;";
        question[3][3]="int my num = 1000;";
        question[3][4]="int $my_num = 10000;";
        
        
        question[4][0]="Which of the following cannot be a variable name in C?";
        question[4][1]="volatile";
        question[4][2]="true";
        question[4][3]="friend";
        question[4][4]="export";
        
        question[5][0]="Which of the following declaration is not supported by C language?";
        question[5][1]="String str;";
        question[5][2]="char *str;";
        question[5][3]="float str = 3e2;";
        question[5][4]="Both “String str;” and “float str = 3e2;”";
        
        question[6][0]="Which keyword is used to prevent any changes in the variable within a C program?";
        question[6][1]="immutable";
        question[6][2]="mutable";
        question[6][3]="const";
        question[6][4]="volatile";
        
        question[7][0]="Functions in C Language are always _________";
        question[7][1]="Internal";
        question[7][2]="External";
        question[7][3]="Both Internal and External";
        question[7][4]="External and Internal are not valid terms for functions";
        
        question[8][0]="What is #include <stdio.h>?";
        question[8][1]="Preprocessor directive";
        question[8][2]="Inclusion directive";
        question[8][3]="File inclusion directive";
        question[8][4]="None of the mentioned";
        
        question[9][0]="The standard header _______ is used for variable list arguments (…) in C.";
        question[9][1]="<stdio.h >";
        question[9][2]="<stdlib.h>";
        question[9][3]="<math.h>";
        question[9][4]="<stdarg.h>";
        
        
        
        answers[0][1]="Dennis Ritchie";
        answers[1][1]="int $main;";
        answers[2][1]="LowerCase letters";
        answers[3][1]="int my_num = 100000;";
        answers[4][1]="volatile";
        answers[5][1]="String str;"; 
        answers[6][1]="const";  
        answers[7][1]="External";
        answers[8][1]="Preprocessor directive";
        answers[9][1]="<stdarg.h>";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 630, 200, 40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
       
        
        start(count);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           if(e.getSource()==next){
               repaint();
               
               ans_given=1;
               
                if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                
           if(count==8){
               next.setEnabled(false);
               submit.setEnabled(true);
                     
           }
               count++;
               start(count);
           }
           else if(e.getSource()==submit){
               ans_given=1;
                 if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                  
                  for(int i =0;i<useranswer.length;i++){
                      if(useranswer[i][0].equals(answers[i][1])){
                          score+=1;
                      }
                      else{
                          score+=0;
                      }
                  }
                  
                  setVisible(false);
                  new C_Score(score);
               
           }
    }
    
    
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time ="Time left "+ timer + " seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        
        if(timer>0){
            g.drawString(time, 1100, 500);
        } else{
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given==1){
            ans_given=0;
            timer = 60;
        }
        else if(timer<0){
            timer=60;
           
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                  if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                  
                  for(int i =0;i<useranswer.length;i++){
                      if(useranswer[i][0].equals(answers[i][1])){
                          score+=1;
                      }
                      else{
                          score+=0;
                      }
                  }
                  
                  setVisible(false);
                  new C_Score(score);
            }else{
                if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
           count++;
           start(count);
            }
            
           
        }
        
    }
    
    public void start(int count){
        qno.setText(""+ (count + 1) +". ");
        questions.setText(question[count][0]);
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]);
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]);
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]);
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]);
        
        groupoptions.clearSelection();
        
    }
    
    public static void main(String[] args) {
        new C_Quiz("User");
    }
    
}
