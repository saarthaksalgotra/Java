package Recursion;

public class prog1 {
    public static boolean find(int[] arr,int val, int idx){
        if(idx>= arr.length)        //base case
        {
            return false;
        }
        if (arr[idx]==val)
        {
            return true;
        }
        boolean ans = find(arr, val, idx + 1);
        return ans;

    }

    public static void main(String[] args) {
        int [] arr = {1,8,17,20};
        int val=16;
        boolean result = find(arr,val,0);
        if(result)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
