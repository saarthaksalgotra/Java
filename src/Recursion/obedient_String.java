package Recursion;
import java.util.*;
public class obedient_String {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr=str.toCharArray();
        boolean res=sol(arr,0);
        System.out.print(res);
    }
    public static boolean sol(char[] arr,int idx)
    {
        if(idx==arr.length)
        {
            return true;
        }

        if(arr[idx]=='b')
        {
            if(idx<arr.length-1 && arr[idx+1]=='b')
            {
                return sol(arr,idx+2);
            }
            else
            {
                return false;
            }
        }
        return sol(arr,idx+1);
    }
}
