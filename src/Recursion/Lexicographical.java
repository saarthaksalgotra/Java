package Recursion;
import java.util.*;
public class Lexicographical {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("0 ");
        for(int i=1;i<10;i++)
        {
            sol(i,num);
        }
    }
    public static void sol(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        for(int j=0;j<10;j++)
        {
            sol(10*i+j,n);
        }
    }
}
