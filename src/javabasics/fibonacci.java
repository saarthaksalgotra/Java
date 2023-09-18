package javabasics;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int a=0;
        int b=1;
        int res=0;
        while (num>1)
        {
            System.out.print(a+" ");
            res=a+b;
            a=b;
            b=res;
            num--;
        }
    }
}
