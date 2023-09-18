package Patterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int leftspace=n-1;
        int cntstar=1;
        while(row<=(2*n-1))
        {
            int spc=1;
            while (spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            while(str<=cntstar)
            {
                System.out.print("* ");
                str++;
            }
            if(row<n)
            {
                leftspace--;
                cntstar++;
            }
            else
            {
                leftspace++;
                cntstar--;
            }
            row++;
            System.out.println();
        }
    }
}
