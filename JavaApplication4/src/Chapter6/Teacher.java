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
public class Teacher extends People{
    String teacher_name;

    public Teacher() {
    }

    public Teacher(String teacher_name, int id, String name, String add, String phone, String place_live) {
        super(id, name, add, phone, place_live);
        this.teacher_name = teacher_name;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+teacher_name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
