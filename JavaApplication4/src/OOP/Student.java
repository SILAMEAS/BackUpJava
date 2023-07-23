/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import Chapter6.People;

/**
 *
 * @author Rog
 */
public class Student extends Chapter6.People{
    String School;
    String classs;
    Student(){
        
    }

    public Student( int id, String name, String add, String phone, String place_live,String School, String classs) {
        super(id, name, add, phone, place_live);
        this.School = School;
        this.classs = classs;
    }
    

    @Override
    public String toString() {
        return super.toString()+"\t School :"+School+"\t Class"+classs; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
