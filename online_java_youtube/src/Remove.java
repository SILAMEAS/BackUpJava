import java.util.Scanner;

public class Remove {

//    public static void remove( int []a) {
//        Scanner cin = new Scanner(System.in);
//        int index;
//        do{
//            System.out.print("Enter Index for remove : ");
//            index = cin.nextInt();
//        }while (!(index>=0&&index<=a.length-1));
//
//
//        int [] temp = a;
//        int n= a.length;;
//        a =  new int [n-1];
//        for (int i=0;i<temp.length;i++){
//
//            if(i==index){
//                a[i+1]=temp[i];
//            }
//            else
//            a[i]=temp[i];
//
//
//        }
//        temp=null;
//        for (int i =0;i<a.length;i++){
//
//
//            System.out.print("a ["+(i+1)+"] : "+a[i]+"\n");
//
//        }
//
//    }
//    public static void Show (int [] a){
//        Scanner cin = new Scanner(System.in);
//        int [] temp=a;
//        System.out.print("Enter index for remove  : ");
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
//        remove(a);
//    }
//    public static void Input (int []a){
//        Scanner cin = new Scanner(System.in);
//        for(int i=0;i<a.length;i++){
//            System.out.print((i+1)+" : ");
//            a[i]= cin.nextInt();
//
//        }
//
//    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter element of array : ");
        int n;
        n=cin.nextInt();

        int [] a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("a ["+i+"] : ");
            a[i]= cin.nextInt();

        }


        int index;
        do{
            System.out.print("Enter Index for remove : ");
            index = cin.nextInt();
        }while (!(index>=0&&index<=a.length-1));

        int [] temp=a;
        a= new int[n-1];
        for (int i=0,j=0;i<temp.length;i++) {
            if (i == index)
                continue;
            a[j] = temp[i];
            j+=1;
        }

        for(int i=0;i<a.length;i++)
            System.out.print("a["+i+"] : "+a[i]+"\n");

    }
}
