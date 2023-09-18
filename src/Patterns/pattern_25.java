package Patterns;

import java.util.Scanner;
public class pattern_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstr=1;
        int leftspace=n-1;
        int value=1;
        while(row<=n)
        {
            int spc=1;
            while(spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            while(str<=cntstr)
            {
                System.out.print(value+" ");
                str++;
                value++;
            }
            row++;
            leftspace--;
            cntstr=cntstr+2;
            System.out.println();
        }
    }
}
