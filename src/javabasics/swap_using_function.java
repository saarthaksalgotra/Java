package javabasics;
import java.util.*;

public class swap_using_function {
    int a,b;
    public static void swap(swap_using_function obj) {


        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;

    }
    public static void main(String[] args) {
        swap_using_function obj=new swap_using_function();
        Scanner sc=new Scanner(System.in);
        obj.a= sc.nextInt();
        obj.b= sc.nextInt();

        System.out.println("value of 'a' before swap: "+obj.a);
        System.out.println("value of 'b' before swap: "+obj.b);

        obj.swap(obj);

        System.out.println("value of 'a' after swap: "+obj.a);
        System.out.println("value of 'b' after swap: "+obj.b);



    }
}
