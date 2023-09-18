package Recursion;

public class fact {
    public static void main(String[] args) {
        System.out.print(fact(4));
    }
    public static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int res=n*fact(n-1);
        return res;
    }
}
