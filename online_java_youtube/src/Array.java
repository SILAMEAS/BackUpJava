import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void Show (int [] a){

        Scanner cin = new Scanner(System.in);
        int [] temp=a;
        System.out.print("add element of array : ");
        int x,e;
        x = cin.nextInt();
        e=a.length;
        a= new int[e+x];
        for (int i =0;i<e;i++)
            a[i]=temp[i];
        for (int i=e;i<(e+x); i++){
            System.out.print((i+1)+" : ");
            a[i] = cin.nextInt();
        }

        for (int i =0;i<e+x;i++){


            System.out.print("a ["+(i+1)+"] : "+a[i]+"\n");

        }

        }

//        Scanner cin = new Scanner(System.in);
//        int [] temp=a;
//        System.out.print("add element of array : ");
//        int x,e;
//        x = cin.nextInt();
//        e=a.length;
//        a= new int[e+x];
//        for (int i =0;i<e;i++)
//            a[i]=temp[i];
//        for (int i=e;i<(e+x); i++){
//            System.out.print((i+1)+" : ");
//            a[i] = cin.nextInt();
//        }
//
//        for (int i =0;i<e+x;i++){
//
//
//            System.out.print("a ["+(i+1)+"] : "+a[i]+"\n");
//
//        }

    public static void Input (int []a){
        Scanner cin = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print((i+1)+" : ");
            a[i]= cin.nextInt();

        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter element of array : ");
        int n;
        n=cin.nextInt();

        int [] a = new int[n];


        Input(a);
        Show(a);


    }
}
