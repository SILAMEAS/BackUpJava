package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);


        ArrayList<People> ful = new ArrayList();
        System.out.print("N : ");
        int n;
        n=cin.nextInt();

        for (int i = 0; i < n; i++) {
            People b = new People();
            b.Input();

            ful.add(b);
        }
//        People c=new People();
        System.out.print("ID for delete : ");
        int jf;
        jf=cin.nextInt();
        for(int i=0;i<ful.size();i++){
            if(jf==ful.get(i).getId()){
                ful.remove(i);
            }
        }

        for (People temp:ful) {
            temp.show();
        }
    }
}
