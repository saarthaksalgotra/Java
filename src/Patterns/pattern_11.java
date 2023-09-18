package Patterns;

import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int cntstar = 1;
        int leftspace = n - 1;
        while (row<=n)
        {
            int spaces=1;
            while (spaces<=leftspace)
            {
                System.out.print("  ");
                spaces++;
            }
            int str=1;
            while(str<=cntstar)
            {
                if(str%2==0)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
                str++;
            }
            row++;
            leftspace--;
            cntstar=cntstar+2;
            System.out.println();
        }
    }
}
