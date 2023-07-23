/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import javax.swing.*;

public class sa extends JFrame implements WindowListener  {
  

  final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
  JTextField tfName, tfSex, tfTel;
  JFrame f;
  JLabel lbTitle;
  
  
  public void initialize() {
//    Form Panel
    JLabel lbName = new JLabel("Name :");
    lbName.setFont(mainFont);
    
    tfName = new JTextField();
    tfName.setFont(mainFont);
    
    JLabel lbSex = new JLabel("Sex :");
    lbSex.setFont(mainFont);
    
    tfSex = new JTextField();
    lbSex.setFont(mainFont);
    
    f=new JFrame(); 
    
    JRadioButton r1=new JRadioButton("Male");    
    JRadioButton r2=new JRadioButton("Female"); 
    r1.setBounds(75,50,100,30);    
    r2.setBounds(75,100,100,30); 
    ButtonGroup bg=new ButtonGroup();    
    bg.add(r1);bg.add(r2);    
    f.add(r1);f.add(r2); 
    
    JLabel lbTel = new JLabel("Tel :");
    lbTel.setFont(mainFont);
    
    tfTel = new JTextField();
    tfTel.setFont(mainFont);
    
    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridLayout(4, 1, 5, 5));
    formPanel.add(lbName);
    formPanel.add(tfName);
    
    formPanel.add(lbTel);
    formPanel.add(tfTel);
    
    
    
//    Title label
    lbTitle = new JLabel();
    lbTitle.setFont(mainFont);
    
//    Button Panel
    JButton btnAdd = new JButton("ADD");
    btnAdd.setFont(mainFont);
    btnAdd.addActionListener((ActionEvent e) -> {
        // TODO Auto-generated method stub
        String name1 = tfName.getText();
        String tel = tfTel.getText();
        lbTitle.setText("Name : " + name1 + "Sex : " + " Male" + "Tel : " + tel);
    });
    
    JButton btnClear = new JButton("CLEAR");
    btnClear.setFont(mainFont);
    btnClear.addActionListener((ActionEvent e) -> {
        // TODO Auto-generated method stub
        tfName.setText("");
        tfTel.setText("");
        lbTitle.setText("");
    });
    
    JButton btnClose = new JButton("CLOSE");
    btnClose.setFont(mainFont);
    btnClose.addActionListener((ActionEvent e) -> {
        // TODO Auto-generated method stub
        System.exit(0);
    });
    
    
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
    buttonsPanel.add(btnAdd);
    buttonsPanel.add(btnClear);
    buttonsPanel.add(btnClose);
    
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128, 128, 255));
    mainPanel.add(formPanel, BorderLayout.NORTH);
    mainPanel.add(lbTitle, BorderLayout.CENTER);
    mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
    
    add(mainPanel);
    
    setTitle("Contact List");
    setSize(500, 600);
    setMinimumSize(new Dimension(300, 400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
public static void main(String[] args) {
  sa myFrame = new sa();
  myFrame.initialize();
}

@Override
public void windowOpened(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowClosing(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowClosed(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowIconified(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowDeiconified(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowActivated(WindowEvent e) {
  // TODO Auto-generated method stub
  
}

@Override
public void windowDeactivated(WindowEvent e) {
  // TODO Auto-generated method stub
  
}
}