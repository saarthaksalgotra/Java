package Recursion;
import java.util.*;
public class ascii {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char[] arr= str.toCharArray();
        int res=sol(arr,0,"");
        System.out.println();
        System.out.print(res);
    }
    public static int sol(char[] arr,int idx,String ans)
    {
        if(idx==arr.length)
        {
            System.out.print(ans+" ");
            return 1;
        }

        int count=0;
        count+=sol(arr,idx+1,ans); //exclude
        count+=sol(arr,idx+1,ans+arr[idx]);//include
        count+=sol(arr,idx+1,ans+(int)arr[idx]);//ascii
        return count;
    }
}
