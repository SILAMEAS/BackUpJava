/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import javax.swing.JOptionPane;

/**
 *
 * @author Rog
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name=JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, "Hello Mr."+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
    }
    
}
