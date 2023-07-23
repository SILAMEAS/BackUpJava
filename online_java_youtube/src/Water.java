import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        DecimalFormat point= new DecimalFormat("#,##0.00  reils");
        double new_w,old_w;


        System.out.print("Enter old Index : ");
        old_w=cin.nextDouble();

        System.out.print("Enter new Index : ");
        new_w=cin.nextDouble();
        if(new_w>=old_w){
            double consultion,payment,price;
            consultion=new_w-old_w;
            if(consultion<0) price=0;
            else if(consultion<=50) price=350;
            else if (consultion<=150) price=650;
            else price=950;
            payment=price*consultion;
            System.out.println("__________________________________________");
            System.out.println("            Payment                     ");
            System.out.println("Old index   = "+old_w+"kw/h");
            System.out.println("New index   = "+new_w+"kw/h");
            System.out.println("Your using  = "+consultion+"kw/h");
            System.out.println("Price/kw    ="+point.format(price));
            System.out.println("Payment     = "+point.format(payment));



        }
        else {
            System.out.println("Incorrect Input  ");
             for (int i=0;i<4;i++)
                 continue ;

        }
    }
}
