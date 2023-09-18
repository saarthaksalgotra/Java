package Backtracking;

public class permutations {
    public static void main(String[] args) {
        String str="abc";
        boolean arr[]=new boolean[str.length()];
        sol(str,arr,"");
    }

    public static void sol(String str,boolean arr[], String ans)
    {
        if(ans.length()==str.length())
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==false)
            {
                arr[i]=true;
                sol(str,arr,ans+str.charAt(i));
                arr[i]=false;     //backtrack
            }
        }

    }
}
