package Recursion;
import java.util.*;
public class TowerOfHanoi {
    public static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sol(n,"T1","T3","T2");
        System.out.print(cnt);
    }
    public static void sol(int n,String from_rod, String to_rod , String helper)
    {
        if(n==0)
        {
            return;
        }
        sol(n-1,from_rod,helper,to_rod);
        System.out.println("Move "+n+"th disc from "+from_rod+" to "+to_rod);
        cnt++;
        sol(n-1,helper,to_rod,from_rod);
    }
}
