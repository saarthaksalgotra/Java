package Recursion;
import java.util.*;
public class whatinparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = sol(input);
        System.out.println(result);
    }

    public static String sol(String input) {
        int startIndex = input.indexOf('(');
        int endIndex = input.indexOf(')');

        if (startIndex == -1 || endIndex == -1 || startIndex >= endIndex) {
            // Parentheses not found or in incorrect order
            return "";
        }

        return input.substring(startIndex + 1, endIndex);
    }
}
