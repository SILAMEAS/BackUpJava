package Chapter4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Product {

    public static int menu() {
        System.out.println("1. Add More Product ");
        System.out.println("2. Show All Product ");
        System.out.println("3. Remove Product By ID");
        System.out.println("4. Input Again ");
        System.out.println("5. Exit  ");
        Scanner cin= new Scanner(System.in);
        int choose;

        do{
            System.out.print("Choose Num : ");
            choose=cin.nextInt();
        }while (!(choose>=1&& choose<=5));
        return choose;
    }
    public static void Add(List  <Product> obj){
        Scanner cin= new Scanner(System.in);
        System.out.print("Enter Number for add more : ");
        int n;
        n = cin.nextInt();

        for(int i=0;i<n;i++){
            Product b=new Product();
            obj.add(b);
        }

    }
    public static void show(List <Product> obj){
        for(Product temp:obj){
            temp.show();

        }

    }
    public static void Remove(List <Product> obj){
        Scanner cin= new Scanner(System.in);
        int remo;

            System.out.print("Enter ID for remove Product");
            remo = cin.nextInt();
            for(int i=0;i<obj.size();i++){
                if(remo==obj.get(i).get_id()){
                    obj.remove(i);
                }
            }





    }
    public static void main(String[] args) {
        again:do{
            Scanner cin= new Scanner(System.in);
            System.out.print("Enter amounts of Product : ");
            int n;
            n = cin.nextInt();


            List <Product> obj= new ArrayList<>();
            for(int i=0;i<n;i++){
                Product b=new Product();
                obj.add(b);

            }



            do{
                int choose=menu();
                switch (choose){
                    case 1:{
                        Add(obj);
                        break;

                    }
                    case 2:{
                        show(obj);
                        break;

                    }
                    case 3:{
                        Remove(obj);
                        break;
                    }
                    case 4:{
                        continue again;

                    }
                    case 5:{
                        System.exit(0);

                    }

                }
            }while (true);
        }while (true);









//        Product [] obj =new Product[n];
//
//
//        for(int i=0;i<n; i++){
//            obj[i]=new Product();
//        }
//        obj[0].header();
//        for(int i=0;i<n;i++){
//            obj[i].show();
//        }




    }
}
