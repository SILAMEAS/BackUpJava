/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseJava;

/**
 *
 * @author Rog
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyForm extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3, lb4, lb5;
    JTextField tf1, tf2, tf3;
    JTextArea ta;
    JRadioButton male, female;
    ButtonGroup bg = new ButtonGroup();
    JButton bt1, bt2, bt3, bt4, bt5, bt6;

    MyForm(){
       super("My Form Demo");
       setSize(400, 350);
       setLayout(new FlowLayout());

       lb1 = new JLabel("STUDENT RECORD");
       lb2 = new JLabel("ID : ");
       lb3 = new JLabel("NAME : ");
       lb4 = new JLabel("SEX : ");
       lb5 = new JLabel("SCORE : ");
       
       tf1 = new JTextField(10);
       tf2 = new JTextField(10);
       tf3 = new JTextField(10);

       ta = new JTextArea(5, 40);
       male = new JRadioButton("Male", true);
       female = new JRadioButton("Female", false);

       bt1 = new JButton("ADD");
       bt2 = new JButton("DEL");
       bt3 = new JButton("UPDATE");
       bt4 = new JButton("PREV");
       bt5 = new JButton("NEXT");
       bt6 = new JButton("CLEAR");

       
       add(lb1);
       add(lb2); add(tf1);
       add(lb3); add(tf2);
       add(lb4); add(male); add(female); 
       bg.add(male); bg.add(female);
       add(lb5); add(tf3);
       add(bt1); add(bt2); add(bt3); 
       add(bt4); add(bt5); add(bt6);
       add(ta);

       setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       bt1.addActionListener(this);
       bt2.addActionListener(this);
       bt3.addActionListener(this);
       bt4.addActionListener(this);
       bt5.addActionListener(this);
       bt6.addActionListener(this);
    }
    public static void main(String args[]){
       new MyForm();
    }
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == bt1){

       }
       if (ae.getSource() == bt2){

       }
       if (ae.getSource() == bt3){

       }
       if (ae.getSource() == bt4){

       }
       if (ae.getSource() == bt5){

       }
       if (ae.getSource() == bt6){

       }
    }
}

