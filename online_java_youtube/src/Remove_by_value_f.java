import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_by_value_f {
    public static void main(String[] args) {



        Scanner cin = new Scanner(System.in);
        System.out.print("Enter element of array : ");
        int n;
        n=cin.nextInt();


        List arr=new ArrayList();

        for(int i =0;i<n;i++){
            System.out.print("Enter a [ "+i+"] : ");
            arr.add(cin.nextInt());
        }
        Integer value;

            System.out.print("Enter value for remove : ");
            value = cin.nextInt();


       while (arr.remove(value));

        for(int i=0;i<arr.size();i++){
            System.out.println("a ["+i+"] = "+arr.get(i));
        }

    }
}
