package ETE;

import java.util.Scanner;

public class mesageProcessing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll(" ","");
        convert(str);
    }
    public static void convert(String str)
    {
        str=str.toUpperCase();
        char ch=str.charAt(0);
        String rem=str.substring(1);
        rem=rem.toLowerCase();
        System.out.print(ch+rem);
    }
}
