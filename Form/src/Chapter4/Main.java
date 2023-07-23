package Chapter4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n;
        System.out.print("Enter People [n] : ");
        n=cin.nextInt();
        People [] obj = new People[n];


        for(int i=0;i<n;i++){
            System.out.println(" --------No. "+(i+1)+"-------------");
            obj[i]=new People();
            obj[i].Input();
        }
        System.out.println("------------------------------");


        System.out.println("id"+"\t"+"name"+"\t"+"add"+"\t"+"tel"+"\t"+"age");
        for (People temp:obj){

            temp.show();
        }


    }
}
