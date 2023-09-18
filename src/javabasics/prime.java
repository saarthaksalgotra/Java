package javabasics;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int i=2;
        while(true)
        {
            if(i==1)
            {
                System.out.print("smallest prime number is 2");
                break;
            }
            if(a%i==0)
            {
                break;
            }
            else {
                i++;
            }

        }
        if(a==i)
        {
            System.out.print("prime number");
        }
        else
        {
            System.out.print("not prime");
        }
    }
}
