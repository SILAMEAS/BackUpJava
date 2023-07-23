import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_by_index_using_function_remove {
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
        int index;
        do{
            System.out.print("enter element that you want to delete : ");
            index=cin.nextInt();
        }while(!(index>=0&&index<=n));
        arr.remove(index);
        for(int i=0;i<arr.size();i++){
            System.out.println("a ["+i+"] = "+arr.get(i));
        }
    }
}
