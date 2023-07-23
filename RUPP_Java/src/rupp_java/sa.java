/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rupp_java;

import java.util.Random;

/**
 *
 * @author Rog
 */
public class sa {

    

   
 void show1(int n){
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(" "+j);
         }
         System.out.println("");
     }
}
    
void show2(int n){
     for(int i=n;i>0;i--){
         for(int j=1;j<=i;j++){
             System.out.print(" "+j);
         }
         System.out.println("");
     }
}
void showrandom(int s,int n){
    int sd=(int)(Math.random()*(n-s+1)+s);
        System.out.println(sd);
    
}
//void shownumber(int n){
//    int []arr=new int [];
//    
//    while(n>0){
//        arr[n]=n/10;
//        n--;
//        
//    }
//    for(int i=0;i<n;i++){
//        System.out.println(arr[i]);
//    }
//    

}
