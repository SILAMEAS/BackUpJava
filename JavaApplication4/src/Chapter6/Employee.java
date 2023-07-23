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
public class Employee extends Staff{
    String time_start;
    String time_leave;

    public Employee() {
    }

    public Employee(String time_start, String time_leave, String job, int Salary, int id, String name, String add, String phone, String place_live) {
        super(job, Salary, id, name, add, phone, place_live);
        this.time_start = time_start;
        this.time_leave = time_leave;
    }

    @Override
    public String toString() {
        return super.toString()+"\t in:"+time_start+"\t out"+time_leave; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
