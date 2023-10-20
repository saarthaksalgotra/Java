package ETE;

import java.util.Scanner;

public class removeDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String ans=sol(str);
        System.out.print(ans);
    }
    public static String sol(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }

        if(str.charAt(0)==str.charAt(1))
        {
            return sol(str.substring(1));
        }
        else
        {
            return str.charAt(0)+sol(str.substring(1));
        }
    }
}
