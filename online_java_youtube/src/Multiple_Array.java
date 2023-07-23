import java.util.Scanner;

public class Multiple_Array {

    public static void main(String [] args){
        Scanner cin = new Scanner(System.in);
        int r,c;
        int total=0;
        System.out.print("Enter Row : ");
        r= cin.nextInt();
        System.out.print("Enter Column : ");
        c=cin.nextInt();
        int [][] arr=new int [r][c];
        for(int i=0;i<r;i++){
            System.out.println("Row  "+(i+1));
            for(int j=0;j<c;j++){

                System.out.print(" a["+i+"]["+j+"] : ");
                arr[i][j]=cin.nextInt();
                total+=arr[i][j];
            }
            System.out.println("-------------------------------");
        }
        int i1=1;
        for (int i=0;i<r;i++){
            int totalR=0;
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
                totalR+=arr[i][j];
            }
//            int result;
//            result=totalR;
//            if((totalR>result)){
//
//                i1=1;
//            }else {
//                i1+=1;
//
//            }
//
        System.out.print("\t"+totalR);

           System.out.println("\n");

        }
        for(int  j=0;j<c;j++){
            int totalC=0;
            for(int i=0;i<r;i++){
                totalC+=arr[i][j];
            }
            System.out.print(totalC+"\t");
        }
        System.out.println("\t"+total);
    }
}
