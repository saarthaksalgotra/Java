package javabasics;

import java.util.Scanner;

public class printprime {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<num;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;     // 1 and 0 are not prime
        }

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
