package G25basic;

import java.util.Scanner;

public class subarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr ={5,4,-1,7,8};
        int res=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i;j< arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(res<sum) {
                    res = sum;
                }
            }
        }
        System.out.println(res);
    }
}
