import java.util.Scanner;

public class multiple_array_input_different_column {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int r,max=0;
        System.out.print("Enter row : ");
        r= cin.nextInt();
        int [][] arr=new int [r][];
        int total=0;

        for(int i=0;i<r;i++){
            System.out.println("===============================");
            System.out.print("Enter Column "+(i+1)+" : ");

            int in;
            in=cin.nextInt();
            if(max<in)
                max=in;

            System.out.println("===============================");

            arr[i] = new int[in];

            System.out.println("Column "+(i+1));

            for(int j=0;j<in;j++){

                System.out.print("Enter a["+i+"]["+j+"] : ");
                arr[i][j]= cin.nextInt();
                total+=arr[i][j];

            }
        }
        for(int i=0;i<r;i++){
            int totalR=0;
            for(int j=0;j<max;j++){
                if(j<arr[i].length){
                    System.out.print(arr[i][j]+"\t\t");
                    totalR+=arr[i][j];
                }

                else
                    System.out.print("\t\t");



            }
            System.out.print(totalR+"\n");

        }

        for(int j=0;j<max;j++){
            int totalC=0;
            for(int i=0;i<r;i++){
               if(j<arr[i].length){

                   totalC+=arr[i][j];

               }


            }
            System.out.print(totalC+"\t\t");

        }
        System.out.print(total);


    }



}





// do by me
/*

 public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int r;
        System.out.print("Enter row : ");
        r= cin.nextInt();
        int [][] arr=new int [r][];
        int [] a=new int[30];
        for(int i=0;i<r;i++){
            System.out.println("===============================");
            System.out.print("Enter Column "+(i+1)+" : ");

            int in;
            in=cin.nextInt();
            System.out.println("===============================");
            a[i]=in;
            arr[i] = new int[in];

            System.out.println("Column "+(i+1));
            for(int j=0;j<in;j++){

                System.out.print("Enter a["+i+"]["+j+"] : ");
                arr[i][j]= cin.nextInt();


            }
        }
        for(int i=0;i<r;i++){
            int totalR=0;
            for(int j=0;j<a[i];j++){
                System.out.print("\t\t"+arr[i][j]+"\t\t");
                totalR+=arr[i][j];

            }
            System.out.print(totalR+"\n");

        }


    }

 */
