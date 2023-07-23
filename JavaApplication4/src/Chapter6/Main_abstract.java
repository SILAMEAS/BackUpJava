/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

import java.util.Scanner;

/**
 *
 * @author Rog
 */
public class Main_abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sub_abstract obj=new sub_abstract();
        sup_abstract n;
        n=obj;
        n.speak();
        n.show();
        n.showd();
        obj.showitem();
       
        
        // TODO code application logic here
    }
    
}
