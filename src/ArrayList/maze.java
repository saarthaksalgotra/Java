package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class maze {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        ArrayList<String> paths = new ArrayList<>();
        int ans = sol(0, arr.length - 1, 0, arr[0].length - 1, "", paths);

        // Print all paths in a single line
        System.out.println(String.join(" ", paths));

        // Print count on the next line
        System.out.print(ans);
    }

        public static int sol(int cr, int er, int cc, int ec, String ans,ArrayList<String> paths){
            if(cr==er && cc==ec){
                paths.add(ans);
                return 1;
            }
            if(cr>er || cc>ec){
                return 0;
            }
            int count=0;
            //row
            count+=sol(cr+1, er, cc, ec, ans+"V",paths);
            //col
            count+=sol(cr, er, cc+1, ec, ans+"H",paths);
            //diagonal
            if(cr==cc) {
                count += sol(cr + 1, er, cc + 1, ec, ans + "D",paths);
            }
            return count;


        }
}
