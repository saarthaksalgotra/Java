package Recursion;

public class subsequence {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        sol(arr,0,"");
    }
    public static void sol(int[] arr,int idx,String ans)
    {
        if(arr.length==idx)
        {
            System.out.println(ans);
            return;
        }
        sol(arr,idx+1,ans+arr[idx]+" ");  // ans included
        sol(arr,idx+1,ans);  // ans not included
    }
}
