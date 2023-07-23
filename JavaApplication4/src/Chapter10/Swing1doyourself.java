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
public class Swing1doyourself extends JFrame{

    public Swing1doyourself() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setLayout(null);
        btnid=new JButton("ID");
        btnid.setBounds(50, 50, 80, 25);
        txtid=new JTextField();
        txtid.setBounds(150, 50, 150, 25);
        
        btnname=new JButton("Name");
        btnname.setBounds(50, 100, 80, 25);
        txtname=new JTextField();
        txtname.setBounds(150, 100, 150, 25);
        
        btngender=new JButton("Gender ");
        btngender.setBounds(50, 150, 80, 25);
        
        combogender=new JComboBox(new String[]{"បែកគ្នាហើយ","មានគូរ","រៀបការ"});
        combogender.setBounds(150, 150, 150, 25);
        btnadd=new JButton("ADD");
        btnadd.setBounds(350, 150, 80, 25);
        btnadd.addActionListener((e) -> {
            btnaddActoinPerforment(e);
            
        });
        sp=new JScrollPane();
        table=new JTable();
        DefaultTableModel mod=new DefaultTableModel();
        mod.addColumn("ID");
        mod.addColumn("Name");
        mod.addColumn("Gender");
        table.setModel(mod);
        sp.setBounds(20,200,750,300);
        sp.setViewportView(table);
        
        
        add(btnid);
        add(txtid);
        add(btnname);
        add(txtname);
        add(btngender);
        add(combogender);
        add(btnadd);
        add(sp);
        
    }
    private void btnaddActoinPerforment(ActionEvent j){
        String name=txtname.getText();
        String id=txtid.getText();
        String gen=""+combogender.getSelectedItem();
        DefaultTableModel get=(DefaultTableModel)table.getModel();
        String []row={name,id,gen};
        get.addRow(row);
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            
        } catch (Exception e) {
        }
        new Swing1doyourself().setVisible(true);
        
        // TODO code application logic here
    }
    private JButton btnid,btnname,btnadd,btngender;
    private JTextField txtid,txtname;
    private JComboBox combogender;
    private JScrollPane sp;
    private JTable table;
}
