/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Rog
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file=new File("D:\\FileTXT\\goon.txt");
        Scanner sc= new Scanner(file);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+""+sc.nextLine());
            i++;
        }
        
        
        
    }
    
}
