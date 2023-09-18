package G25basic;

import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }

    public static void reverse(int [] arr) {
        int i=0;
        int idx=arr.length-1;
        int [] res = new int[arr.length];
        while (idx>=0)
        {
            res[i]=arr[idx];
            i++;
            idx--;
        }
        arr=res;
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}

