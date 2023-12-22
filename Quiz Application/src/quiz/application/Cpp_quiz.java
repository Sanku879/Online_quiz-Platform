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

public class Cpp_quiz extends JFrame implements ActionListener{
    
       
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
    
    public Cpp_quiz(String name) {
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

        question[0][0]="Who invented C++?";
        question[0][1]="Dennis Ritchie";
        question[0][2]="Ken Thompson";
        question[0][3]="Brian Kernighan";
        question[0][4]="Bjarne Stroustrup";
        
        question[1][0]="What is C++?";
        question[1][1]="C++ is an object oriented programming language";
        question[1][2]="C++ is a procedural programming language";
        question[1][3]="C++ supports both procedural and object oriented programming language";
        question[1][4]=" C++ is a functional programming language";
        
        question[2][0]="Which of the following is the correct syntax of including a user defined header files in C++?";
        question[2][1]="#include [userdefined]";
        question[2][2]="#include “userdefined”";
        question[2][3]="#include <userdefined.h>";
        question[2][4]="#include <userdefined>";
        
        question[3][0]=" Which of the following is used for comments in C++?";
        question[3][1]=" /* comment */";
        question[3][2]="// comment */";
        question[3][3]="// comment";
        question[3][4]="both // comment or /* comment */";
        
        
        question[4][0]="Which of the following user-defined header file extension used in c++?";
        question[4][1]="hg";
        question[4][2]="cpp";
        question[4][3]="h";
        question[4][4]="hf";
        
        question[5][0]="Which of the following is not a type of Constructor in C++?";
        question[5][1]="Default constructor";
        question[5][2]="Parameterized constructor";
        question[5][3]="Copy constructor";
        question[5][4]="Friend constructor";
        
        question[6][0]="What is virtual inheritance in C++?";
        question[6][1]="C++ technique to enhance multiple inheritance";
        question[6][2]="C++ technique to ensure that a private member of the base class can be accessed somehow";
        question[6][3]="C++ technique to avoid multiple inheritances of classes";
        question[6][4]="C++ technique to avoid multiple copies of the base class into children/derived class";
        
        question[7][0]=" Which of the following type is provided by C++ but not C?";
        question[7][1]="double";
        question[7][2]="float";
        question[7][3]="int";
        question[7][4]=" bool";
        
        question[8][0]="Which of the following correctly declares an array in C++?";
        question[8][1]="array{10};";
        question[8][2]="array array[10];";
        question[8][3]="int array;";
        question[8][4]="int array[10];";
        
        question[9][0]="What is Inheritance in C++?";
        question[9][1]="Deriving new classes from existing classes";
        question[9][2]="Overloading of classes";
        question[9][3]="Classes with same names";
        question[9][4]="Wrapping of data into a single class";
        
        
        
        answers[0][1]="Bjarne Stroustrup";
        answers[1][1]="C++ supports both procedural and object oriented programming language";
        answers[2][1]="#include “userdefined”";
        answers[3][1]="both // comment or /* comment */";
        answers[4][1]="h";
        answers[5][1]="Friend constructor"; 
        answers[6][1]="C++ technique to avoid multiple copies of the base class into children/derived class";  
        answers[7][1]=" bool";
        answers[8][1]="int array[10];";
        answers[9][1]="Deriving new classes from existing classes";
        
        
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
                  new Cpp_Score(score);
               
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
                  new Cpp_Score(score);
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
        new Cpp_quiz("User");
    }
}
