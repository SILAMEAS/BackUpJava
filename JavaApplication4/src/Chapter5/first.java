/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author Rog
 */
public class first {
    int id;
    String name;
    int qty;
    double price;

    public first() {
    }

    
    public first(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

   
    public boolean equals(first obj) {
        return id==obj.id&price==obj.price&name.equalsIgnoreCase(name)&qty==obj.qty; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
