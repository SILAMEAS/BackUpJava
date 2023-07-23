package Chapter4;

import java.util.Scanner;

public class People {
    Scanner cin=new Scanner(System.in);
    int id;
    String name;
    String add;
    String tel;
    int age;
    public void show(){
        System.out.print(id+"\t"+name+"\t"+add+"\t"+tel+"\t"+age+"\n");
    }
    public People() {
//        Scanner cin=new Scanner(System.in);
//        System.out.print("Enter ID     : ");    id=cin.nextInt();
//        System.out.print("Enter Name   : ");    cin.nextLine(); name=cin.nextLine();
//        System.out.println();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public People(int id, String name, String add, String tel, int age) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.tel = tel;
        this.age = age;
    }
    public void Input(){
        System.out.print("ID       : ");
        id=cin.nextInt();
        System.out.print("Name     : ");
        cin.nextLine();
        name=cin.nextLine();
        System.out.print("Age      : ");
        age=cin.nextInt();
        System.out.print("Address  : ");
        cin.nextLine();
        add=cin.nextLine();
        System.out.print("Tel      : ");
        tel=cin.nextLine();

    }

}
