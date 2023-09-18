package String;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String str="ABABA";
        boolean ans = isPalindrome(str);
        System.out.print(ans);
    }
    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while (i<j)
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            if(ch1 != ch2)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
