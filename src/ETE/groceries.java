package ETE;

import java.util.Scanner;

public class groceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();   // no of elemensts
            int x=sc.nextInt();   // expiry date

            int[] fresh = new int[n];
            int[] cost = new int[n];

            for(int i=0;i<n;i++)
            {
                fresh[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                cost[i]=sc.nextInt();
            }

            int total=check(fresh,cost,n,x);
            System.out.print(total);
            test--;
        }

    }
    public static int check(int[] fresh,int[] cost,int n,int x)
    {
        int total=0;
        for(int i=0;i<n;i++)
        {
            if(fresh[i]>=x)
            {
                total+=cost[i];
            }
        }
        return total;
    }
}
