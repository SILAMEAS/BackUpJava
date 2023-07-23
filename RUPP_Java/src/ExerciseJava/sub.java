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
public class sub extends sup{
    String place;
    String tel;
    sub(String tel,String place,int a,String b){
        super(a,b);
        this.tel=tel;
        this.place=place;
    }
    sub(String tel,String place){
        
        this.tel=tel;
        this.place=place;
    }
    @Override
    void show(){
        super.show();
        System.out.println("My place "+this.place);
        System.out.println("My telephone "+this.tel);
        
    }
    
}
