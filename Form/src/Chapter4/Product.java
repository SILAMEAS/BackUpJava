package Chapter4;

import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {

    int Pro_code;
    String Pro_name;
    int qty;
    double price;
    double amounts (){
        return price*qty;
    }
    int get_id(){
        return Pro_code;
    }



    public Product() {
        Scanner cin= new Scanner(System.in);

        System.out.print("Enter Pro_name : ");


        Pro_name=cin.nextLine();
        System.out.print("Enter Pro_code :  ");
        Pro_code=cin.nextInt();
        System.out.print("Enter Price    :$ ");
        price=cin.nextDouble();
        System.out.print("Enter Qty      :  ");
        qty=cin.nextInt();
        DecimalFormat d1= new DecimalFormat(" #,##0.00 $");
        System.out.println("Total          :  "+d1.format(amounts()));

    }

    public Product(int pro_code, String pro_name, int qty, double price) {
        Pro_code = pro_code;
        Pro_name = pro_name;
        this.qty = qty;
        this.price = price;
    }

    void header (){
        System.out.print("\t"+"Pro_name"+"\t\t\t\t"+"Pro_code"+"\t\t\t"+"price"+"\t\t\t"+"qty"+"\t\t\t"+"amounts");
        System.out.println("______________________________________________________________________________________");
    }
    void show(){
        DecimalFormat d1= new DecimalFormat(" #,##0.00 $");
        System.out.println("\t"+Pro_name+"\t\t\t\t\t"+Pro_code+"\t\t\t\t\t"+price+"\t\t\t\t"+qty+"\t\t\t"+d1.format(amounts()));
    }
}
