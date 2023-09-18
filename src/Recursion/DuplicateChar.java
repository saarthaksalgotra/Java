package Recursion;

public class DuplicateChar {
    public static void main(String[] args) {
        String input = "Saarthak";
        String result = separateDuplicates(input);
        System.out.println(result);
    }

    public static String separateDuplicates(String input) {
        if (input.length() <= 1) {
            return input;
        }

        char firstChar = input.charAt(0);
        String restOfString = separateDuplicates(input.substring(1));

        if (firstChar == restOfString.charAt(0)) {
            return firstChar + "*" + restOfString.substring(0);
        } else {
            return firstChar + restOfString;
        }
    }
}
