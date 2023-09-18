package Recursion;
import java.util.*;
public class nth_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sol(n));
    }
    public static int sol(int num){
        if (num == 1) {
            return 1;
        }
        else {
            return num + sol(num - 1);
        }

    }
}
