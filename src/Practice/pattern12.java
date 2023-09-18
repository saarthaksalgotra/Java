package Practice;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        while (row<=n)
        {
            int spc=1;
            while (spc<=n-row)
            {
                System.out.print(" ");
                spc++;
            }
            int str=1;
            while (str<=row)
            {
                System.out.print("* ");
                str++;
            }
            System.out.println();
            row++;
        }
    }
}
