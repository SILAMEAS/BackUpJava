/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rog
 */
public class Readfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] yu=new char [100];
        try {
            FileReader filer=new FileReader("File1.txt");
            filer.read(yu);
            System.out.println(yu);
            filer.close();
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Readfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
