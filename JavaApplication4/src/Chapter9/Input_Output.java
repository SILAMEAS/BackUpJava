/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rog
 */
public class Input_Output extends javax.swing.JFrame {

    /**
     * Creates new form Input_Output
     */
    public Input_Output() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mOpen = new javax.swing.JMenu();
        bOpen = new javax.swing.JMenuItem();
        bSaveas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        mOpen.setText("File");

        bOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bOpen.setText("Open");
        bOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenActionPerformed(evt);
            }
        });
        mOpen.add(bOpen);

        bSaveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bSaveas.setText("Save as");
        bSaveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveasActionPerformed(evt);
            }
        });
        mOpen.add(bSaveas);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Save");
        mOpen.add(jMenuItem1);

        jMenuBar1.add(mOpen);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc=new JFileChooser();
        if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                File f=jfc.getSelectedFile();
                FileInputStream fis=new FileInputStream(f); 
                BufferedInputStream bis=new BufferedInputStream(fis);
                Scanner sc=new Scanner(bis);
                while(sc.hasNext()){
                    txt.append(sc.nextLine()+"\r\n");
                    
                }
                sc.close();
                bis.close();
                fis.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error"+ e);
            }
            
            
        }
    }//GEN-LAST:event_bOpenActionPerformed

    private void bSaveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveasActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jfc=new JFileChooser();
            if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                File f=jfc.getSelectedFile();
                FileOutputStream fos=new FileOutputStream(f);
                BufferedOutputStream bos=new BufferedOutputStream(fos);
                PrintStream ps=new PrintStream(bos);
                ps.print(txt.getText());
                bos.close();
                ps.close();
                fos.close();
                
                
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error"+ e);
        }
    }//GEN-LAST:event_bSaveasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Input_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bOpen;
    private javax.swing.JMenuItem bSaveas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mOpen;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
