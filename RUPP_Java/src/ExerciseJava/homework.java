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
public class homework {
    static Scanner sc=new Scanner (System.in);
    static DecimalFormat df=new DecimalFormat("0.00");

    /**
     * @param args the command line arguments
     */
    static void show1(){
        int n;
        System.out.print("Enter N : ");
        n=sc.nextInt();
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println();
    }
    }
    static void show2(){
        int n;
        System.out.print("Enter N : ");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                
            }
            System.out.println();
    }
    }
    static void show3(){
        double a,b,c;
        System.out.println("ax^2+bx+c=0 ");
        System.out.print("Enter a: "); a=sc.nextDouble();
        System.out.print("Enter b: "); b=sc.nextDouble();
        System.out.print("Enter c: "); c=sc.nextDouble();
        double data=Math.pow(b, 2)-(4*a*c);
        System.out.println("Data : "+data);
        if(data<0){
            System.out.println("No roof");
        }else if (data>=0){
           
           
            System.out.println("b1 = "+df.format((-b-Math.sqrt(data))/(2*a)));
            System.out.println("b2 = "+df.format((-b+Math.sqrt(data))/(2*a)));
        }else{
            System.out.println("Error");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        show1();//1  12    123 
        show2();//1  22    333
        show3();// ax^2+bx+c
    
}
}
