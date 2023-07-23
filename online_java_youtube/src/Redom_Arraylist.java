import sun.security.pkcs11.wrapper.CK_SSL3_RANDOM_DATA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Redom_Arraylist {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        int n;
        System.out.print("enter n element of array : ");
        n = cin.nextInt();
        int [] a=new int [n];
        ArrayList <Integer> arr=new ArrayList();
        Random r= new Random();
        for(int i=1;i<=n;i++)
            arr.add(i);
        System.out.println("Before Random ");
        for(int i=0;i<n;i++){
            System.out.println(" a["+i+"] = "+arr.get(i));
        }

        for(int i=0;i<n;i++){
            int index=r.nextInt(arr.size());
            a[i] = (int) arr.get(index);
            arr.remove(index);
        }
        System.out.println("After Random ");
        for(int i=0;i<n;i++){
            System.out.println(" a["+i+"] = "+a[i]);
        }
    }

}
