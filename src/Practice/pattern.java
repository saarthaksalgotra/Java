package Practice;

import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();

        // Printing the top half of the pattern
        for (int i = 1; i <= N; i++) {
            // Print spaces for the left side of the pattern
            for (int j = 1; j <= (N - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print numbers in decreasing order (excluding 1)
            num -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }

        // Printing the bottom half of the pattern
        for (int i = N - 1; i >= 1; i--) {
            // Print spaces for the left side of the pattern
            for (int j = 1; j <= (N - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print numbers in decreasing order (excluding 1)
            num -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }
}
