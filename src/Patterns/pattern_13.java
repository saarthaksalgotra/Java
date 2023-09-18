package Patterns;

import java.util.Scanner;
public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstar=1;
        while(row<=(2*n-1))
        {
            int str=1;
            while(str<=cntstar)
            {
                System.out.print("* ");
                str++;
            }
            if(row<n)
            {
                cntstar++;
            }
            else
            {
                cntstar--;
            }
            row++;
            System.out.println();
        }
    }
}
