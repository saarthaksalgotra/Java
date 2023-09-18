package Recursion;
import java.util.*;
public class subset_target {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr= new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        int res=sol(arr,0,0,"",target);
        System.out.println();
        System.out.print(res);
    }

    public static int sol(int[] arr,int idx,int sum,String ans,int target)
    {

        if(sum==target)
        {
            System.out.print(ans+" ");
            return 1;
        }

        if(arr.length==idx||sum>target)
        {
            return 0;
        }
        int cnt=0;
        //include
        cnt+=sol(arr,idx+1,sum+arr[idx],ans+arr[idx]+" ",target);
        //not include
        cnt+=sol(arr,idx+1,sum,ans,target);
        return cnt;

    }
}
