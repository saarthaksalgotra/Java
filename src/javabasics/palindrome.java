package javabasics;
import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rem,c;
        c=num;
        int sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(c==sum)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    }
}
