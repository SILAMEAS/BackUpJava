/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rog
 */
public class sumof_n12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat  ne=new DecimalFormat("0.00000000000000000");
        double sd=90.2345345435634;
        System.out.println(ne.format(sd));
        // TODO code application logic here
//        int N;
//        System.out.print("Sn= n(n+1)/2  Input N: ");
//        Scanner sc=new Scanner(System.in);
//        N=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=N;i++){
//            int s;
//            
//        }

            String str= "Geeks", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
        
        
    }
    

