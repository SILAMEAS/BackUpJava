/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Rog
 */
public class Javafile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        List a=new <Integer>ArrayList();
//        a.add(99);
//        a.add(45.34);
//        a.add(56.7);
//        for(int i=0;i<a.size();i++){
//            
//            System.out.println(a.get(i));
//        }
//        Set <Integer> t=new HashSet<Integer>();
//        t.add(34);
//        t.add(90);
//        t.add(90);
//        t.add(-90);
//        System.out.println(t);
//    }
    
//    LocalDateTime ts=LocalDateTime.now();
//    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//    String formattedDate = ts.format(myFormatObj);
//    
//        
//        System.out.println(formattedDate);
//    
//    LinkedList <Integer> inter=new LinkedList<Integer>();
//    
//   
//    
//    
//    inter.add(4);
//    
//    inter.add(14);
//    inter.add(24);
//    inter.add(94);
//    //Collections.sort(inter);
//    inter.addLast(56);
//    inter.addFirst(3);
//    for(int i:inter){
//        System.out.println(i);
//    }
//   // inter.removeFirst();
//    inter.remove(3);
//        System.out.println("--------------------------------");
//    for(int i:inter){
//        System.out.println(i);
//    }
//        try {
//            File n=new File("Desktop//tes3t");
//            if(n.createNewFile()){
//                System.out.println("File name"+n.getName());
//            }else{
//                System.out.println("file exit");
//            }
//        } catch (Exception e) {
//            System.out.println("error created file");
//        }
    
//        try {
//            FileWriter na=new FileWriter("test.txt");
//            Scanner sc=new Scanner(System.in);
//            String str=sc.nextLine();
//            na.write(str);
//            na.close();
//        } catch (Exception e) {
//            System.out.println("error write file");
//        }
    
//   try {
//      File n=new File("T#3.txt");
//            if(n.createNewFile()){
//                System.out.println("File name"+n.getName());
//                //System.out.println(n.getAbsoluteFile());
//            }else{
//                System.out.println("file exit");
//            }
//            System.out.println(n.getAbsolutePath());
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      
//    }
   
   try {
            File n=new File("T#3.txt");
            FileWriter na=new FileWriter("T#3.txt");
            Scanner sc=new Scanner(System.in);
            String str;
            System.out.println("input: ");
            str=sc.nextLine();
            na.write(str);
            na.close();
        } catch (Exception e) {
            System.out.println("error write file");
        }
    
    try {
            File n=new File("T#3.txt");
            
            Scanner sc=new Scanner(n);
            while(sc.hasNextLine()){
                String sdf;
                sdf=sc.nextLine();
                System.out.println(sdf);
            }
        } catch (Exception e) {
            System.out.println("error write file");
        }
   
   
    }
    
    
}
