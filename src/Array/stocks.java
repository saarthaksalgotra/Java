package Array;
import java.util.*;
public class stocks {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print(maxprofit(arr));
    }

    public static int maxprofit(int[] arr)
    {
        int profit=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                profit=Math.max(arr[j]-arr[i],profit);
            }
        }
        return profit;
    }
}