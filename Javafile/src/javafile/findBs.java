/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

/**
 *
 * @author Rog
 */
public class findBs {
    static void show(){
        int []a={34,23,12,34,45,343,54546,1};
        int big=0;
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    a[i]=a[j];
                    
                }
            }
            big=a[i];
           
        }
        System.out.println("Bigger is "+big);
    }
    public static void main(String[] args) {
         int n1=3,n2=90;
        int p=n1*n2;
        while(n1!=n2){
            if(n1>n2)
                n1-=n2;
            else
                n2-=n1;
        }
        System.out.println("PGCM "+p/n2);
        
//        int []number={34,12,34,23,2,22,11,34,23};
//        for(int i=0;i<number.length;i++){
//            if(number[i]%2==0){
//                System.out.println(number[i]+"  is even");
//            }
//            else
//                
//            System.out.println(number[i]+"   is odd");
//        }
//        
        
        
        //show();
//        int n1=3,n2=1;
//        int p=n1*n2;
//        while(n1!=n2){
//            if(n1>n2)
//                n1-=n2;
//            else
//                n2-=n1;
//        }
//        System.out.println("PGCM "+p/n2);
        
        
//        
//        int n1=60,n2=36;
//        while(n1!=n2){
//            if(n1>n2)
//                n1-=n2;
//            else
//                n2-=n1;
//        }
//        System.out.println("PGCD "+n2);
        
     
        
        
//        int a=2,b=3;
//  int p=a*b;
//  while (a!=b) if (a<b) b-=a; else a-=b;
//        System.out.println(p/a);
       







        
        
    }
    
    
    
}
