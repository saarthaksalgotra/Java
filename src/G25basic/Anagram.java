package G25basic;
import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s","").toLowerCase();
        t = t.replaceAll("\\s","").toLowerCase();

        if(s.length()!=t.length())
        {
            return false;
        }

        char [] CharArrayS = s.toCharArray();
        char [] CharArrayT = t.toCharArray();

        Arrays.sort(CharArrayS);
        Arrays.sort(CharArrayT);

        return Arrays.equals(CharArrayS, CharArrayT);
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if(isAnagram(s,t))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}

