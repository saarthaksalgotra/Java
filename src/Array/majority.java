package Array;
import java.util.*;
public class majority{

    public static int majorityElement(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>n/2)
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int ans = majorityElement(arr,n);
        System.out.print(ans);
    }
}