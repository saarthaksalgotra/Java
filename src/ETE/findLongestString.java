package ETE;

import java.util.Scanner;

public class findLongestString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

        String[] arr=str.split(" ");

        int maxlength=check(arr,0);
        System.out.print(maxlength);
    }
    public static int check(String[] arr,int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx].length();
        }
        int currenlength=arr[idx].length();
        int maxlength=check(arr,idx+1);
        return Math.max(currenlength,maxlength);
    }
}
