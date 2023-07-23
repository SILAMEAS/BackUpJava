/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
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
public class Swing1again extends JFrame{

    public Swing1again() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setLayout(null);
        btnid=new JButton("ID");
        btnid.setBounds(50, 50, 100, 25);
        txtid=new JTextField();
        txtid.setBounds(150, 50, 100, 25);
        sp=new JScrollPane();
        table=new JTable();
        DefaultTableModel mod=new DefaultTableModel();
        mod.addColumn("ID");
        
       
        table.setModel(mod);
        sp.setBounds(100, 150, 1000, 300);
        sp.setViewportView(table);
        btnadd=new JButton("ADD");
        btnadd.setBounds(150, 100, 100, 25);
        btnadd.addActionListener((e) -> {
            btnaddActionPerforment(e);
            
            
        });
        
        
        add(btnid);
        add(txtid);
        add(sp);
        add(btnadd);
    }
    private void btnaddActionPerforment(ActionEvent a){
        String id=txtid.getText();
        DefaultTableModel m= (DefaultTableModel)table.getModel();
        String []row={id};
        m.addRow(row);
        
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
        new Swing1again().setVisible(true);
    }
    private JButton btnid,btnadd;
    private JTextField txtid;
    private JScrollPane sp;
    private JTable table;
   
   
    
}
