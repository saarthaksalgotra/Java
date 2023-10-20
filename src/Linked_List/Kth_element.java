package Linked_List;
import java.util.*;
public class Kth_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] list = new int[m];
        int res = 0;
        int pro = 0;

        // arr 1
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            res = res * 10 + arr[i];
        }
        // arr 2
        for (int i = 0; i < m; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            pro = pro * 10 + list[i];
        }

        int ans = res + pro;

        sol(ans);
    }
    public static void sol(int ans) {
        String str = Integer.toString(ans);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
