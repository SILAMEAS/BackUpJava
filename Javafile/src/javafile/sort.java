/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.util.Scanner;

/**
 *
 * @author Rog
 */
public class sort {
    public static void main(String[] args) {
        
         int [] a={34,23,345,56,456,5466,2,1,0};
       
        for(int i=0;i<a.length;i++){
         for(int j=0;j<i;j++){
             if(a[j]>a[i]){
                 int temp;
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 
             }
             
             
         }   
         
         
        }
        for(int temp:a)
        System.out.println(temp);
        
        
        
//        int [] a={34,23,345,56,456,5466,2,1,0};
//        int big=0;
//        for(int i=0;i<a.length;i++){
//         for(int j=0;j<i;j++){
//             if(a[j]<a[i]){
//                
//                a[i]=a[j];
//                 
//             }
//         }   
//         big=a[i];
//         
//        }
//        System.out.println(big);
        
        
//        int [] a={34,23,345,56,456,5466,2,1,0};
//        for(int i=0;i<a.length;i++){
//         for(int j=1+i;j<a.length;j++){
//             if(a[j]>a[i]){
//                 int temp;
//                 temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//             }
//         }   
//        }
//        for(int temp:a){
//            System.out.println(temp);
//        }
        
        
       
//        int []a = {34,23,45};
//        Scanner sc=new Scanner(System.in);
//        int k=0;
//        do{
//            System.out.print("Enter "+(k+1)+" : ");
//            a[k]=sc.nextByte();
//        }while(a[k]>=0&&a[k]<=100);
//        int [] a={34,21,21,45,67};
//        for(int i=0;i<a.length;i++){
//            
//            for(int j=0;j<i;j++){
//                if(a[j]>a[i]){
//                    int temp;
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//                
//            }
//            
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        
        
    }
    
}
