package javabasics;
import java.util.*;
public class mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        int sum=0,mean;
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
        }
        mean=sum/n;
        System.out.print("mean value: "+mean);
    }
}
