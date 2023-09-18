package Patterns;

import java.util.Scanner;
public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int exception_row = (n / 2) + 1;
        int leftspace = 0;
        int midspace = n - 2;
        while (row <= n) {

            if (row == exception_row) {
                int spaces = 0;
                while (spaces < leftspace) {
                    System.out.print("  ");
                    spaces++;
                }
                System.out.print("* ");
                System.out.println();
            } else {
                int spaces = 0;
                while (spaces < leftspace) {
                    System.out.print("  ");
                    spaces++;
                }
                System.out.print("* ");
                int middle=1;
                while (middle<=midspace){
                    System.out.print("  ");
                    middle++;
                }
                System.out.print("* ");
                System.out.println();
            }
            if(row<exception_row){
                leftspace++;
                midspace=midspace-2;
            }
            else{
                leftspace--;
                midspace=midspace+2;
            }
            row++;
        }
    }
    }