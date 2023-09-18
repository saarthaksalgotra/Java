package javabasics;
import  java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,c;
        int arm=0;
        c=num;

        while (num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;
        }
        if(c==arm)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("Not Armstrong");
        }
    }
}
