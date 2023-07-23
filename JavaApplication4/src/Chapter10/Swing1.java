/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rog
 */
public class Swing1 extends JFrame{
    public Swing1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800,1000);
        btnId=new JButton("ID ");
        btnId.setBounds(50, 50, 75, 25);
        txtId=new JTextField();
        txtId.setBounds(150, 50, 150, 25);
        btnName=new JButton("Name ");
        btnName.setBounds(50, 100, 75, 25);
        txtName=new JTextField();
        txtName.setBounds(150, 100, 150, 25);
        btnGender=new JButton("Gender ");
        btnGender.setBounds(50, 150, 75, 25);
        comboGender=new JComboBox(new String[]{"  Male","  Female","  Others" });
        comboGender.setBounds(150, 150, 150, 25);
        btnadd=new JButton("ADD");
        btnadd.setBounds(350, 150, 75, 25);
        btnadd.addActionListener((e) -> {
            btnaddActionPerform(e);
            
            
        });
        
        sp=new JScrollPane(table);
        sp.setBounds(10,200, 760, 400);
        table=new JTable();
        DefaultTableModel mod=new DefaultTableModel();
        mod.addColumn("ID");
        mod.addColumn("Name");
        mod.addColumn("Gender");
        table.setModel(mod);
        sp.setViewportView(table);
        
        
        
        add(btnId);
        add(txtId);
        add(btnName);
        add(txtName);
        add(btnGender);
        add(comboGender);
        add(btnadd);
        add(sp);
        
    }
    
   private void btnaddActionPerform(ActionEvent sd){
       String id=txtId.getText();
       String name=txtName.getText();
       String gender=""+comboGender.getSelectedItem();
       
       DefaultTableModel m=(DefaultTableModel)table.getModel();
       String []r={id,name,gender};
       m.addRow(r);
       
       
       
       
   }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            
            
            
           
        } catch (Exception e) {
        }
        new Swing1().setVisible(true);
    }
    private JButton btnadd,btnId,btnName,btnGender;
    private JTextField txtId,txtName;
    private JComboBox comboGender;
    private JTable table;
    private JScrollPane sp;
    
}
