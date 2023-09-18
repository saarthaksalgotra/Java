package javabasics;
import java.util.*;
public class swap_without_variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("value of 'a' after swap:"+a);
        System.out.print("value of 'b' after swap:"+b);

    }
}
