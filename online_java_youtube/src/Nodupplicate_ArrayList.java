import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nodupplicate_ArrayList {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        List arr=new ArrayList();

        int n;
        System.out.print("enter n: ");
        n=cin.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" a["+i+"] : ");
            int temp;
            temp=cin.nextInt();

                if(arr.contains(temp) ){
                    i--;

                    continue;
                }


                arr.add(temp);
        }




        for(int i=0;i<n;i++){
            System.out.println("a ["+i+"] = "+arr.get(i));
        }
    }
}
