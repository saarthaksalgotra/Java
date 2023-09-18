package Recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fh=fibo(n-1);
        int sh=fibo(n-2);
        int ans=fh+sh;
        return ans;
    }
}
