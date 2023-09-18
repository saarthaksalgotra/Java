package Patterns;

import java.util.Scanner;

public class pattern_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int leftspace=n-1;
        int cntstar=1;
        while(row<=n)
        {
            int spc=1;
            while(spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            int pos=1;
            while(str<=cntstar)
            {

                System.out.print(pos+" ");
                str++;
                pos++;
            }
            row++;
            cntstar=cntstar+2;
            leftspace--;
            System.out.println();
        }
    }
}
