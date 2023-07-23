/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rupp_java;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Rog
 */

public class Test {
    static void show2(int n){
     for(int i=n;i>0;i--){
         for(int j=1;j<=i;j++){
             System.out.print(" "+j);
         }
         System.out.println("");
     }
}
    public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           int n=sc.nextInt();
//           show2(n);
             sa n=new sa();
             n.showrandom(57,60);
             Random random =new Random();
             int s=(int)(Math.random()*4)+57;
             System.out.println(s);
        
    }
    
    
  
    
}
