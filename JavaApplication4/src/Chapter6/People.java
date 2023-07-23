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
public class People {

    int id;
    String name;
    String add;
    String phone;
    String place_live;

    public People() {
    }

    public People(int id, String name, String add, String phone, String place_live) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.place_live = place_live;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+add+"\t"+phone+"\t"+place_live; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
