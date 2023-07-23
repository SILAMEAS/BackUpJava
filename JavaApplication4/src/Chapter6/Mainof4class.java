/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rog
 */
public class Mainof4class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student []student={new Student(34, "Meas Sila", "PP", "089964186", "pp", 10, "A6", "IT"),
        new Student(34, "Meas Sila", "PP", "089964186", "pp", 10, "A6", "IT")};
        Teacher teacher=new Teacher("SomNang",34,"Meas Sila", "PP", "089964186", "pp");
        Staff staff=new Staff("Programmer", 1000,34,"Meas Sila", "PP", "089964186", "pp");
        Employee employee=new Employee("6:00 am", "5:00pm","Programmer", 1000,34,"Meas Sila", "PP", "089964186", "pp");
        
//        List<People> ne=Arrays.asList(student[0],student[1],staff,teacher,employee);
        List<People> ne=Arrays.asList(student);
        for(People temp:ne){
            System.out.println(temp);
        }
        
 
        
        
       
    }
    
}
