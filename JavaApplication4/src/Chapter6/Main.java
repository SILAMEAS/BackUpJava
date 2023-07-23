/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author Rog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sub d=new sub();
        sup e=new sup();
        
       d.number= 43;
       d.a=100;
       d.b=200;
       d.c="300";
       d.show();
       
        System.out.println("________________________________");
        e.a=10;
        e.b=20;
        e.c="30";
        e.show();
        
        
        
      
    }
    
}
