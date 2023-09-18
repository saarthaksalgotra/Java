package G25basic;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        if(n%2==0)
        {
            System.out.print("even");
        }
        else if (n%3==0)
        {
            System.out.print("odd and divisible by 3");
        }
        else
        {
            System.out.print("odd and not divisible by 3");
        }
    }
}
