package javabasics;
import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("value of 'a' before swap:"+a);
        System.out.println("value of 'b' before swap:"+b);
        int c;
        c=a;
        a=b;
        b=c;

        System.out.println("value of 'a' after swap:"+a);
        System.out.println("value of 'b' after swap:"+b);


    }
}
