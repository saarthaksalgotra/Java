package G25basic;

public class subarraysumkadence {
    public static void main(String[] args) {
        int [] arr = {-8,7,6,4,-40,0};
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans= Math.max(ans,sum);
            if(sum<0) {
                sum = 0;
            }
        }
        System.out.print(ans);
    }

}
