package Practice;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        //upper
        int row=1;
        while(row<n)
        {
            int col=1;
            while(col<=n+1-row)
            {
                System.out.print(col);
                col++;
            }
            row++;
            System.out.println();
        }
        //lower
        row=1;
        while(row<=n)
        {
            int col=1;
            while (col<=row)
            {
                System.out.print(col);
                col++;
            }
            row++;
            System.out.println();
        }
    }
}

