package Patterns;

import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstr=1;
        int leftspace=n-1;
        int middlespace=n-3;
        while (row<=n)
        {
            int spc=1;
            while (spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }

                System.out.print("* ");

            if(row<n/2+1)
            {
                leftspace--;
                cntstr=cntstr+2;
            }
            else
            {
                leftspace++;
                cntstr=cntstr-2;
            }
            row++;
            System.out.println();
        }
    }
}
