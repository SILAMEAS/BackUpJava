/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rog
 */
public class Writefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Inf="Meas sila    PP    IT    Y3";
        try {
            // TODO code application logic here
            FileWriter filew=new FileWriter("File1.txt");
            filew.write(Inf);
            filew.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Error write");
        }
    }
    
}
