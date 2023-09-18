package javabasics;
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rem;
        int sum=0;
        while (num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.print(sum);
    }
}
