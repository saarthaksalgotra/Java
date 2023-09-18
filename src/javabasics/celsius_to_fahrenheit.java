package javabasics;
import java.util.*;
public class celsius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        int n= sc.nextInt();
        int fahren;
        fahren=(n*9/5 +32);
        System.out.print("Temperature in Fahrenheit: "+fahren );
    }
}
