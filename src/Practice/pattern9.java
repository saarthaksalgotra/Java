package Practice;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n)
        {
            int col=1;
            while(col<=row)
            {
                    System.out.print(col);      //upper
                    col++;
            }
            row++;
            System.out.println();
        }
        row = n-1;
        while(row>=1)
        {
            int col=1;
            while(col<=row)
            {
                System.out.print(col);      //lower
                col++;
            }
            row--;
            System.out.println();
        }
    }
}
