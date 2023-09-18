package Recursion;

public class lastidx {
    public static void main(String[] args) {
        int [] arr={1,1,2,1,2,1};
        int val=1;
        System.out.print(last(arr,val,arr.length-1));
    }
    public static int last(int [] arr, int val, int idx)
    {
        if(idx<0)
        {
            return -1;
        }
        if(arr[idx]==val)
        {
            return idx;
        }
        return last(arr,val,idx-1);
    }
}
