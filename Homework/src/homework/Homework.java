/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    static DecimalFormat DEC = new DecimalFormat("0.00");
    
    static void show(int n){
        int sn=0,p;
        System.out.print(" sum of n(n+1)/2 is = ");
         for(int i=1;i<=n;i++){
            p=(i*(i+1)/2);
            sn=sn+p;
             System.out.print(" " +p+ " + ");
        }  
        
         System.out.println("  = "+DEC.format(sn));
         System.out.println("********************");
        
    }
    static void show1(int n){
        
        int p,sn1=0;
        System.out.print(" sum of n(n+1)*(2n+1)/6 is = ");
           for(int i=1;i<=n;i++){ 
           p=i*(i+1)*(2*i+1)/6;
           sn1=sn1+p;
              System.out.print(" " +p+ " + ");  
        } 
           
           System.out.println(" = "+DEC.format(sn1));
          System.out.println("********************");
    }
    static void show2(int n){
        System.out.print(" sum of n^2(n+1)^2/4 is = ");
        int p,sn2=0;
      for(int i=1;i<=n;i++){    
          p=(int)(Math.pow(i,i))*(int)(Math.pow(i+1,i+1))/4;
            sn2=sn2+p;
               System.out.print(" " +p+ " + ");
        }  
            System.out.println(" = "+DEC.format(sn2));
    }
    public static void main(String[] args) {
        int n;
    
        System.out.println("*****************************************");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number OF N : ");
        n= scan.nextInt();
        show(n);
        show1(n);
        show2(n);
        
             
            
    }
    
    
}
