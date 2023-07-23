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
public class Student extends People{
    int id_school;
    String S_class;
    String subject;

    public Student() {
    }

    public Student( int id, String name, String add, String phone, String place_live,int id_school, String S_class, String subject) {
        super(id, name, add, phone, place_live);
        this.id_school = id_school;
        this.S_class = S_class;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+id_school+"\t"+S_class+"\t"+subject; //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}
