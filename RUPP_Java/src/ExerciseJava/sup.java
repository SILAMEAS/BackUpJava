/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseJava;

/**
 *
 * @author Rog
 */
public class sup {
    String name;
    int age;
    sup(){}
    sup(int age,String name){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("My name is "+this.name);
        System.out.println("I'm "+this.age+"years old");
        System.out.println("-----------------------------------");
    }
    
}
