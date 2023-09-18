package javabasics;
import java.util.*;
public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        int n=sc.nextInt();
        int cel;
        cel=((n-32)*5)/9;
        System.out.print("Temperature in celsius: "+cel);
    }
}
