package ETE;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input string
        String str=sc.nextLine();

        // Reverse the string
        String reversedString = reverseString(str);

        // Print the reversed string
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        // Convert the input string to a StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // Use the reverse() method to reverse the string
        sb.reverse();

        // Convert the StringBuilder back to a string
        return sb.toString();
    }

}
