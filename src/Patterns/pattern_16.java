package Patterns;

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstar=n;
        int leftspace=n-1;
        while(row<=(2*n-1))
        {
            int spc=0;
            while(spc<=leftspace)
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
                leftspace=leftspace-1;
                cntstar--;
            }
            else
            {
                leftspace=leftspace+1;
                cntstar++;
            }
            row++;
            System.out.println();
        }
    }
}
