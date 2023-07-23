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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String name;
//        int id;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Id ");
//        id=sc.nextInt();
//        
//        System.out.println("Enter Name ");
//        name=sc.nextLine();
//        name=sc.nextLine();
        int []a ={102,103,104,105,106,107,108,109,202};
        for(int i=0;i<a.length;i++){
            if((a[i]%3==0)&&(a[i]%5==0)){
                System.out.println("ALL WEB");
            }
            else if(a[i]%3==0){
                  System.out.println("ALL");
              }
            else if(a[i]%5==0){
                System.out.println("WEB");
            }
            else System.out.println(a[i]);
          
        
        }


    }
    
}
