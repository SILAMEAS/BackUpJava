import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Insert_using_arrayList {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);

        int n;
        System.out.print("Enter element of arraylist : ");
        n = cin.nextInt();
        List arr=new ArrayList();
        for(int i=0;i<n;i++){
            System.out.print(" a ["+i+"] : ");
            arr.add(cin.nextInt());
        }
        int index;
        do{
            System.out.print("enter index that you want to input : " );
            index=cin.nextInt();
        }while (!(index>=0&&index<n));
        int value;
        System.out.print(" a ["+index+"] : ");
        value=cin.nextInt();
        arr.add(index,value);
        for(int i =0;i<arr.size();i++){
            System.out.println("a ["+i+"] = "+arr.get(i));
        }

    }
}
