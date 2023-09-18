package Practice;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        while(row<=n){
            int col=row;
            while(col>=1)
            {
                System.out.print(col);
                col--;
            }
            row++;
            System.out.println();

        }
    }
}
