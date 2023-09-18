package Patterns;

import java.util.Scanner;
public class pattern_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        while(row<=n){
            int space=1;
            while(space<=row-1)
            {
                System.out.print("  ");
                space++;
            }
            int star=1;
            while(star<=(2*(n-row)+1))
            {
                System.out.print("* ");
                star++;
            }
            row++;
            System.out.println();

        }
    }
}
