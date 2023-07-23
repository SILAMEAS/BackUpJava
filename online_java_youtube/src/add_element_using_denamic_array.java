import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class add_element_using_denamic_array {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter element of array : ");
        int n;
        n=cin.nextInt();

        int [] a = new int[n];
        List arr=new ArrayList();
        for(int i =0;i<n;i++){
            System.out.print("Enter a [ "+i+"] : ");
            arr.add(cin.nextInt());
        }
        int add;
        System.out.println("Enter amounts element to add more : ");
        add = cin.nextInt();
        for (int i=n;i<n+add;i++){
            System.out.print("new element a[ "+i+"] : ");
            arr.add(cin.nextInt());

        }
        for(int i=0;i<n+add;i++){
            System.out.println("a [ "+i+"] = "+arr.get(i));
        }
    }

}
