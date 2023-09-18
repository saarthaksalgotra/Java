package G25basic;

import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]= sc.nextInt();  // --> array input
        }

        for(int i=1;i< size;i++)
        {
            int temp = arr[i];
            int j=i-1;
            while (j>=0)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }

        for(int i=0;i< size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
