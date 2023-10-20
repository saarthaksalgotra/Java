package String;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = sol(str);
        System.out.println(result);
    }

    public static String sol(String str) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else {
                ans.append(Character.toUpperCase(ch));
            }
        }

        return ans.toString();
    }
}
