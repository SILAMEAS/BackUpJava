/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh;

import javax.swing.*;
import javax.swing.JFrame;


/**
 *
 * @author Rog
 */
public class NewMain extends JFrame{
   
    
    public static void main(String[] args) {
       JPanel panel=new JPanel();
      
       JFrame frame=new JFrame();
       frame.setSize(500, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.add(panel);
       
       panel.setLayout(null);
       JLabel label1=new JLabel("Contact List");
       label1.setBounds(100, 20, 80, 25);
       panel.add(label1);
       
       
       JLabel label=new JLabel("User ");
       label.setBounds(50, 60, 80, 25);
       panel.add(label);
       
       JLabel label2=new JLabel("Sex ");
       label2.setBounds(50, 100, 80, 25);
       panel.add(label2);
       
       
       JLabel label3=new JLabel("Tel ");
       label3.setBounds(50, 140, 80, 25);
       panel.add(label3);
       
       JTextField txt=new JTextField(20);
       txt.setBounds(100, 60, 165, 25);
       panel.add(txt);
       
       JTextField txt1=new JTextField(20);
       txt1.setBounds(100, 140, 165, 25);
       panel.add(txt1);
       
       JButton btn1=new JButton("ADD");
       btn1.setBounds(100, 100, 100, 100);
       panel.add(btn1);
       JButton btn2=new JButton("Clear");
       panel.add(btn2);
       JButton btn3=new JButton("Close");
       panel.add(btn3);
       
    
    }
    
}
