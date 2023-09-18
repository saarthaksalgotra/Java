package Practice;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //upper half
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
            while (str<=row+1)
            {
                System.out.print("* ");
                str=str+2;
            }
            row++;
            System.out.println();
        }
    }
}
