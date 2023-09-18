package ArrayList;
import java.util.*;
public class keypad {
    public static  int count = 0;

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    sol(str,"");
    System.out.print("\n"+count);
}

    public static void sol(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch = str.charAt(0);
        String keys = getString(ch);
        for (int i = 0; i < keys.length(); i++) {
            sol(str.substring(1), ans + keys.charAt(i));
        }
    }

    public static String getString(char ch) {
        if (ch == '1') {
            return "abc";
        }
        if (ch == '2') {
            return "def";
        }
        if (ch == '3') {
            return "ghi";
        }
        if(ch=='4'){
            return "jkl";
        }
        if(ch=='5'){
            return "mno";
        }
        if(ch=='6'){
            return "pqrs";
        }
        if(ch=='7'){
            return "tuv";
        }
        if(ch=='8'){
            return "wx";
        }
        if(ch=='9'){
            return "yz";
        }
        return null;
    }
}
