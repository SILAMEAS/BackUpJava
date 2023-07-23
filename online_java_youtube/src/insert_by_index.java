import java.util.Scanner;

public class insert_by_index {
    public static void Input (int []a) {
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a ["+i+ "] : ");
            a[i] = cin.nextInt();

        }
    }
    public static void Insert (int [] a) {
        Scanner cin = new Scanner(System.in);
        int index;
        int n = a.length;
        do {
            System.out.print("Enter Index to insert []: ");
            index = cin.nextInt();
        } while (!(index >= 0 && index < a.length));

       int[] temp = a;
        a = new int[n + 1];

        for(int i=0,j=0;i<a.length;i++){
            if(i==index){
                System.out.print("a ["+i+"] : ");
                a[i] = cin.nextInt();

            }


            else {
                a[i]=temp[j];
                j++;
            }
        }
       for(int i =0;i<a.length;i++){
           System.out.print("a ["+i+"] = "+a[i]+"\n");
       }



        /*
        for (int i = 0, j = 0; i < n+1; i++) {
            if (index == i) {
               continue;

            }
            a[i] = temp[i];

        }
        temp = null;
        for (int i = 0; i < a.length; i++) {
            System.out.println(" a [ " + i + " ] = " + a[i]);
        }
        */



    }

        public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter element of array : ");
        int n;
        n=cin.nextInt();

        int [] a = new int[n];


        Input(a);
        Insert(a);



    }




        }






