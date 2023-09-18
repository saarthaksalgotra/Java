package Patterns;

import java.util.Scanner;
public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int cntstar = 1;
        int leftspace = n - 1;
        while (row <= n) {
            int space=1;
            while(space<=leftspace){
                System.out.print("  ");
                space++;
            }
            int str=1;
            while(str<=cntstar){
                System.out.print("* ");
                str++;
            }
            leftspace--;
            cntstar=cntstar+2;
            row++;
            System.out.println();
        }
    }
}