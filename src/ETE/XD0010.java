package ETE;

import java.util.Scanner;

public class XD0010 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test>0)
        {

            String str=sc.nextLine();
            int res=check(str);
            System.out.println(res);
            test--;
        }
    }

    public static int check(String str)
    {
        int count00=0;
        int count10=0;



        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='0')
            {
                if(i>0 && str.charAt(i-1)=='1')
                {
                    count10++;
                }
                else
                {
                    count00++;
                }
            }

            if(count00==0)
            {
                return str.length();
            }
        }

        return Math.min(count00,count10) + 1;
    }
}