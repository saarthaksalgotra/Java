package Recursion;

import java.util.Scanner;

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sol(num,0,0,"");
    }
    public static void sol(int n,int ob, int cb , String ans)
    {
        if(ob>n || cb>n || cb>ob)
        {
            return;
        }
        if(ob+cb==2*n)
        {
            System.out.println(ans);
            return;
        }


        sol(n,ob+1,cb,ans+'(');
        sol(n,ob,cb+1,ans+')');
    }
}
