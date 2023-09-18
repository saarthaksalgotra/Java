package javabasics;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int fact=1;
        int i=1;
        while (num>=i)
        {
            fact=fact*i;
            i++;
        }
        System.out.print(fact);





    }
}
