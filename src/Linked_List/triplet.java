package Linked_List;

import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        int z=sc.nextInt();

        int[] arr1=new int[x];
        int[] arr2=new int[y];
        int[] arr3=new int[z];

        //arr1
        for(int i=0;i<x;i++)
        {
            arr1[i]= sc.nextInt();
        }
        //arr2
        for(int i=0;i<y;i++)
        {
            arr2[i]= sc.nextInt();
        }
        //arr3
        for(int i=0;i<z;i++)
        {
            arr3[i]= sc.nextInt();
        }
        int trgt= sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] + arr2[j] + arr3[k] == trgt) {
                            System.out.println(arr1[i] + " " + arr2[j] + " " + arr3[k]);
                    }
                }
            }
        }
    }
}
