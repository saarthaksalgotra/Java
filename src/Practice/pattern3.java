package Practice;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
