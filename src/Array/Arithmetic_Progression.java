package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic_Progression {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i=0;i<n;i++)
        {
            if(arr[i+1]-arr[i]==arr[i+2]-arr[i+1])
            {
                System.out.print("Yes");
                break;
            }
            else
            {
                System.out.print("No");
                break;
            }
        }
    }
}
