package Recursion;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases

        // Process each test case
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            char[] arr=str.toCharArray();
            sol(arr,0,"");
        }


    }
    public static void sol(char[] arr,int idx,String ans)
    {
        if(idx== arr.length)
        {
            System.out.print(ans+" ");
            return;
        }
        if(arr[idx]=='?')
        {
            sol(arr,idx+1,ans+"0");
            sol(arr,idx+1,ans+"1");
        }
        else
        {
            sol(arr,idx+1,ans+arr[idx]);
        }
    }
}
