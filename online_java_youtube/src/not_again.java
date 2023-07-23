import java.util.Scanner;

public class not_again {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter element : ");
        int n;
        n=cin.nextInt();
        int [] a=new int [n];
        LOOP:
        for(int i=0;i<n;i++){
            System.out.print(" a["+i+"] : ");
            int temp;
            temp=cin.nextInt();
            for(int j=0;j<i;j++){
                if(temp==a[j]){
                    i--;
                    continue LOOP;
                }

            }
            a[i]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(" a["+i+"] : "+a[i]+"\n");
        }
    }
}
