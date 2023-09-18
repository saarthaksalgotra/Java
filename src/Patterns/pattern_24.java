package Patterns;

import java.util.Scanner;

public class pattern_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstar=1;
        int leftspace=n-1;
        while(row<=n)
        {
            int spc=1;
            while(spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            while(str<=cntstar)
            {
                System.out.print(row+" ");
                str++;
            }
            row++;
            cntstar=cntstar+2;
            leftspace--;
            System.out.println();
        }
    }
}
