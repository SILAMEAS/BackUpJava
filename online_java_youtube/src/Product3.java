import java.text.DecimalFormat;
import java.util.Scanner;

public class Product3 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        DecimalFormat point= new DecimalFormat("$#,##0.00");
        double p1,p2,p3;

        System.out.print("Enter Product 1 : ");
        p1=cin.nextDouble();

        System.out.print("Enter Product 2 : ");
        p2=cin.nextDouble();

        System.out.print("Enter Product 3 : ");
        p3=cin.nextDouble();

        if(p1>=0 && p2>=0 && p3>=0){
            double dis,total,dis_price,payment;
            int ticket;
            total=p1+p2+p3;
            if(total<1) dis=0;
            else if (total<=50) dis=5;
            else if(total<=150) dis=10;
            else    dis=15;
            dis_price=(dis*total)/100;
            payment=total-dis_price;
            ticket=(int)total/10;
            System.out.println("___________________________________________");
            System.out.println("                Your Payment");
            System.out.println("Total    = "+point.format(total));
            System.out.println("Discount = "+dis+"%");
            System.out.println("Payment  = "+point.format(payment));
            System.out.println("Ticket   = "+ticket);
            System.out.println("___________________________________________");


        }
    }
}
