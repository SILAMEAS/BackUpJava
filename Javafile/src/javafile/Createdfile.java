/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rog
 */
public class Createdfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           File file=new File("D:/Java/Javafile/File1.txt");
           
        try {
            if(file.createNewFile()){
                System.out.println("Sub");
            }else{
                System.out.println("Error");
            }
        } catch (IOException ex) {
            Logger.getLogger(Createdfile.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
           
           
    }
    
}
