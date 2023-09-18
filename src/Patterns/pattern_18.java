package Patterns;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstar=1;
        int leftspace=n-1;
        while (row<=n)
        {
            int spc=1;
            while (spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            while (str<=cntstar)
            {
                System.out.print("* ");
                str++;
            }
            if(row<n/2+1)
            {
                leftspace--;
                cntstar=cntstar+2;
            }
            else
            {
                leftspace++;
                cntstar=cntstar-2;
            }
            row++;
            System.out.println();
        }
    }
}
