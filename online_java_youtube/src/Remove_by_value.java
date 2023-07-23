import java.util.Scanner;

public class Remove_by_value {
    public static void value( int []a) {
        Scanner cin = new Scanner(System.in);
        int value;
        int n= a.length;
        int x=0,z=0;
        do{
            System.out.print("Enter value for remove : ");
            value = cin.nextInt();

            for(int i=0;i<n;i++){
                if(value==a[i]) {
                    System.out.println("Found in a ["+i+"] value = "+value);
                    x=1;
                    z+=1;
                }
            }


        }while (x==0);


        int [] temp=a;
        a= new int [n-z];
        for (int i=0,j=0;i<temp.length;i++){
            if(temp[i]==value)
                continue;
            a[j]=temp[i];
            j+=1;


        }
        temp=null;
        for (int i=0;i<a.length;i++){
            System.out.println(" a [ "+i+" ] = "+a[i]);
        }

    }
//    public static void Show (int [] a){
//        Scanner cin = new Scanner(System.in);
//        removebyvalue(a);
//
//    }
    public static void Input (int []a){
        Scanner cin = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("a [ "+i+" ] : ");
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
        value(a);


    }
}
