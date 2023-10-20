package ETE;
import java.util.*;
public class kSwaps {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int k=scn.nextInt();
        int  ans=sol(str.toCharArray(),0,k);
        System.out.println(ans);
    }
    public static int  sol(char arr[],int idx,int k)
    {
        if(k==0)
        {
            String str=new String(arr);
            int ans=Integer.parseInt(str) ;
            return ans;
        }
        String s=new String(arr);
        int max=Integer.parseInt(s);
        for(int i=idx+1;i<arr.length;i++)
        {
            if(arr[i]>arr[idx])
            {
                char temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                //swap;
                 int res=sol(arr,idx+1,k-1);
                temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;

           max=Math.max(res,max);
            }
        }

        return max;
    }

}

