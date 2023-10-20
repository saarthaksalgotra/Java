package String;

import java.util.*;

public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        sol(str);
        if(sol(str)==true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static boolean sol(String str)
    {
        boolean digit=false;
        boolean upper=false;
        boolean lower=false;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                digit=true;
            }
            else if (Character.isUpperCase(ch))
            {
                upper=true;
            }
            else if (Character.isLowerCase(ch))
            {
                lower=true;
            }
            return true;
        }
        return false;
    }
}
