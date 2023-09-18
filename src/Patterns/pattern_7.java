package Patterns;

import java.util.Scanner;
public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n)
        {
            if(row==1 || row==n)
            {
                int star=1;
                while(star<=n)
                {
                    System.out.print("* ");
                    star++;
                }
                System.out.println();
            }
            else{
                System.out.print("* ");
                int space=1;
                while(space<=(n-2))
                {
                    System.out.print("  ");
                    space++;
                }
                System.out.print("* ");
                System.out.println();
            }
            row++;

        }
    }
}
