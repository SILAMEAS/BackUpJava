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
public class Staff extends People{
    String job;
    int Salary;

    public Staff() {
    }

    public Staff(String job, int Salary, int id, String name, String add, String phone, String place_live) {
        super(id, name, add, phone, place_live);
        this.job = job;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+job+"\t"+Salary; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
